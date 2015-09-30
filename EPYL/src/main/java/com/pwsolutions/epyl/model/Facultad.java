/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pwsolutions.epyl.model;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author nazara
 */
public class Facultad {
    @NotNull
    @Id
    private String nombre_facultad;
    @NotNull
    private String ubicacion_facultad;
    
    public Facultad(){}
    public Facultad(String nombre_facultad, 
                      String ubicacion_facultad)
    {
            this.nombre_facultad = nombre_facultad;
            this.ubicacion_facultad = ubicacion_facultad;
    }

    public String getNombre_facultad() {
        return nombre_facultad;
    }

    public void setNombre_facultad(String nombre_facultad) {
        this.nombre_facultad = nombre_facultad;
    }

    public String getUbicacion_facultad() {
        return ubicacion_facultad;
    }

    public void setUbicacion_facultad(String ubicacion_facultad) {
        this.ubicacion_facultad = ubicacion_facultad;
    }
    
    
}
