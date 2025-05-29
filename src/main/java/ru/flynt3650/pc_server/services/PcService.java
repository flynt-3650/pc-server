package ru.flynt3650.pc_server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.flynt3650.pc_server.models.pc_components.Pc;
import ru.flynt3650.pc_server.repositories.PcRepository;
import ru.flynt3650.pc_server.util.exceptions.PcNotFoundException;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class PcService {

    @Autowired
    private final PcRepository pcRepository;

    public PcService(PcRepository pcRepository) {
        this.pcRepository = pcRepository;
    }

    public List<Pc> findAll() {
        return pcRepository.findAll();
    }

    public Pc findById(Integer id) {
        return pcRepository
                .findById(id)
                .orElseThrow(() -> new PcNotFoundException("PC with ID " + id + " not found."));
    }

    @Transactional
    public void save(Pc pc) {
        refreshUpdatedAt(pc);
        pcRepository.save(pc);
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

        refreshCreatedAt(pc);
    }

    @Transactional
    public void delete(Integer id) {
        pcRepository.delete(findById(id));
    }

    private void refreshUpdatedAt(Pc pc) {
        pc.setUpdatedAt(LocalDateTime.now());
    }

    private void refreshCreatedAt(Pc pc) {
        pc.setCreatedAt(LocalDateTime.now());
    }
}
