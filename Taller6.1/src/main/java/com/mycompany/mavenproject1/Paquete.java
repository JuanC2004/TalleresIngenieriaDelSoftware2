/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author juanc
 */
public abstract class Paquete {
    private double peso;
    private double dimensiones;

    public Paquete(double peso, double dimensiones) {
        this.peso = peso;
        this.dimensiones = dimensiones;
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
     * @return the dimensiones
     */
    public double getDimensiones() {
        return dimensiones;
    }

    /**
     * @param dimensiones the dimensiones to set
     */
    public void setDimensiones(double dimensiones) {
        this.dimensiones = dimensiones;
    }
    
}
