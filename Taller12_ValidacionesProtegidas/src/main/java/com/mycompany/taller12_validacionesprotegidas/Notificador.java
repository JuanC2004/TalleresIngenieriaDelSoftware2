/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller12_validacionesprotegidas;

/**
 *
 * @author juanc
 */
public class Notificador {
    private CanalNotificacion canal;
 
    public Notificador(CanalNotificacion canal){
        this.canal = canal;
    }
    
    public void enviarNotificacion(Notificacion notificacion){
        canal.enviarNotificacion(notificacion);
    }
}