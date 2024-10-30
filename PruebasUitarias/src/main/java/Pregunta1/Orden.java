/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta1;

/**
 *
 * @author juanc
 */
public class Orden {
    double impuesto;
    double precio;
    double descuento;
   
    
    public double calcularPrecioTotal(double precio, double descuento){
        double precioDescuento = precio - descuento;
        double impuesto = precioDescuento * 0.1;
        
        return precioDescuento - impuesto;
    }
}

