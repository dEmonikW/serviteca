package com.Tecnologico.Serviteca.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity(name ="tiposervicio")
public class TipoServicio implements Serializable {
    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="valor")
    private double valor;
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "TipoServicio{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", valor=" + valor +
                '}';
    }

    public TipoServicio() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}
