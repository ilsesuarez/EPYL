/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pwsolutions.epyl.controller;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 *
 * @author renejesusgv
 */
@Controller("autorControlador")
@Scope("session")
public class AutorControlador implements Serializable {
    @PostConstruct
    public void init(){
    }
    
}
