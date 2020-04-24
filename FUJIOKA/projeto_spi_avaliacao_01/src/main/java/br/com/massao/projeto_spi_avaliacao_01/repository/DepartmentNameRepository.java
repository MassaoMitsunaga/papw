package br.com.massao.projeto_spi_avaliacao_01.repository;

import br.com.massao.projeto_spi_avaliacao_01.domain.DepartmentName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentNameRepository extends JpaRepository<DepartmentName, Long> {

}
