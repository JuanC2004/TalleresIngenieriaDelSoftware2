/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplofactorymethod;

/**
 *
 * @author juanc
 */
public class EjemploFactoryMethod {

    public static void main(String[] args) {
        Creadora creadora = new CreadoraEnvioExpres();
        ServicioEnvio envioExpres = creadora.crearServicioEnvio();
        envioExpres.enviar("PAQUETE");
        
        
    }
}
