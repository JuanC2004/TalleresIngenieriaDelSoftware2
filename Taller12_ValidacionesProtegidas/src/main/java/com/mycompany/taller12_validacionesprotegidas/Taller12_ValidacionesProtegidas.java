/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller12_validacionesprotegidas;

/**
 *
 * @author juanc
 */
public class Taller12_ValidacionesProtegidas {

    public static void main(String[] args) {
        CanalNotificacion canalCorreo = new CanalCorreoElectronico();
        Notificador notificador = new Notificador(canalCorreo);
        
        Notificacion notificacion = new Notificacion("Nueva notificacion", "Que se dice");
        notificador.enviarNotificacion(notificacion);
    }
}
