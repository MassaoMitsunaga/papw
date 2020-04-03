package dev.fujioka.massao.webRest;

import dev.fujioka.massao.domain.Cliente;
import dev.fujioka.massao.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteRest {
    
    @Autowired
    private ClienteService clienteService;

    @RequestMapping(value = "/{id}/", method = RequestMethod.GET)
    public Cliente getClienteById(@PathVariable Long id) {
        return clienteService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Cliente> getClientes() {
        return clienteService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Cliente save(@RequestBody @Valid Cliente cliente) {
        return clienteService.save(cliente);
    }
//
    @RequestMapping(method = RequestMethod.PUT)
    public Cliente update(@RequestBody @Valid Cliente cliente) {
        return clienteService.save(cliente);
    }

    @RequestMapping(value = "/{id}/", method = RequestMethod.DELETE)
    public ResponseEntity deleteById(@PathVariable Long id) {
        clienteService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
