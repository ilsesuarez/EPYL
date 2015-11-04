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
 * 
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

    private String busqueda;
    
    @PostConstruct
    public void init(){
       lista_usuarios =usuario_repository.findAll();       
       lista_libros = libro_repository.findAll();
       usuario = new Usuario();
       usuario.setLibros(new ArrayList<Libro>());
    }
    
    public void buscaLibros(String query){
    if(busqueda!=null){
            this.lista_libros=libro_repository.findByParametro(query);
        }
    }
      
    public List<Libro> getLibros(){
        return lista_libros;
    }

    public void setLibros(List<Libro> lista_libros) {
        this.lista_libros = lista_libros;
    }
    
    public void guardaUsuario(){
        verifica(usuario);
        usuario_repository.save(usuario);
        init();
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getUsuarios() {
        return lista_usuarios;
    }

    public void setUsuarios(List<Usuario> lista_usuarios) {
        this.lista_usuarios = lista_usuarios;
    }

    public String getBusqueda() {
        return busqueda;
    }

    public void setBusqueda(String busqueda) {
        this.busqueda = busqueda;
    }

    private void verifica(Usuario usuario) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

}
}
