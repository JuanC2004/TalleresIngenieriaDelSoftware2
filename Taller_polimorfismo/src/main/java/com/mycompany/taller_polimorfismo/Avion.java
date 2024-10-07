/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_polimorfismo;

/**
 *
 * @author juanc
 */
public class Avion implements ITransporte{

    @Override
    public void acelerar() {
        System.out.println("El avion esta despegando");
    }

    @Override
    public void frenar() {
        System.out.println("El avion esta aterrizando");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Soy la informacion del avion, estoy estacionado");
    }
    
}
