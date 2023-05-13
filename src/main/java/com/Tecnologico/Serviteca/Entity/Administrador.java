package com.Tecnologico.Serviteca.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

import java.io.Serializable;
@Entity(name="administrador")
@PrimaryKeyJoinColumn(name="id")
public class Administrador extends Usuario implements Serializable {


    public int getNivelAcceso() {
        return nivelAcceso;
    }

    public Administrador(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public void setNivelAcceso(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    @Column(name="nivelacceso")
    private int nivelAcceso;


}
