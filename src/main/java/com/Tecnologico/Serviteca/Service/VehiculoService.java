package com.Tecnologico.Serviteca.Service;

import com.Tecnologico.Serviteca.Entity.Usuario;
import com.Tecnologico.Serviteca.Entity.Vehiculo;

import java.util.List;

public interface VehiculoService {
    public List<Vehiculo> listarVehiculo();
    public Vehiculo crearVehiculo(Vehiculo vehiculo);
    public Vehiculo modificarVehiculo(Vehiculo vehiculo);
    public Vehiculo consultarVehiculo(Long id);
    public void eliminarVehiculo(Long id);
}
