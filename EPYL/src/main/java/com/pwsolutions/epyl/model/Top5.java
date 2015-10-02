/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pwsolutions.epyl.model;

import java.util.List;

/**
 *
 * @author renejesusgv
 */
public class Top5 {
    private List lista_libros;
    private List lista_prestatarios;
    private List lista_prestamistas;
    
    public Top5(){}

    public Top5(List lista_libros, List lista_prestatarios, List lista_prestamistas) {
        this.lista_libros = lista_libros;
        this.lista_prestatarios = lista_prestatarios;
        this.lista_prestamistas = lista_prestamistas;
    }

    public List getLista_libros() {
        return lista_libros;
    }

    public void setLista_libros(List lista_libros) {
        this.lista_libros = lista_libros;
    }

    public List getLista_prestatarios() {
        return lista_prestatarios;
    }

    public void setLista_prestatarios(List lista_prestatarios) {
        this.lista_prestatarios = lista_prestatarios;
    }

    public List getLista_prestamistas() {
        return lista_prestamistas;
    }

    public void setLista_prestamistas(List lista_prestamistas) {
        this.lista_prestamistas = lista_prestamistas;
    }
      
    
}
