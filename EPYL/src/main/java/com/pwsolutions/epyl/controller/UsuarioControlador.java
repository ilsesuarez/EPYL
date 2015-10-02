package com.pwsolutions.epyl.controller;

import com.pwsolutions.epyl.model.Libro;
import com.pwsolutions.epyl.model.Prestamo;
import com.pwsolutions.epyl.model.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * @version 0.1.0100.lab03N
 * @author renejesusgv
 */

@Controller("UsuarioControlador")
@Scope("session")

public class UsuarioControlador implements Serializable {
    private Usuario usuario;
    private List<Libro> lista_libros;
    private List<Usuario> lista_usuarios;
    private List<Prestamo> lista_prestamos;
    
    @PostConstruct
    public void init(){
    }
        
}
