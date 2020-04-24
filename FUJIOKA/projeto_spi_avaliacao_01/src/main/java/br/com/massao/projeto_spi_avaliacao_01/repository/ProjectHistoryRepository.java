package br.com.massao.projeto_spi_avaliacao_01.repository;

import br.com.massao.projeto_spi_avaliacao_01.domain.ProjectHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectHistoryRepository extends JpaRepository<ProjectHistory, Long> {

}
