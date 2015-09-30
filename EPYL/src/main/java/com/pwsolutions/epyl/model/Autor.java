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
    private String ap_paternoAutor;
    @NotNull
    private String ap_maternoAutor;
    @NotNull
    private String nombreAutor;
    @NotNull
    private List lista_libros;
    
    //Método Constructor 
    public Autor(){}
    public Autor(String ap_paternoAutor, 
                 String ap_maternoAutor, 
                 String nombreAutor, 
                 List lista_libros)
    {
        this.ap_paternoAutor = ap_paternoAutor;
        this.ap_maternoAutor = ap_maternoAutor;
        this.nombreAutor = nombreAutor;
        this.lista_libros = lista_libros;
    }

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public String getAp_paternoAutor() {
        return ap_paternoAutor;
    }

    public void setAp_paternoAutor(String ap_paternoAutor) {
        this.ap_paternoAutor = ap_paternoAutor;
    }

    public String getAp_maternoAutor() {
        return ap_maternoAutor;
    }

    public void setAp_maternoAutor(String ap_maternoAutor) {
        this.ap_maternoAutor = ap_maternoAutor;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public List getLista_libros() {
        return lista_libros;
    }

    public void setLista_libros(List lista_libros) {
        this.lista_libros = lista_libros;
    }
    
}

