package com.oracle.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class User {
    
    private String usuario;
    
    
    public String irStatus(){
        return "status";
    }
    
    
    public String multipleOpcion(){
        
        switch (usuario) {
            case "Eduardo":
                return "eduardoPage";
            case "Zoe":
                return "zoePage";
            default: 
                return "notFound";
        }
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
}
