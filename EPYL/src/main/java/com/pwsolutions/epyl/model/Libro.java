/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pwsolutions.epyl.model;

import java.awt.Image;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.swing.ImageIcon;
import javax.validation.constraints.NotNull;

/**
 *
 * @author renejesusgv
 */
@Entity
@Table(name="LIBRO")
public class Libro  implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_libro;
    

    @NotNull
    @Column(name = "TITULO",columnDefinition = "VARCHAR(30)")
    private String titulo;    
    
    @ManyToMany(cascade = CascadeType.REMOVE,
            fetch = FetchType.EAGER)
    private List<Autor> autores;
    
    
    private Image portada = new ImageIcon("/res/").getImage();
    
    @Column(name = "PRESTADO",columnDefinition = "BOOLEAN")
    private Boolean prestado;   
    
    
    @Column(name = "NUMEROPRESTAMOS",columnDefinition = "INTEGER(5)")
    private Integer numero_prestamos;
    
    @Lob
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

    public byte[] getLibro_arreglo() {
        return libro_arreglo;
    }

    public void setLibro_arreglo(byte[] libro_arreglo) {
        this.libro_arreglo = libro_arreglo;
    }
     
}
