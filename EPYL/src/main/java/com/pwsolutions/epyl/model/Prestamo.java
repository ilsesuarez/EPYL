/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pwsolutions.epyl.model;

import java.sql.Time;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author nazara
 */
@Entity
@Table(name="PRESTAMO")
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_prestamo;
       
    @NotNull
    @Column(name = "FECHAPRESTAMO",columnDefinition = "DATE")
    private Date fecha_prestamo;
    
    @NotNull
    @Column(name = "FECHADEVOLUCION",columnDefinition = "DATE")
    private Date fecha_devolucion;
    
    @NotNull
    @Column(name = "PLAZO",columnDefinition = "INTEGER(1)")
    private int plazo;
    
    @NotNull
    @Column(name = "APROBADO",columnDefinition = "BOOLEAN")
    private boolean aprobado;
    
    @NotNull
    @Column(name = "HORA",columnDefinition = "TIME")
    private Time hora;
    
    @NotNull
    @Column(name = "PUNTACION",columnDefinition = "INTEGER()")
    private int puntuacion;
    
    
    //TODAS SON FORANEAS
    @NotNull
    private int id_libro;
    @NotNull
    private Usuario usuario_prestatario;
    @NotNull
    private Usuario usuario_prestamista;
    @NotNull
    private int id_biblioteca;

    public Prestamo(){}


    public int getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(int id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public Date getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(Date fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public Usuario getUsuario_prestatario() {
        return usuario_prestatario;
    }

    public void setUsuario_prestatario(Usuario usuario_prestatario) {
        this.usuario_prestatario = usuario_prestatario;
    }

    public Usuario getUsuario_prestamista() {
        return usuario_prestamista;
    }

    public void setUsuario_prestamista(Usuario usuario_prestamista) {
        this.usuario_prestamista = usuario_prestamista;
    }

    public int getId_biblioteca() {
        return id_biblioteca;
    }

    public void setId_biblioteca(int id_biblioteca) {
        this.id_biblioteca = id_biblioteca;
    }
    
    
}
