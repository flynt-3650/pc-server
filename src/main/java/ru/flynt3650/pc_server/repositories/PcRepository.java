package ru.flynt3650.pc_server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.flynt3650.pc_server.models.Pc;

@Repository
public interface PcRepository extends JpaRepository<Pc, Integer> {
}
