/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller5;

/**
 *
 * @author juanc
 */
public class Taller5 {

    public static void main(String[] args) {
        Producto fisico = new ProductoFisico("Carro", 300, 1, 20000);
        Producto digital = new ProductoDigital("Call Of duty", 20, 1, 200);
        Producto mixto = new ProductoMixto("Pc",3000, 1, 12, 7);
        ProductoFisico fisico2 = new ProductoFisico("Carro", 300, 1, 20000);
        fisico2.enviarPorCorreo();
        ProductoMixto mixto2 = new
                 
         ProductoMixto("pc", 3000, 1, 12, 7);
        mixto2.enviarPorCorreo();
        Factura factura =  new Factura();
    
        System.out.println("El precio total del producto fisico es: "+factura.costo(fisico));
        System.out.println("El precio total del producto digital es: "+factura.costo(digital));
        System.out.println("El precio total del producto mixto es: "+factura.costo(mixto));
        
        System.out.println("Prueba fisico: ");
    }
}
