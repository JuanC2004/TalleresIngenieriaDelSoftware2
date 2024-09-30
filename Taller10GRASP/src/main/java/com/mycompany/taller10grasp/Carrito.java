/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller10grasp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanc
 */
public class Carrito {
    List<Libro> libros = new ArrayList<>();
    
    public double calcularPrecioTotal(int cantidad){
        double total = 0;
        for (Libro libro : libros){
            total += libro.getPrecio() * cantidad;
        }
        return total;
    }
}
