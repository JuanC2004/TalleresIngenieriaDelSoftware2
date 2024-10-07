/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_polimorfismo;

/**
 *
 * @author juanc
 */
public class Coche implements ITransporte{
    @Override
    public void acelerar() {
        System.out.println("EL coche esta acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("El coche esta frenando");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Soy la información del coche, estoy estacionado");
    }
}
