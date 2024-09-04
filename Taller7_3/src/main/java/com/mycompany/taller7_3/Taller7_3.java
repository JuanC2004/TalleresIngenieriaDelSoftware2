/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller7_3;

/**
 *
 * @author juanc
 */
public class Taller7_3 {

    public static void main(String[] args) {
        IProcesarOrdenFedex procesarOrdenFedex = new ProcesarOrdenFedexImpl();
        IProcesarOrdenUPS procesarOrdenUPS = new ProcesarOrdenUPSImpl();
        IProcesarOrdenDHL procesarOrdenDHL = new ProcesarOrdenDHLImpl();
        SistemaEnvios sistemaEnvios = new SistemaEnvios(procesarOrdenFedex, procesarOrdenUPS, procesarOrdenDHL);
        Orden orden = new Orden(null, "MANIZALES", "BOGOTA");
        sistemaEnvios.enviarOrdenFedex(orden);
        sistemaEnvios.enviarOrdenUPS(orden);
        sistemaEnvios.enviarOrdenDHL(orden);
    }
}
