package com.Tecnologico.Serviteca.Entity;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Entity(name="operador")
@PrimaryKeyJoinColumn(name="id")
public class Operador extends Usuario implements Serializable {

    private String especialidad;
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @OneToMany(mappedBy = "operador")
    private List<Servicio> servicios;

    public Operador() {
    }

    public Operador(String especialidad, Date fechaInicio) {

        this.especialidad = especialidad;
        this.fechaInicio = fechaInicio;
    }





    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Operador)) {
            return false;
        }
        Operador other = (Operador) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null )) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Entity.Operador[ id=" + getId() + " ]";
    }



    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the fechaInicio
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

}

