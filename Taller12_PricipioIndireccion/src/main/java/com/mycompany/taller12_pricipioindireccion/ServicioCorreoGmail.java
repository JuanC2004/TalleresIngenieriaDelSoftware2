/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller12_pricipioindireccion;

/**
 *
 * @author juanc
 */
public class ServicioCorreoGmail implements IServicioCorreo {

    @Override
    public Correo crear(Cliente cliente) {
        CorreoGmail correo = new CorreoGmail(cliente);
        correo.setCliente(cliente);
        return correo;
    }
    
}
