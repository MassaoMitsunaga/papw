package br.com.massao.projeto_spi_avaliacao_01.service;

import br.com.massao.projeto_spi_avaliacao_01.domain.ProjectHistory;
import br.com.massao.projeto_spi_avaliacao_01.repository.ProjectHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProjectHistoryService {
    @Autowired
    private ProjectHistoryRepository projectHistoryRepository;

    public ProjectHistory save(ProjectHistory projectHistory){
        return projectHistoryRepository.save(projectHistory);
    }

    public ProjectHistory findById(Long id){
        return projectHistoryRepository
                .findById(id)
                .orElseThrow(NoSuchElementException::new);
    }

    public List<ProjectHistory> findAll(){
        return projectHistoryRepository.findAll();
    }


    public void deleteById(Long id) {
        projectHistoryRepository.deleteById(id);
    }
}

