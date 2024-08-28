/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller5;

/**
 *
 * @author juanc
 */
public class ProductoMixto extends Producto implements Enviar{
    private double peso;
    private double tamañoArchivo;
    
    public ProductoMixto(String nombre, double precio, int cantidad, double peso, double tamañoArchivo) {
        super(nombre, precio, cantidad);
        this.peso = peso;
        this.tamañoArchivo = tamañoArchivo;
    }

    @Override
    public double costoTotal() {
        return precio*cantidad*(peso+tamañoArchivo);
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

    @Override
    public void enviarPorCorreo() {
        System.out.println("Enviando por correo este producto mixto");
    }
    
    
}
