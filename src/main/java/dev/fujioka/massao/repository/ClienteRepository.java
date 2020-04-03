package dev.fujioka.massao.repository;

import dev.fujioka.massao.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}

