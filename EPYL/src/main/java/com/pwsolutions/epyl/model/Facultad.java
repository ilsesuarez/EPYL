/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pwsolutions.epyl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="FACULTAD")
public class Facultad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nombre_facultad;
    
    
    @NotNull
    @Column(name = "UBICACIONFACULTAD",columnDefinition = "VARCHAR(200)")
    private String ubicacion_facultad;
    
    public Facultad(){}


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
