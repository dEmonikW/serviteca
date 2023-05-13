package com.Tecnologico.Serviteca.Entity;

import jakarta.persistence.*;

public class DetalleServicios {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;


    @ManyToOne
    private Servicio servicio;
    @ManyToOne
    private TipoServicio tipoServicio;
    private String estado;

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public DetalleServicios(Long id) {
        this.setId(id);
    }

    public void setId(Long id) {
        this.id = id;
    }

}
