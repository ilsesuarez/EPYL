/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pwsolutions.epyl.repository;

import com.pwsolutions.epyl.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author nazara
 */

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    
    @Override
    List<Usuario> findAll();
    
    @Query("SELECT u FROM Usuario u WHERE u.usuario=? ")
    public Usuario findByUsuario(String usuario);
    
}

