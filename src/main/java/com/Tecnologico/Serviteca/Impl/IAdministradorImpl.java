package com.Tecnologico.Serviteca.Impl;

import com.Tecnologico.Serviteca.Entity.Administrador;
import com.Tecnologico.Serviteca.Entity.Cliente;
import com.Tecnologico.Serviteca.Repository.AdministradorRepository;
import com.Tecnologico.Serviteca.Service.AdministradorService;

import com.Tecnologico.Serviteca.Entity.Cliente;
import com.Tecnologico.Serviteca.Entity.Usuario;
import com.Tecnologico.Serviteca.Repository.ClienteRepository;
import com.Tecnologico.Serviteca.Repository.UsuarioRepository;
import com.Tecnologico.Serviteca.Service.ClienteService;
import com.Tecnologico.Serviteca.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.List;
@Service
public class IAdministradorImpl implements AdministradorService {

    @Autowired
    private AdministradorRepository administradorRepository;

    @Override
    public Administrador consultarAdministrador(Long id) {
        return this.administradorRepository.findById(id).get();
    }

    @Override
    public void eliminarAdministrador(Long id) {
        this.administradorRepository.deleteById(id);
    }

    @Override
    public List<Administrador> listarAdministrador() {
        return (List<Administrador>) this.administradorRepository.findAll();
    }

    @Override
    public Administrador crearAdministrador(Administrador administrador) {
        administrador.setNivelAcceso(administrador.getNivelAcceso());
        administrador.setEnabled(administrador.isEnabled());
        administrador.setUsername(administrador.getUsername());
        administrador.setApellido(administrador.getApellido());
        administrador.setEmail(administrador.getEmail());
        administrador.setNombre(administrador.getNombre());
        administrador.setPassword(administrador.getPassword());
        return this.administradorRepository.save(administrador);
    }

    @Override
    public Administrador modificarAdministrador(Administrador administrador) {
        return this.administradorRepository.save(administrador);
    }
}


