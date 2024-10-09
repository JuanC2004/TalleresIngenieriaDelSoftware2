/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller12_pricipioindireccion;

/**
 *
 * @author juanc
 */
public class Taller12_PricipioIndireccion {

    public static void main(String[] args) {
        ServicioCorreoGmail servicioCorreoGmail = new ServicioCorreoGmail();
        Cliente cliente1 = new Cliente("Majo", "123456789");
        CorreoGmail correoGmail = (CorreoGmail)servicioCorreoGmail.crear(cliente1);
        System.out.println("CORREO GMAIL PARA: "+ correoGmail.getCliente().getNombre());
        
        ServicioCorreoOutlook servicioCorreoOutlook = new ServicioCorreoOutlook();
        Cliente cliente2 = new Cliente("Juan", "1055750413");
        CorreoOutlook correoOutlook = (CorreoOutlook) servicioCorreoOutlook.crear(cliente2);
        System.out.println("CORREO OUTLOOK PARA: "+ correoOutlook.getCliente().getNombre());
    }
}
