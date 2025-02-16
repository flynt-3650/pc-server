package ru.flynt3650.pc_server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.flynt3650.pc_server.models.Pc;
import ru.flynt3650.pc_server.services.PcService;

import java.util.List;

@RestController
@RequestMapping("/pc")
public class PcController {

    private final PcService pcService;

    @Autowired
    public PcController(PcService pcService) {
        this.pcService = pcService;
    }

    @GetMapping
    public List<Pc> getPcs() {
        return pcService.findAll();
    }

    @GetMapping("/{id}")
    public Pc getPcById(@PathVariable("id") Integer id) {
        return pcService.findById(id);
    }
}
