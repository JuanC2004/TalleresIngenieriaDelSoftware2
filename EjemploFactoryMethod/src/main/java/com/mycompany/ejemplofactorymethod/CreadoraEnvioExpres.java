/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplofactorymethod;

/**
 *
 * @author juanc
 */
public class CreadoraEnvioExpres extends Creadora{

    @Override
    public ServicioEnvio crearServicioEnvio() {
        return new EnvioExpres();
    }
    
}