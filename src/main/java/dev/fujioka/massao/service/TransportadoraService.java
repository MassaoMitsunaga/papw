package dev.fujioka.massao.service;

import dev.fujioka.massao.domain.Transportadora;
import dev.fujioka.massao.repository.TransportadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TransportadoraService {
    @Autowired
    private TransportadoraRepository transportadoraRepository;

    public Transportadora save(Transportadora transportadora){
        return transportadoraRepository.save(transportadora);
    }

    public Transportadora findById(Long id){
        return transportadoraRepository
                .findById(id)
                .orElseThrow(NoSuchElementException::new);
    }

    public List<Transportadora> findAll(){
        return transportadoraRepository.findAll();
    }


    public void deleteById(Long id) {
        transportadoraRepository.deleteById(id);
    }
}
