/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller17_adapter;

/**
 *
 * @author juanc
 */
public class Cliente {
    Impresora impresoraLaser = new ImpresoraLaser();
    Impresora impresoraTinta = new ImpresoraTinta();
    
    
    IImpresora impresoraLaserAdapt = new AdapterImpresora(impresoraLaser);
    IImpresora impresoraTintaAdapt = new AdapterImpresora(impresoraTinta);
    
    impresoraLaserAdapt.imprimir();
    impresoraTintaAdapt.imprimir();
}
