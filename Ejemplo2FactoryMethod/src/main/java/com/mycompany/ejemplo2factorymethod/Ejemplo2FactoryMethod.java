/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplo2factorymethod;

/**
 *
 * @author juanc
 */
public class Ejemplo2FactoryMethod {

    public static void main(String[] args) {
        Creadora creadora = new CreadoraNotificacionEmail();
        Notificacion notificacion = creadora.crearObjetoNotificacion();
        notificacion.enviar("MENSAJE");
    }
}
