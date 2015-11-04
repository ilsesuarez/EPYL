/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pwsolutions.epyl.repository;

import com.pwsolutions.epyl.model.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author nazara
 */
public interface LibroRepository extends CrudRepository<Libro, Integer> {
    
   @Override
    List<Libro> findAll();
    
    @Query("SELECT l FROM Libro l WHERE l.titulo LIKE CONCAT('%',?1,'%')")
    List<Libro> findByParametro(String parametro);
}

