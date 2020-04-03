package dev.fujioka.massao.service;

import dev.fujioka.massao.domain.Produto;
import dev.fujioka.massao.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto save(Produto produto){
        return produtoRepository.save(produto);
    }

    public Produto findById(Long id){
        return produtoRepository
                .findById(id)
                .orElseThrow(NoSuchElementException::new);
    }

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }


    public void deleteById(Long id) {
        produtoRepository.deleteById(id);
    }
}

