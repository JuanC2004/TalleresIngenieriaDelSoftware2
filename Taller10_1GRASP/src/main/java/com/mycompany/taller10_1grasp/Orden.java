/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller10_1grasp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanc
 */
public class Orden {
    private List<Computadora> computadoras = new ArrayList<>();
    private FabricaComputadoras fabrica  = new FabricaComputadoras();
    
    public void agregarComputadora(String procesador, String tajetaGrafica, int ram){
        Computadora computadora = fabrica.crearComputadora(procesador, tajetaGrafica, ram);
        computadoras.add(computadora);
    }
}
