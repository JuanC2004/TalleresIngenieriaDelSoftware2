/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller10_1grasp;

/**
 *
 * @author juanc
 */
public class Taller10_1GRASP {

    public static void main(String[] args) {
        Orden orden1 = new Orden();
        orden1.agregarComputadora("Intel i7", "NVIDIA GTX 3080", 16);
        System.out.println("Prueba 1 - Computadora agregada con Intel i7, NVIDIA GTX 3080, 16GB RAM");
        
      
        orden1.agregarComputadora("AMD Ryzen 9", "NVIDIA RTX 3090", 32);
        orden1.agregarComputadora("Intel i5", "AMD Radeon RX 6700", 8);
        System.out.println("Prueba 2 - Agregadas 2 computadoras más: AMD Ryzen 9 con 32GB y Intel i5 con 8GB de RAM");
        
        
        Orden orden2 = new Orden();
        orden2.agregarComputadora("Apple M1", "Apple Integrated", 16);
        System.out.println("Prueba 3 - Agregada computadora Apple M1 con gráfica integrada y 16GB de RAM");
    }
}
