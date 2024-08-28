/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller4;

/**
 *
 * @author juanc
 */
public class CalculoImpuestoSaludable extends Calculo{
    
    private static final double SALUDABLE_RATE = 0.05; //5% del impuesto saludable

    public CalculoImpuestoSaludable(Producto producto, int cantidad) {
        super(producto, cantidad);
    }
    
    @Override
    public double calcularImpuesto() {
        return producto.getPrecio() * cantidad *SALUDABLE_RATE;
    }
    
}
