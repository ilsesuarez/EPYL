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
import javax.validation.constraints.NotNull;

/**
 *
 * @author renejesusgv
 */
@Entity
@Table(name="AUTOR")
public class Autor implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_autor;
    
    @NotNull
    @Column(name = "APPATERNOAUTOR",columnDefinition = "VARCHAR(100)")
    private String ap_paternoAutor;
    
    @NotNull
    @Column(name = "APMATERNOAUTOR",columnDefinition = "VARCHAR(100)")
    private String ap_maternoAutor;
    
    @NotNull
    @Column(name = "NOMBREAUTOR",columnDefinition = "VARCHAR(100)")
    private String nombreAutor;
    
    
    @NotNull
    @ManyToMany(cascade = CascadeType.REMOVE,
            fetch = FetchType.EAGER)
    private List lista_libros;
    
    //Método Constructor 
    public Autor(){}
    

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

