/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pwsolutions.epyl.controller;

import com.pwsolutions.epyl.model.Libro;
import com.pwsolutions.epyl.repository.LibroRepository;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.FileUploadEvent;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author renejesusgv
 */
public class LibroControlador implements Serializable{
     
    @Autowired
        LibroRepository libro_repository;
    
    
    
    @PostConstruct
    public void init(){
    }
    
   public void handleFileUpload(FileUploadEvent event) {
       return;
    }
    
    
}
