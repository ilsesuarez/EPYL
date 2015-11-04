/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pwsolutions.epyl.controller;

import com.pwsolutions.epyl.model.Libro;
import com.pwsolutions.epyl.repository.LibroRepository;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.FileUploadEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 *
 * @author renejesusgv
 */
@Controller("libroControlador")
@Scope("session")
public class LibroControlador implements Serializable{
     
    @Autowired
    private LibroRepository libro_repository;
    
    private Libro libro;
    private List<Libro> libros;
    
    @PostConstruct
    public void init(){       
        libros=libro_repository.findAll();
        libro=new Libro();
    }
    
    public void setAutor(String a){
        libro.setAutor(a);                
    }
    
    public void setTitulo(String t){
        libro.setTitulo(t);
    }
    
    public void guardaLibro(){
        libro_repository.save(libro);
        init();
    }
    
   public void handleFileUpload(FileUploadEvent event) {
        FacesMessage message = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");
        libro.setLibro_arreglo(event.getFile().getContents());
        libro_repository.save(libro);                
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
}
