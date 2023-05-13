package com.Tecnologico.Serviteca.Service;


import com.Tecnologico.Serviteca.Entity.Usuario;

import java.util.List;

public interface UsuarioService {
    public List<Usuario> listarUsuario();
    public Usuario crearUsuario(Usuario usuario);
    public Usuario modificarUsuario(Usuario usuario);
    public Usuario consultarUsuario(Long id);
    public void eliminarUsuario(Long id);
}

