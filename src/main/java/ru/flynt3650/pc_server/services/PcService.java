package ru.flynt3650.pc_server.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.flynt3650.pc_server.models.Pc;
import ru.flynt3650.pc_server.repositories.PcRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class PcService {

    private final PcRepository pcRepository;

    @Autowired
    public PcService(PcRepository pcRepository, ModelMapper modelMapper) {
        this.pcRepository = pcRepository;
    }

    public List<Pc> findAll() {
        return pcRepository.findAll();
    }

    public Pc findById(Integer id) {
        return pcRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("PC's ID not found."));
    }

    public List<Pc> findByName(String name) {
        return pcRepository.findByName(name);
    }

    @Transactional
    public void save(Pc pc) {
        if (pc != null) {
            updateExistingPc(pc);
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
        updateExistingPc(pc);
    }

    @Transactional
    public void delete(Integer id) {
        pcRepository.delete(findById(id));
    }

    private void updateExistingPc(Pc pc) {
        pc.setUpdatedAt(LocalDateTime.now());
    }

    private void createPc(Pc pc) {
        pc.setCreatedAt(LocalDateTime.now());
    }
}
