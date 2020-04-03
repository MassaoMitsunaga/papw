package dev.fujioka.massao.service;

import dev.fujioka.massao.domain.Cliente;
import dev.fujioka.massao.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente findById(Long id){
        return clienteRepository
                .findById(id)
                .orElseThrow(NoSuchElementException::new);
    }

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }


    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }
}
