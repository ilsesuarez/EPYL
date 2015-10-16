package com.pwsolutions.epyl.controller;
import com.pwsolutions.epyl.repository.UsuarioRepository;
import com.pwsolutions.epyl.repository.LibroRepository;
import com.pwsolutions.epyl.model.Libro;
import com.pwsolutions.epyl.model.Prestamo;
import com.pwsolutions.epyl.model.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private UsuarioRepository usuario_repository;
    @Autowired
    private LibroRepository libro_repository;
   
    @PostConstruct
    public void init(){
    lista_usuarios =usuario_repository.findAll();       
        
    usuario =new Usuario();
    usuario.setLibros(new ArrayList<Libro>());
    
    }
        
}
