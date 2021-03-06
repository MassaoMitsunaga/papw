package dev.fujioka.massao.service;

import dev.fujioka.massao.domain.Usuario;
import dev.fujioka.massao.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Usuario findById(Long id){
        return usuarioRepository
                .findById(id)
                .orElseThrow(NoSuchElementException::new);
    }

    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }


    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }
}
