package com.Tecnologico.Serviteca.Service;

import com.Tecnologico.Serviteca.Entity.Administrador;
import com.Tecnologico.Serviteca.Entity.Cliente;

import java.util.List;

public interface AdministradorService {

        public List<Administrador> listarAdministrador();
        public Administrador crearAdministrador(Administrador administrador);
        public Administrador modificarAdministrador(Administrador administrador);
        public Administrador consultarAdministrador(Long id);
        public void eliminarAdministrador(Long id);
    }

