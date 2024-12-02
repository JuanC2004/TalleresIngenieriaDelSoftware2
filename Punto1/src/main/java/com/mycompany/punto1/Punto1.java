/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto1;

/**
 *
 * @author juanc
 */
public class Punto1 {

    public static void main(String[] args) {
        InterfazFabrica fabrica = new FabricaExpress();
        Paquete paquete = fabrica.CrearPaquete();
        
        paquete.enviar();
        
        fabrica = new FabricaRegular();
        paquete = fabrica.CrearPaquete();
        
        paquete.enviar();
    }
}
