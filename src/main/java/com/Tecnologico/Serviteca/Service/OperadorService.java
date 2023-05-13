package com.Tecnologico.Serviteca.Service;

import com.Tecnologico.Serviteca.Entity.Operador;
import com.Tecnologico.Serviteca.Entity.Usuario;

import java.util.List;

public interface OperadorService {
    public List<Operador> listarOperador();
    public Operador crearOperador(Operador operador);
    public Operador modificarOperador(Operador operador);
    public Operador consultarOperador(Long id);
    public void eliminarOperador(Long id);
}

