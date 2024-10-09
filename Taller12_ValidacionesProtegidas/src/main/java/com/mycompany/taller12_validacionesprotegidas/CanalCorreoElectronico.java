/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller12_validacionesprotegidas;

/**
 *
 * @author juanc
 */
public class CanalCorreoElectronico implements CanalNotificacion {

    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        System.out.println("Enviando notificacion por correo electronico "+notificacion.getTitulo());
        System.out.println("Con el cuerpo: "+notificacion.getCuerpo());
    }
    
}
