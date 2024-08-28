/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller5;

/**
 *
 * @author juanc
 */
public class ProductoDigital extends Producto{

    private double tamañoArchivo;

    public ProductoDigital(String nombre, double precio, int cantidad, double tamañoArchivo) {
        super(nombre, precio, cantidad);
        this.tamañoArchivo = tamañoArchivo;
    }
    
    

    @Override
    public double costoTotal() {
        return precio*cantidad*tamañoArchivo;
    }

    /**
     * @return the tamañoArchivo
     */
    public double getTamañoArchivo() {
        return tamañoArchivo;
    }

    /**
     * @param tamañoArchivo the tamañoArchivo to set
     */
    public void setTamañoArchivo(double tamañoArchivo) {
        this.tamañoArchivo = tamañoArchivo;
    }

    
    
}
