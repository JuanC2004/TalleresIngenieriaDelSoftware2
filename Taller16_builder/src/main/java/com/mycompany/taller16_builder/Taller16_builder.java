/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller16_builder;

/**
 *
 * @author juanc
 */
public class Taller16_builder {

    public static void main(String[] args) {
        Builder builder = new Builder().setNombre("Juan Camilo").setEdad(20);
        Usuario usuario = builder.build();
        usuario.infoUsuario();
    }
}
