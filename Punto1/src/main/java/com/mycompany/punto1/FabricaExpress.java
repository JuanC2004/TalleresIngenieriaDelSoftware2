/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.punto1;

/**
 *
 * @author juanc
 */
public class FabricaExpress implements InterfazFabrica{


    @Override
    public Paquete CrearPaquete() {
        return new PaqueteExpress();
    }
    
}