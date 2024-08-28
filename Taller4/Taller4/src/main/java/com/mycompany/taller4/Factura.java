/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller4;

/**
 *
 * @author juanc
 */
public class Factura {
    Calculo calculo;

    public Factura(Calculo calculo) {
        this.calculo = calculo;
    }
    
    public double calcularTotalConImpuesto(){
        double impuesto = calculo.calcularImpuesto();
        double subtotal = calculo.producto.getPrecio() * calculo.cantidad;
        
        return subtotal + impuesto;
    }
    
    public double calcularSoloImpuesto(){
        return calculo.calcularImpuesto();
    }
}
