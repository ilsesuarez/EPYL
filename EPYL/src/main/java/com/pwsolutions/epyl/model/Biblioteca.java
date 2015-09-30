/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pwsolutions.epyl.model;

import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author nazara
 */
public class Biblioteca {
    @NotNull
    @Id
    private int id_biblioteca;
    @NotNull
    private String nombre_biblioteca;
    private String ubicacion_biblioteca;
    @NotNull
    //@ForeignKey
    private String nombre_facultad;
    
    public Biblioteca(){}

    public Biblioteca(String nombre_biblioteca, String ubicacion_biblioteca, String nombre_facultad) {
        this.nombre_biblioteca = nombre_biblioteca;
        this.ubicacion_biblioteca = ubicacion_biblioteca;
        this.nombre_facultad = nombre_facultad;
    }

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
