/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pwsolutions.epyl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author nazara
 */

@Entity
@Table(name="BIBLIOTECA")
public class Biblioteca {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_biblioteca;
    
    
    @NotNull
    @Column(name = "NOMBREBIBLIOTECA",columnDefinition = "VARCHAR(100)")
    private String nombre_biblioteca;
    
    @NotNull
    @Column(name = "UBICACIONBIBLIOTECA",columnDefinition = "VARCHAR(200)")
    private String ubicacion_biblioteca;
    
    @NotNull
    //@ForeignKey
    private String nombre_facultad;
    
    public Biblioteca(){}

    public int getId_biblioteca() {
        return id_biblioteca;
    }

    public void setId_biblioteca(int id_biblioteca) {
        this.id_biblioteca = id_biblioteca;
    }

    public String getNombre_biblioteca() {
        return nombre_biblioteca;
    }

    public void setNombre_biblioteca(String nombre_biblioteca) {
        this.nombre_biblioteca = nombre_biblioteca;
    }

    public String getUbicacion_biblioteca() {
        return ubicacion_biblioteca;
    }

    public void setUbicacion_biblioteca(String ubicacion_biblioteca) {
        this.ubicacion_biblioteca = ubicacion_biblioteca;
    }

    public String getNombre_facultad() {
        return nombre_facultad;
    }

    public void setNombre_facultad(String nombre_facultad) {
        this.nombre_facultad = nombre_facultad;
    }
    
}
