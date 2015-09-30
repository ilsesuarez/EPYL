/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pwsolutions.epyl.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author renejesusgv
 */
public class Autor implements Serializable{
    
    @Id
    private int id_autor;
    
    @NotNull
    private String nombre_completo_Autor;

    
    //Pendiente--------------
    private List lista_libros;
    
    
    public Autor(int id_autor, String nombre_completo_Autor) {
        this.id_autor = id_autor;
        this.nombre_completo_Autor = nombre_completo_Autor;
    }

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public String getNombre_completo_Autor() {
        return nombre_completo_Autor;
    }

    public void setNombre_completo_Autor(String nombre_completo_Autor) {
        this.nombre_completo_Autor = nombre_completo_Autor;
    }

    public List getLista_libros() {
        return lista_libros;
    }

    public void setLista_libros(List lista_libros) {
        this.lista_libros = lista_libros;
    }
      
    
}
