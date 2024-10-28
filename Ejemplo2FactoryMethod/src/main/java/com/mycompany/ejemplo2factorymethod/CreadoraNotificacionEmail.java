/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo2factorymethod;

/**
 *
 * @author juanc
 */
public class CreadoraNotificacionEmail extends Creadora{

    @Override
    public Notificacion crearObjetoNotificacion() {
        return new NotificacionEmail();
    }
    
}
