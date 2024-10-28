/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo2factorymethod;

/**
 *
 * @author juanc
 */
public class NotificacionSMS implements Notificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Estoy enviando notificacion por SMS");
    }
    
}
