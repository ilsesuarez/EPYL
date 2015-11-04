/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pwsolutions.epyl.converter;

import com.pwsolutions.epyl.model.Usuario;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

/**
 *
 * @author renejesusgv
 */
public class UsuarioConverter implements Converter{
   @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Usuario usuario=new Usuario();
        String cadenas[]=value.split("|");
        usuario.setUsername(cadenas[0]);
        usuario.setContraseña(cadenas[1]);
        return usuario;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        Usuario usuario=(Usuario)value;
        return usuario.getUsername()+"|"
                +usuario.getContraseña();
    }
    
    
       
}
