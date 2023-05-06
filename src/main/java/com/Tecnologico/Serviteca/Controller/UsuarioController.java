package com.Tecnologico.Serviteca.Controller;


import com.Tecnologico.Serviteca.Entity.Usuario;
import com.Tecnologico.Serviteca.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @GetMapping(value="/ListarUsuario")
    public List<Usuario> getUsuarioList(){
        return usuarioRepository.findAll();

    }
    @PostMapping(value = "/SaveUsuario")
    public String saveUsuario(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
        return "se guardo usuario";
    }
}
