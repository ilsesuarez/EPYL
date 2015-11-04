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
    private String autor;
    @NotNull 
    private Image portada = new ImageIcon("/res/").getImage();
    private Boolean prestado;    
    private Integer numero_prestamos;
    
    private byte[] libro_arreglo;
    
    public Libro(){}

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
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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

    public byte[] getLibro_arreglo() {
        return libro_arreglo;
    }

    public void setLibro_arreglo(byte[] libro_arreglo) {
        this.libro_arreglo = libro_arreglo;
    }
     
}
