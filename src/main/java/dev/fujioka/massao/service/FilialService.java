package dev.fujioka.massao.service;

import dev.fujioka.massao.domain.Filial;
import dev.fujioka.massao.repository.FilialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class FilialService {
    @Autowired
    private FilialRepository filialRepository;

    public Filial save(Filial filial){
        return filialRepository.save(filial);
    }

    public Filial findById(Long id){
        return filialRepository
                .findById(id)
                .orElseThrow(NoSuchElementException::new);
    }

    public List<Filial> findAll(){
        return filialRepository.findAll();
    }


    public void deleteById(Long id) {
        filialRepository.deleteById(id);
    }
}
