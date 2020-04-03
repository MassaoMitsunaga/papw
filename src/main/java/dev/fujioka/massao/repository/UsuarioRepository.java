package dev.fujioka.massao.repository;

import dev.fujioka.massao.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}

