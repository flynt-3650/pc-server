package ru.flynt3650.pc_server.controllers;

import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import ru.flynt3650.pc_server.dto.PcDto;
import ru.flynt3650.pc_server.models.pc_components.Pc;
import ru.flynt3650.pc_server.services.PcService;
import ru.flynt3650.pc_server.util.PcDtoValidator;
import ru.flynt3650.pc_server.util.exceptions.PcNotSavedException;
import ru.flynt3650.pc_server.util.exceptions.PcNotUpdatedException;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pc")
public class PcController {

    private final PcService pcService;
    private final ModelMapper modelMapper;
    private final PcDtoValidator pcDtoValidator;

    @Autowired
    public PcController(PcService pcService, ModelMapper modelMapper, PcDtoValidator pcDtoValidator) {
        this.pcService = pcService;
        this.modelMapper = modelMapper;
        this.pcDtoValidator = pcDtoValidator;
    }

    @GetMapping
    public List<PcDto> getPcs() {
        return pcService
                .findAll()
                .stream()
                .map(this::toPcDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public PcDto getPcById(@PathVariable("id") Integer id) {
        return toPcDto(pcService.findById(id));
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PatchMapping("/update/{id}")
    public ResponseEntity<String> patchPc(@RequestBody @Valid PcDto updatedPcDto, @PathVariable("id") Integer id,
                                              BindingResult bindingResult) {

        pcDtoValidator.validate(updatedPcDto, bindingResult);

        if (bindingResult.hasErrors()) {
            StringBuilder errorMessage = new StringBuilder();

            List<FieldError> errors = bindingResult.getFieldErrors();
            for (var error : errors)
                errorMessage
                        .append(error.getField())
                        .append(" - ")
                        .append(error.getDefaultMessage())
                        .append("; ");

            throw new PcNotUpdatedException(errorMessage.toString());
        }

        pcService.update(toPc(updatedPcDto), id);
        return ResponseEntity.ok().body("PC updated successfully");
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("/save")
    public ResponseEntity<String> postPc(@RequestBody @Valid PcDto newPcDto, BindingResult bindingResult) {

        pcDtoValidator.validate(newPcDto, bindingResult);

        if (bindingResult.hasErrors()) {
            StringBuilder errorMessage = new StringBuilder();

            List<FieldError> errors = bindingResult.getFieldErrors();
            for (var error : errors)
                errorMessage
                        .append(error.getField())
                        .append(" - ")
                        .append(error.getDefaultMessage())
                        .append("; ");

            throw new PcNotSavedException(errorMessage.toString());
        }

        pcService.save(toPc(newPcDto));
        return ResponseEntity.ok().body("PC created successfully");
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletePc(@PathVariable("id") Integer id) {
        pcService.delete(id);
        return ResponseEntity.ok().body("PC deleted successfully");
    }

    private PcDto toPcDto(Pc pc) {
        return modelMapper.map(pc, PcDto.class);
    }

    private Pc toPc(PcDto pcDto) {
        return modelMapper.map(pcDto, Pc.class);
    }
}
