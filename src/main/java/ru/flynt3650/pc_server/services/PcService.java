package ru.flynt3650.pc_server.services;

import org.springframework.beans.factory.annotation.Autowired;
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
}
