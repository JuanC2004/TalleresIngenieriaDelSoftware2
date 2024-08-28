/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller4;

/**
 *
 * @author juanc
 */
public class Taller4 {

    public static void main(String[] args) {
        Producto producto = new Producto("Pc", 1500.0);
        int cantidad = 2;
        
        //Cálculo de IVA
        Calculo calculoIva = new CalculoImpuestoIva(producto, cantidad);
        Factura facturaIva = new Factura(calculoIva);
        System.out.println("Total con IVA: "+facturaIva.calcularTotalConImpuesto());
        System.out.println("Solo IVA: "+facturaIva.calcularSoloImpuesto());
        
        // Cálculo de Rete IVA
        Calculo calculoReteIva = new CalculoImpustoReteIva(producto, cantidad);
        Factura facturaReteIva = new Factura(calculoReteIva);
        System.out.println("Total con Rete IVA: "+ facturaReteIva.calcularTotalConImpuesto());
        System.out.println("Solo Rete IVA: "+facturaReteIva.calcularSoloImpuesto());
        
        //Cálculo de impuesto saludable
        Calculo calculoSaludable = new CalculoImpuestoSaludable(producto, cantidad);
        Factura facturaSaludable = new Factura(calculoSaludable);
        System.out.println("Total con impuesto saludable: "+facturaSaludable.calcularTotalConImpuesto());
        System.out.println("Solo impuesto saludable: "+facturaSaludable.calcularSoloImpuesto());
    }
}
