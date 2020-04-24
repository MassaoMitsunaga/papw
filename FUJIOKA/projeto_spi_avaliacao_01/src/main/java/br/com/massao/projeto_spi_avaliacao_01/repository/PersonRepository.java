package br.com.massao.projeto_spi_avaliacao_01.repository;

import br.com.massao.projeto_spi_avaliacao_01.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
