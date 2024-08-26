/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author juanc
 */
public class EnvioExpress extends Envio {

    @Override
    public double calcularCosto(double peso, double distancia) {
        return peso * 1 + distancia * 0.2;
    }
    
    
}
