package br.com.massao.projeto_spi_avaliacao_01.service;

import br.com.massao.projeto_spi_avaliacao_01.domain.Project;
import br.com.massao.projeto_spi_avaliacao_01.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProjectService {
        @Autowired
        private ProjectRepository projectRepository;

        public Project save(Project project){
            return projectRepository.save(project);
        }

        public Project findById(Long id){
            return projectRepository
                    .findById(id)
                    .orElseThrow(NoSuchElementException::new);
        }

        public List<Project> findAll(){
            return projectRepository.findAll();
        }


        public void deleteById(Long id) {
            projectRepository.deleteById(id);
        }
    }

