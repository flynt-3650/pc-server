package ru.flynt3650.pc_server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.flynt3650.pc_server.models.Pc;
import ru.flynt3650.pc_server.repositories.PcRepository;

import java.util.List;

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
}
