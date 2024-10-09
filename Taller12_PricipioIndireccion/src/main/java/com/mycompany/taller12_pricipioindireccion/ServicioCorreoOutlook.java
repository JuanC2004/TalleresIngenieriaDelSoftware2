/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller12_pricipioindireccion;

/**
 *
 * @author juanc
 */
public class ServicioCorreoOutlook implements IServicioCorreo{

    @Override
    public Correo crear(Cliente cliente) {
        CorreoOutlook correo = new CorreoOutlook(cliente);
        correo.setCliente(cliente);
        return correo;
    }
    
}
