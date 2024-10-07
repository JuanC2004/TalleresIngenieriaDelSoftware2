/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_fabricacion_pura;

import java.util.List;

/**
 *
 * @author juanc
 */
public class FabricaPedidos {
    
    void crearPedido(Cliente cliente, List<Producto> productos){
        System.out.println("Creando pedido para el cliente: "+cliente.getNombre());
        System.out.println("Con los siguientes productos");
        for (Producto producto : productos) {
            System.out.println(producto.getNombre());
        }
    }
}
