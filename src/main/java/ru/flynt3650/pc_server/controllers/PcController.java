package ru.flynt3650.pc_server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    @PatchMapping("/update/{id}")
    public ResponseEntity<HttpStatus> patchPc(@RequestBody Pc newPc, @PathVariable("id") Integer id) {
        pcService.update(newPc, id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<HttpStatus> postPc(@RequestBody Pc newPc) {
        pcService.save(newPc);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deletePc(@PathVariable("id") Integer id) {
        pcService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
