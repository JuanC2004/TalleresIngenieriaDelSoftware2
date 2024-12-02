/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.punto4;

/**
 *
 * @author juanc
 */
public class Configuracion {
    private static Configuracion instancia;
    
    private String url;
    private String usuario;
    private String password;
    
    
    private Configuracion(){
        this.url = "jdbc:mysql://localhost:3306/mi_base_datgos";
        this.usuario = "root";
        this.password = "root";
    }
    
    public static Configuracion getInstancia(){
        if(instancia == null){
            instancia= new Configuracion();
        }
        return instancia;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
}
