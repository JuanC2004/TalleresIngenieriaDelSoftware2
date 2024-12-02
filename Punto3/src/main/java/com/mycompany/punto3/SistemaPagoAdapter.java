/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.punto3;

/**
 *
 * @author juanc
 */
public class SistemaPagoAdapter  implements SistemaPago{
    private NuevoSistemaPagoOperacion nuevoSistemaPagoOperacion = new NuevoSistemaPagoOperacion();
    private NuevoSistemaPago nuevoSistemaPago;

    public SistemaPagoAdapter(NuevoSistemaPagoOperacion nuevoSistemaPagoOperacion, NuevoSistemaPago nuevoSistemaPago) {
        this.nuevoSistemaPagoOperacion = nuevoSistemaPagoOperacion;
        this.nuevoSistemaPago = nuevoSistemaPago;
    }

    @Override
    public void iniciarSesion(String nombre, String correo) {
        nuevoSistemaPagoOperacion.crearSesion(nuevoSistemaPago);
    }

    @Override
    public void validarDatos(String correo) {
        nuevoSistemaPagoOperacion.validarCorreo(nuevoSistemaPago);
    }

    @Override
    public void procesarPago() {
        nuevoSistemaPagoOperacion.validarAutorizacion();
        nuevoSistemaPagoOperacion.realizarPago();
    }
}
