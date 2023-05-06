package com.Tecnologico.Serviteca.Entity;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Servicios implements Serializable {

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Temporal(TemporalType.TIME)
    private Date hora;
    @ManyToOne
    private Operador operador;
    @ManyToOne
    private Vehiculo vehiculo;
    private String observaciones;

    public Servicios() {
    }

    public Servicios(Long id, Date fecha, Date hora, Operador operador, Vehiculo vehiculo, String observaciones) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.operador = operador;
        this.vehiculo = vehiculo;
        this.observaciones = observaciones;
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Servicios)) {
            return false;
        }
        Servicios other = (Servicios) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Entity.Servicios[ id=" + getId() + " ]";
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the hora
     */
    public Date getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(Date hora) {
        this.hora = hora;
    }

    /**
     * @return the operador
     */
    public Operador getOperario() {
        return operador;
    }

    /**
     * @param operador the operador to set
     */
    public void setOperario(Operador operador) {
        this.operador = operador;
    }

    /**
     * @return the vehiculo
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * @param vehiculo the vehiculo to set
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * @return the observaciones
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * @param observaciones the observaciones to set
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}

