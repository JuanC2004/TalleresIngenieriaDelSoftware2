/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller4;

/**
 *
 * @author juanc
 */
public class CalculoImpustoReteIva extends Calculo {

    private static final double RETE_IVA_RATE = 0.15;
    
    public CalculoImpustoReteIva(Producto producto, int cantidad) {
        super(producto, cantidad);
    }

    @Override
    public double calcularImpuesto() {
        return producto.getPrecio() * cantidad * RETE_IVA_RATE;
    }
    

    
}
