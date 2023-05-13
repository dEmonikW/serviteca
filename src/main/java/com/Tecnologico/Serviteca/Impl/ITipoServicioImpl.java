package com.Tecnologico.Serviteca.Impl;

import com.Tecnologico.Serviteca.Entity.TipoServicio;
import com.Tecnologico.Serviteca.Repository.TipoServicioRepository;
import com.Tecnologico.Serviteca.Service.TipoServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class ITipoServicioImpl implements TipoServicioService {
    @Autowired
    private TipoServicioRepository tipoServicioRepository;

    @Override
    public TipoServicio consultarTipoServicios(Long id) {
        return this.tipoServicioRepository.findById(id).get();
    }

    @Override
    public void eliminarTipoServicios(Long id) {
        this.tipoServicioRepository.deleteById(id);
    }

    @Override
    public List<TipoServicio> listarTipoServicios() {
        return (List<TipoServicio>) this.tipoServicioRepository.findAll();
    }

    @Override
    public TipoServicio crearTipoServicios(TipoServicio tipoServicio) {

        return this.tipoServicioRepository.save(tipoServicio);
    }

    @Override
    public TipoServicio modificarTipoServicios(TipoServicio tipoServicio) {
        return this.tipoServicioRepository.save(tipoServicio);
    }
}
