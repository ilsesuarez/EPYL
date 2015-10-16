    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pwsolutions.epyl.model;

import java.io.Serializable;
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
    private String uname;
    
    @NotNull
    private String numero_cuenta;
    
    @NotNull
    private String contraseña;
    
    @NotNull
    private String nombre_completo;
    
    @NotNull
    private Facultad facultad;
    
    private int puntuacion;
    
    //Libros?
   
    public Usuario(){}
    public Usuario(String correo, 
                   String uname, 
                   String no_cta, 
                   String contraseña, 
                   String nombre_completo, 
                   Facultad facultad) 
    {    
        this.correo = correo;
        this.uname = uname;
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

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
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

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
