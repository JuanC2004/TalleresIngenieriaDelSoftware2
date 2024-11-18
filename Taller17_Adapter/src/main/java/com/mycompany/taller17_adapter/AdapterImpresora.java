/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller17_adapter;

/**
 *
 * @author juanc
 */
public class AdapterImpresora implements IImpresora {
    
    private Impresora impresora;

    public AdapterImpresora(Impresora impresora) {
        this.impresora = impresora;
    }
    
    
    
    @Override
    public void imprimir() {
        System.out.println("Imprimiendo");
    }
    
}
