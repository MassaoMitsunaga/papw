package dev.fujioka.massao.webRest;

import dev.fujioka.massao.domain.Transportadora;
import dev.fujioka.massao.service.TransportadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/transportadoras")
public class TransportadoraRest {
    
    @Autowired
    private TransportadoraService transportadoraService;

    @RequestMapping(value = "/{id}/", method = RequestMethod.GET)
    public Transportadora getTransportadoraById(@PathVariable Long id) {
        return transportadoraService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Transportadora> getTransportadoras() {
        return transportadoraService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Transportadora save(@RequestBody @Valid Transportadora transportadora) {
        return transportadoraService.save(transportadora);
    }
//
    @RequestMapping(method = RequestMethod.PUT)
    public Transportadora update(@RequestBody @Valid Transportadora transportadora) {
        return transportadoraService.save(transportadora);
    }

    @RequestMapping(value = "/{id}/", method = RequestMethod.DELETE)
    public ResponseEntity deleteById(@PathVariable Long id) {
        transportadoraService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
