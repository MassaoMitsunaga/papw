package dev.fujioka.massao.webRest;

import dev.fujioka.massao.domain.Filial;
import dev.fujioka.massao.service.FilialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/filiais")
public class FilialRest {
    
    @Autowired
    private FilialService filialService;

    @RequestMapping(value = "/{id}/", method = RequestMethod.GET)
    public Filial getFilialById(@PathVariable Long id) {
        return filialService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Filial> getFilials() {
        return filialService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Filial save(@RequestBody @Valid Filial filial) {
        return filialService.save(filial);
    }
//
    @RequestMapping(method = RequestMethod.PUT)
    public Filial update(@RequestBody @Valid Filial filial) {
        return filialService.save(filial);
    }

    @RequestMapping(value = "/{id}/", method = RequestMethod.DELETE)
    public ResponseEntity deleteById(@PathVariable Long id) {
        filialService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
