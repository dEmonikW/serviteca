package com.Tecnologico.Serviteca.Impl;

import com.Tecnologico.Serviteca.Entity.Cliente;
import com.Tecnologico.Serviteca.Entity.Usuario;
import com.Tecnologico.Serviteca.Repository.ClienteRepository;
import com.Tecnologico.Serviteca.Repository.UsuarioRepository;
import com.Tecnologico.Serviteca.Service.ClienteService;
import com.Tecnologico.Serviteca.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IClienteImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;



    @Override
    public Cliente consultarCliente(Long id) {
        return this.clienteRepository.findById(id).get();
    }

    @Override
    public void eliminarCliente(Long id) {
        this.clienteRepository.deleteById(id);
    }

    @Override
    public List<Cliente> listarCliente() {
        return (List<Cliente>) this.clienteRepository.findAll();
    }

    @Override
    public Cliente crearCliente(Cliente cliente) {
        cliente.setDireccion(cliente.getDireccion());
        cliente.setEnabled(cliente.isEnabled());
        cliente.setUsername(cliente.getUsername());
        cliente.setApellido(cliente.getApellido());
        cliente.setEmail(cliente.getEmail());
        cliente.setNombre(cliente.getNombre());
        cliente.setPassword(cliente.getPassword());
        cliente.setEnabled(true);
        return this.clienteRepository.save(cliente);
    }

    @Override
    public Cliente modificarCliente(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }




}
