/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto2;

/**
 *
 * @author juanc
 */
public class Punto2 {

    public static void main(String[] args) {
        Hamburguesa hamburguesa = new Builder().setTipoTomate("Cherry")
                                               .setTipoCarne("Molida")
                                               .setTipoQueso("Cheddar")
                                               .setTipoPan("Brioche")
                                               .build();
        System.out.println(hamburguesa);
    }
}
