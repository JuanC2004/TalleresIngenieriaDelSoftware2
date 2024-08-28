/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller4;

/**
 *
 * @author juanc
 */
public class CalculoImpuestoIva extends Calculo {
    private static final double IVA_RATE = 0.19; //19% de IVA

    public CalculoImpuestoIva(Producto producto, int cantidad) {
        super(producto, cantidad);
    }

    
   

    @Override
    public double calcularImpuesto() {
        return producto.getPrecio() * cantidad * IVA_RATE;
    }
    
}