        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pwsolutions.epyl.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="USUARIO")
public class Usuario implements Serializable{
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_usuario;
    
    @NotNull
    @Column(name = "CORREO",columnDefinition = "VARCHAR(30)")
    private String correo;
    
    @NotNull
    @Column(name = "USERNAME",columnDefinition = "VARCHAR(15)")
    private String username;
    
    @NotNull
    @Column(name = "NUMERODECUENTA",columnDefinition = "INTEGER(9)")
    private String numero_cuenta;
    
    @NotNull
    @Column(name = "CONTRASEÑA",columnDefinition = "VARCHAR(32)")
    private String contraseña;
    
    @NotNull
    @Column(name = "NOMBRECOMPLETO",columnDefinition = "VARCHAR(70)")
    private String nombre_completo;
    
    @Transient
    private Facultad facultad;
    
    @NotNull
    @Column(name = "PUNTUACION",columnDefinition = "INTEGER(1)")
    private int puntuacion;
    
    @NotNull
    @Column(name = "ROL",columnDefinition = "VARCHAR(10)")
    private String rol;
    
    @Column(name = "HISTORIAL",columnDefinition = "VARCHAR(10000)")
    private String historial;
    
    @ManyToMany(cascade = CascadeType.REMOVE,
            fetch = FetchType.EAGER)
    private List<Libro> libros;
    
    
   
    public Usuario(){}
            
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }
    
    public void agregaAlHistorial(String nuevaActividad) {
        historial.concat(nuevaActividad);
    }
   }
