/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller5;

/**
 *
 * @author juanc
 */
public class ProductoFisico extends Producto implements Enviar {
    private double peso;
    public ProductoFisico(String nombre, double precio, int cantidad, double peso) {
        super(nombre, precio, cantidad);
        this.peso = peso;
    }

    @Override
    public double costoTotal() {
        return precio*cantidad*peso;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void enviarPorCorreo() {
        System.out.println("Estoy enviando un producto fisico por correo");
    }
    
}
