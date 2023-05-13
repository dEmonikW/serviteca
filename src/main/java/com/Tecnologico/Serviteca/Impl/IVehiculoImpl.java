package com.Tecnologico.Serviteca.Impl;

import com.Tecnologico.Serviteca.Entity.Usuario;
import com.Tecnologico.Serviteca.Entity.Vehiculo;
import com.Tecnologico.Serviteca.Repository.UsuarioRepository;
import com.Tecnologico.Serviteca.Repository.VehiculoRepository;
import com.Tecnologico.Serviteca.Service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IVehiculoImpl implements VehiculoService {
    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public List<Vehiculo> listarVehiculo() {
        return (List<Vehiculo>) this.vehiculoRepository.findAll();
    }

    @Override
    public Vehiculo crearVehiculo(Vehiculo vehiculo) {
        vehiculo.setColor(vehiculo.getColor());
        vehiculo.setMarca(vehiculo.getMarca());
        vehiculo.setPlaca(vehiculo.getPlaca());
        vehiculo.setModelo(vehiculo.getModelo());

        return this.vehiculoRepository.save(vehiculo);
    }

    @Override
    public Vehiculo modificarVehiculo(Vehiculo vehiculo) {
        return this.vehiculoRepository.save(vehiculo);
    }

    @Override
    public Vehiculo consultarVehiculo(Long id) {
        return this.vehiculoRepository.findById(id).get();
    }

    @Override
    public void eliminarVehiculo(Long id) {
        this.vehiculoRepository.deleteById(id);
    }
}
