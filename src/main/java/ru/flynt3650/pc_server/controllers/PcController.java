package ru.flynt3650.pc_server.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.flynt3650.pc_server.dto.PcDto;
import ru.flynt3650.pc_server.models.Pc;
import ru.flynt3650.pc_server.services.PcService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pc")
public class PcController {

    private final PcService pcService;
    private final ModelMapper modelMapper;

    @Autowired
    public PcController(PcService pcService, ModelMapper modelMapper) {
        this.pcService = pcService;
        this.modelMapper = modelMapper;
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

    @PatchMapping("/update/{id}")
    public ResponseEntity<HttpStatus> patchPc(@RequestBody PcDto updatedPcDto, @PathVariable("id") Integer id) {
        pcService.update(toPc(updatedPcDto), id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<HttpStatus> postPc(@RequestBody PcDto newPcDto) {
        pcService.save(toPc(newPcDto));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deletePc(@PathVariable("id") Integer id) {
        pcService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private PcDto toPcDto(Pc pc) {
        return modelMapper.map(pc, PcDto.class);
    }

    private Pc toPc(PcDto pcDto) {
        return modelMapper.map(pcDto, Pc.class);
    }
}
