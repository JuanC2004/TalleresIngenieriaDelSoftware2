/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller7_3;

/**
 *
 * @author juanc
 */
public class ProcesarOrdenFedexImpl implements IProcesarOrdenFedex{

    
    
    @Override
    public void enviarOrdenFedex(Orden orden) {
        System.out.println(orden.getLugarOrigen());
        System.out.println("HACIA: ");
        System.out.println(orden.getLugarDestino());
        System.out.println("CON LA OPERADORA FEDEX");
    }
    
}
