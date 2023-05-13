package com.Tecnologico.Serviteca.Service;


import com.Tecnologico.Serviteca.Entity.Cliente;
import com.Tecnologico.Serviteca.Entity.Usuario;

import java.util.List;

public interface ClienteService {
    public List<Cliente> listarCliente();
    public Cliente crearCliente(Cliente cliente);
    public Cliente modificarCliente(Cliente cliente);
    public Cliente consultarCliente(Long id);
    public void eliminarCliente(Long id);
}

