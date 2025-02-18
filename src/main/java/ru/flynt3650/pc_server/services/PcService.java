package ru.flynt3650.pc_server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.flynt3650.pc_server.models.Pc;
import ru.flynt3650.pc_server.repositories.PcRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class PcService {

    private final PcRepository pcRepository;

    @Autowired
    public PcService(PcRepository pcRepository) {
        this.pcRepository = pcRepository;
    }

    public List<Pc> findAll() {
        return pcRepository.findAll();
    }

    public Pc findById(Integer id) {
        Optional<Pc> pc = pcRepository.findById(id);
        if (pc.isPresent()) {
            return pc.get();
        }
        throw new RuntimeException("PC's ID not found.");
    }

    @Transactional
    public void save(Pc pc) {

        System.out.println(pc);
        if (pc != null) {
            pcRepository.save(pc);
        } else {
            throw new RuntimeException("PC is null.");
        }
    }


    @Transactional
    public void update(Pc newPc, Integer id) {
        Pc pc = findById(id);

        pc.setName(newPc.getName());
        pc.setCpu(newPc.getCpu());
        pc.setGpu(newPc.getGpu());
        pc.setMotherboard(newPc.getMotherboard());
        pc.setRam(newPc.getRam());
        pc.setSsd(newPc.getSsd());
        pc.setHdd(newPc.getHdd());
        pc.setPsu(newPc.getPsu());
        pc.setCasing(newPc.getCasing());
        pc.setCoolingSystem(newPc.getCoolingSystem());
        pc.setNetworking(newPc.getNetworking());
    }

    @Transactional
    public void delete(Integer id) {
        pcRepository.delete(findById(id));
    }

}
