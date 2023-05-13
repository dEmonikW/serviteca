package com.Tecnologico.Serviteca.Entity;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;


@Entity(name ="cliente")
@PrimaryKeyJoinColumn(name="id")
public class Cliente extends Usuario implements Serializable {

    private static long serialVersionUID = 1L;
    private String direccion;
    @OneToMany(mappedBy = "propietario")
    private List<Vehiculo> vehiculos;

    public Cliente() {
    }

    public Cliente(String direccion) {
        this.direccion = direccion;

    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }


    @Override
    public String toString() {
        return "com.Entity.Cliente[ id=" + getId() + " ]";
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
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}



