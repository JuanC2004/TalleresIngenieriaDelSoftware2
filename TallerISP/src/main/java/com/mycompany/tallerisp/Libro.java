/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerisp;

/**
 *
 * @author juanc
 */
public class Libro {
    private String nombre;
    private String autor;
    private int numeroHojas;

    public Libro(String nombre, String autor, int numeroHojas) {
        this.nombre = nombre;
        this.autor = autor;
        this.numeroHojas = numeroHojas;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the numeroHojas
     */
    public int getNumeroHojas() {
        return numeroHojas;
    }

    /**
     * @param numeroHojas the numeroHojas to set
     */
    public void setNumeroHojas(int numeroHojas) {
        this.numeroHojas = numeroHojas;
    }
    
}
