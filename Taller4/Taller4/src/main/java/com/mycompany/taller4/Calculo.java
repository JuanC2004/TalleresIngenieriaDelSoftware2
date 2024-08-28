/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller4;

/**
 *
 * @author juanc
 */
public abstract class Calculo {
   Producto producto;
   int cantidad;

    public Calculo(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
   
    public abstract double calcularImpuesto();
   
}
