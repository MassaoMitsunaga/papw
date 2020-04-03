package dev.fujioka.massao.webRest;

import dev.fujioka.massao.domain.Produto;
import dev.fujioka.massao.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoRest {
    
    @Autowired
    private ProdutoService produtoService;

    @RequestMapping(value = "/{id}/", method = RequestMethod.GET)
    public Produto getProdutoById(@PathVariable Long id) {
        return produtoService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Produto> getProdutos() {
        return produtoService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Produto save(@RequestBody @Valid Produto produto) {
        return produtoService.save(produto);
    }
//
    @RequestMapping(method = RequestMethod.PUT)
    public Produto update(@RequestBody @Valid Produto produto) {
        return produtoService.save(produto);
    }

    @RequestMapping(value = "/{id}/", method = RequestMethod.DELETE)
    public ResponseEntity deleteById(@PathVariable Long id) {
        produtoService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
