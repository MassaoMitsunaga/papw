package dev.fujioka.massao.webRest;

import dev.fujioka.massao.domain.Usuario;
import dev.fujioka.massao.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioRest {
    
    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(value = "/{id}/", method = RequestMethod.GET)
    public Usuario getUsuarioById(@PathVariable Long id) {
        return usuarioService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Usuario> getUsuarios() {
        return usuarioService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Usuario save(@RequestBody @Valid Usuario usuario) {
        return usuarioService.save(usuario);
    }
//
    @RequestMapping(method = RequestMethod.PUT)
    public Usuario update(@RequestBody @Valid Usuario usuario) {
        return usuarioService.save(usuario);
    }

    @RequestMapping(value = "/{id}/", method = RequestMethod.DELETE)
    public ResponseEntity deleteById(@PathVariable Long id) {
        usuarioService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
