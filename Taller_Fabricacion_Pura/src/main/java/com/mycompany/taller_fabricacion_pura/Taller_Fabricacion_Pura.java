/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller_fabricacion_pura;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author juanc
 */
public class Taller_Fabricacion_Pura {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Quintero", "Alta suiza");
        Producto producto1 = new Producto("Fabuloso", 20000, 1);
        Producto producto2 = new Producto("Oreo",6000, 1);
        Producto producto3 = new Producto("Yogurt", 3500, 1);
        List<Producto> productos = new LinkedList<>();
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        FabricaPedidos fabrica = new FabricaPedidos();
        
        fabrica.crearPedido(cliente, productos);
    }
}
