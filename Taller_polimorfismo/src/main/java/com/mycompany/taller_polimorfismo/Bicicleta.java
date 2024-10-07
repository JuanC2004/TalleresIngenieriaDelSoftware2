/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_polimorfismo;

/**
 *
 * @author juanc
 */
public class Bicicleta implements ITransporte{

    @Override
    public void acelerar() {
        System.out.println("La bicicleta esta pedaleando");
    }

    @Override
    public void frenar() {
        System.out.println("La bicicleta esta frenando");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Soy la información de la bicicleta, estoy estacionada");
    }    

}
    
    
