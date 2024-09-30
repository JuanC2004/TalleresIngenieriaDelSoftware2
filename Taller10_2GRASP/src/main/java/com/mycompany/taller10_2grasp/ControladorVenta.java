/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller10_2grasp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanc
 */
public class ControladorVenta {
    
    private List <Entrada> entradas = new ArrayList<>();
    
    public void comprarEntrada (String tipoEntrada) {
        Entrada entrada = encontrarEntrada(tipoEntrada);
        if(entrada.isDisponible()) {
            entrada.setDisponible(false);
            
            System.out.println("Entrada Comprada.");
        } else {
            System.out.println("Entrada no disponible");
        }
    }
    
    private Entrada encontrarEntrada(String tipoEntrada){
        Entrada miEntrada = null;
        if(tipoEntrada == "Vip"){
            miEntrada = new Entrada(tipoEntrada, 10.00, true);
        }
        else if(tipoEntrada == "General"){
            miEntrada = new Entrada(tipoEntrada, 5.00, false);
            
        }
        return miEntrada;
        
    }
}
