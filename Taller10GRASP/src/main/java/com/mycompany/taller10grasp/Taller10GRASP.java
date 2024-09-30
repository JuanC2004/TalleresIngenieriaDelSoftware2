/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller10grasp;

/**
 *
 * @author juanc
 */
public class Taller10GRASP {

    public static void main(String[] args) {
        //Prueba 1 
        Libro libro1 = new Libro("El quijote", "Miguel de cervantes", "98-3-16-14810-0", 15.50);
        Carrito carrito1 = new Carrito();
        carrito1.libros.add(libro1);
        System.out.println("Prueba 1 precio total: " +carrito1.calcularPrecioTotal(1));
        
        Libro libro2 = new Libro("La hojarasca", "Gabriel Garcia Marquez", "099431", 10.00);
        carrito1.libros.add(libro2);
        System.out.println("Prueba 2 precio total: "+carrito1.calcularPrecioTotal(1));
        
        Carrito carrito2 = new Carrito();
        System.out.println("Prueba 3: "+carrito2.calcularPrecioTotal(1));
    }
}
