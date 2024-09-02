/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller7cumpleidp;

/**
 *
 * @author juanc
 */
public class Taller7CumpleIDP {

    public static void main(String[] args) {
        ServicioDeNotificacionesImpl servicio = new ServicioDeNotificacionesImpl();
        Usuario usuario = new Usuario(servicio);
        
        usuario.enviarNotificacion("Esto es un mensaje cualquiera");
    }
}
