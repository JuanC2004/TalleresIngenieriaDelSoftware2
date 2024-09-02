/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author juanc
 */
public class PaquetePequeño extends Paquete implements IPaquetePequeño {
    private double valorDeclarado;

    public PaquetePequeño(double valorDeclarado, double peso, double dimensiones) {
        super(peso, dimensiones);
        this.valorDeclarado = valorDeclarado;
    }

    /**
     * @return the valorDeclarado
     */
    public double getValorDeclarado() {
        return valorDeclarado;
    }

    /**
     * @param valorDeclarado the valorDeclarado to set
     */
    public void setValorDeclarado(double valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    @Override
    public void calcularCostoEnvioPequeño() {
        System.out.println("Se calcula el costo del envio de un paquete pequeño");
    }
    
    
}
