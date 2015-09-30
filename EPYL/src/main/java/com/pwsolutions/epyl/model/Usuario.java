    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pwsolutions.epyl.model;

import java.awt.Image;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author renejesusgv
 */
public class Usuario implements Serializable{
  
    @Id
    private int id_usuario;
    
    @NotNull
    private String correo;
    
    @NotNull
    private String nombre_usuario;
    
    @NotNull
    private String numero_cuenta;
    
    @NotNull
    private String contraseña;
    
    @NotNull
    private String nombre_completo;
    
    @NotNull
    private String facultad;
    
    private int puntuacion;

    private List<Libro> libros;

    public Usuario(int id_usuario, String correo, String nombre_usuario, String no_cta, String contraseña, String nombre_completo, String facultad) {
        this.id_usuario = id_usuario;
        this.correo = correo;
        this.nombre_usuario = nombre_usuario;
        this.numero_cuenta = no_cta;
        this.contraseña = contraseña;
        this.nombre_completo = nombre_completo;
        this.facultad = facultad;
        this.puntuacion = 0;
        
    }
        
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

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
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

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void consultaHistorial(){
    }
    
    
    public void consultaActividad(){
    }
    
    
    public void aceptarPrestamo(){
    }
    
    
    public void registrarLibro(String autor, String titulo, Image imagen){
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
