/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pwsolutions.epyl.model;

import java.sql.Time;
import java.util.Date;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author nazara
 */
public class Prestamo {
    @NotNull
    @Id
    private int id_prestamo;
    @NotNull
    private Date fecha_prestamo;
    private Date fecha_ddevolucion;
    private int plazo;
    private boolean aprobado;
    private Time hora;
    private double puntuacion;
    //TODAS SON FORANEAS
    private int id_libro;
    private Usuario usuario_prestatario;
    private Usuario usuario_prestamista;
    private int id_biblioteca;

    public Prestamo(){}
    public Prestamo(Date fecha_prestamo, Date fecha_ddevolucion, int plazo, boolean aprobado, Time hora, double puntuacion, int id_libro, Usuario usuario_prestatario, Usuario usuario_prestamista, int id_biblioteca) {
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_ddevolucion = fecha_ddevolucion;
        this.plazo = plazo;
        this.aprobado = aprobado;
        this.hora = hora;
        this.puntuacion = puntuacion;
        this.id_libro = id_libro;
        this.usuario_prestatario = usuario_prestatario;
        this.usuario_prestamista = usuario_prestamista;
        this.id_biblioteca = id_biblioteca;
    }

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

    public Date getFecha_ddevolucion() {
        return fecha_ddevolucion;
    }

    public void setFecha_ddevolucion(Date fecha_ddevolucion) {
        this.fecha_ddevolucion = fecha_ddevolucion;
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

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
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
