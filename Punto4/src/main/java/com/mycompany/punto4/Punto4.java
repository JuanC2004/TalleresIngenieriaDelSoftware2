/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto4;

/**
 *
 * @author juanc
 */
public class Punto4 {

    public static void main(String[] args) {
        Configuracion config = Configuracion.getInstancia();
        
        System.out.println("URL: "+config.getUrl());
        System.out.println("Usuario:" +config.getUsuario() );
        System.out.println("Password" +config.getPassword());
        
        Configuracion otraConfig = Configuracion.getInstancia();
        System.out.println("Son la misma instancia? "+(config == otraConfig));
    }
}
