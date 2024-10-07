/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller_polimorfismo;

/**
 *
 * @author juanc
 */
public class Taller_polimorfismo {

    public static void main(String[] args) {
        Coche coche = new Coche();
        Avion avion = new Avion();
        Bicicleta bicicleta = new Bicicleta();
        
        
        System.out.println("INFORMACION COCHE");
        coche.acelerar();
        coche.frenar();
        coche.mostrarInformacion();
        System.out.println("--------------------------------------");
        System.out.println("INFORMACION AVION");
        avion.acelerar();
        avion.frenar();
        avion.mostrarInformacion();
        System.out.println("--------------------------------------");
        System.out.println("INFORMACION BICICLETA");
        bicicleta.acelerar();
        bicicleta.frenar();
        bicicleta.mostrarInformacion();
        
    }
}
