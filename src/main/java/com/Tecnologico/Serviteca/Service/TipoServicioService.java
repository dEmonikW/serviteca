package com.Tecnologico.Serviteca.Service;

import com.Tecnologico.Serviteca.Entity.TipoServicio;

import java.util.List;

public interface TipoServicioService {
    public List<TipoServicio> listarTipoServicios();
    public TipoServicio crearTipoServicios(TipoServicio tipoServicio);
    public TipoServicio modificarTipoServicios(TipoServicio tipoServicio);
    public TipoServicio consultarTipoServicios(Long id);
    public void eliminarTipoServicios(Long id);
}

