package com.Tecnologico.Serviteca.Impl;

import com.Tecnologico.Serviteca.Entity.Administrador;
import com.Tecnologico.Serviteca.Entity.Operador;
import com.Tecnologico.Serviteca.Repository.AdministradorRepository;
import com.Tecnologico.Serviteca.Repository.OperadorRepository;
import com.Tecnologico.Serviteca.Service.OperadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IOperadorImpl implements OperadorService {
    @Autowired
    private OperadorRepository operadorRepository;

    @Override
    public Operador consultarOperador(Long id) {
        return this.operadorRepository.findById(id).get();
    }

    @Override
    public void eliminarOperador(Long id) {
        this.operadorRepository.deleteById(id);
    }

    @Override
    public List<Operador> listarOperador() {
        return (List<Operador>) this.operadorRepository.findAll();
    }

    @Override
    public Operador crearOperador(Operador operador) {
        operador.setEspecialidad(operador.getEspecialidad());
        operador.setEnabled(operador.isEnabled());
        operador.setUsername(operador.getUsername());
        operador.setApellido(operador.getApellido());
        operador.setEmail(operador.getEmail());
        operador.setNombre(operador.getNombre());
        operador.setPassword(operador.getPassword());
        return this.operadorRepository.save(operador);
    }

    @Override
    public Operador modificarOperador(Operador operador) {
        return this.operadorRepository.save(operador);
    }
}
