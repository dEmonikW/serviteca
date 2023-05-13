package com.Tecnologico.Serviteca.Impl;

import com.Tecnologico.Serviteca.Entity.Usuario;
import com.Tecnologico.Serviteca.Repository.UsuarioRepository;
import com.Tecnologico.Serviteca.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUsuarioImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> listarUsuario() {
        return (List<Usuario>) this.usuarioRepository.findAll();
    }

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        usuario.setEnabled(usuario.isEnabled());
        usuario.setUsername(usuario.getUsername());
        usuario.setApellido(usuario.getApellido());
        usuario.setEmail(usuario.getEmail());
        usuario.setNombre(usuario.getNombre());
        usuario.setPassword(usuario.getPassword());
        return this.usuarioRepository.save(usuario);
    }

    @Override
    public Usuario modificarUsuario(Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }

    @Override
    public Usuario consultarUsuario(Long id) {
        return this.usuarioRepository.findById(id).get();
    }

    @Override
    public void eliminarUsuario(Long id) {
    this.usuarioRepository.deleteById(id);
    }
}
