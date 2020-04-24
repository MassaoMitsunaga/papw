package br.com.massao.projeto_spi_avaliacao_01.service;

import br.com.massao.projeto_spi_avaliacao_01.domain.DepartmentName;
import br.com.massao.projeto_spi_avaliacao_01.repository.DepartmentNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class DepartmentNameService {
    @Autowired
    private DepartmentNameRepository departmentNameRepository;

    public DepartmentName save(DepartmentName departmentName){
        return departmentNameRepository.save(departmentName);
    }

    public DepartmentName findById(Long id){
        return departmentNameRepository
                .findById(id)
                .orElseThrow(NoSuchElementException::new);
    }

    public List<DepartmentName> findAll(){
        return departmentNameRepository.findAll();
    }


    public void deleteById(Long id) {
        departmentNameRepository.deleteById(id);
    }
}

