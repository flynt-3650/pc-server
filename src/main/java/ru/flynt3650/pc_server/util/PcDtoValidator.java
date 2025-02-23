package ru.flynt3650.pc_server.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.stereotype.Component;
import ru.flynt3650.pc_server.dto.PcDto;
import ru.flynt3650.pc_server.models.pc_components.Pc;
import ru.flynt3650.pc_server.services.PcService;

import java.util.List;

@Component
public class PcDtoValidator implements Validator {

    private final PcService pcService;

    @Autowired
    public PcDtoValidator(PcService pcService) {
        this.pcService = pcService;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return PcDto.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        PcDto pcDto = (PcDto) target;
        String name = pcDto.getName();

        List<Pc> existingPcs = pcService.findByName(name);
        if (!existingPcs.isEmpty()) {
            errors.rejectValue("name", "", "PC with this name already exists");
        }
    }
}
