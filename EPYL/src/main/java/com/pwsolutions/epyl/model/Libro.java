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
import javax.swing.ImageIcon;
import javax.validation.constraints.NotNull;

/**
 *
 * @author renejesusgv
 */
public class Libro  implements Serializable{
    
    @Id
    private int id_libro;
    @NotNull
    private String titulo;    
    @NotNull
    private List<Autor> autores;
    @NotNull 
    private Image portada = new ImageIcon("/res/").getImage();
    private Boolean prestado;    
    private Integer numero_prestamos;

    public Libro(){}
    public Libro(String titulo,
                 String autor, 
                 Image portada,
                 List<Autor> autores) 
    {
        this.titulo = titulo;
        this.portada = portada;
        this.autores = autores;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     *
     * @return Autor
     */
    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutor(List<Autor> autores) {
        this.autores = autores;
    }

    public Image getPortada() {
        return portada;
    }

    public void setPortada(Image portada) {
        this.portada = portada;
    }

    public Boolean getPrestado() {
        return prestado;
    }

    public void setPrestado(Boolean prestado) {
        this.prestado = prestado;
    }

    public Integer getNumero_prestamos() {
        return numero_prestamos;
    }

    public void setNumero_prestamos(Integer numero_prestamos) {
        this.numero_prestamos = numero_prestamos;
    }


    
    
    
      
    
    
}
