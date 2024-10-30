/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta1;

import java.util.List;

/**
 *
 * @author juanc
 */
public class Main {
    public static void main(String[] args) {
        
        //DRY
        Orden orden = new Orden();
        double precioFinal = orden.calcularPrecioTotal(200, 10);
        System.out.println("El precio final es: "+precioFinal);
        
        
        //CONTROLADOR
        Libro libro1 = new Libro("Cien soledad", "Gabo", 20000, 1998);
        Libro libro2 = new Libro("Libro2", "Juan", 30000, 2024);
        Libro libro3 = new Libro("La hojarasca", "Gabo", 60000, 1888);
        
        Libreria libreria = new Libreria();
        
        libreria.añadirLibro(libro1);
        libreria.añadirLibro(libro2);
        libreria.añadirLibro(libro3);
        
        Libro puntoa = libreria.buscarLibro("La hojarasca");
        if(puntoa == null){
            System.out.println("NO SE ENCUENTRA EL LIBRO");
        }else{
            System.out.println("Se encontro el libro exitosamente");
        }
        
        List<Libro>puntob = libreria.buscarLibroAutor("gabo");
        System.out.println("Libros Encontrados por autor");
        for(Libro libro: puntob){
            System.out.println(libro.getTitulo());
        }
        List<Libro>puntoc = libreria.buscarLibroPrecios(21000, 59000);
        System.out.println("Libros encontrados por precios: ");
        for(Libro libro: puntoc){
            System.out.println(libro.getTitulo());
        }
        List<Libro>puntod = libreria.buscarLibrosAno(2024);
        System.out.println("Libros encontrados por años: ");
        for(Libro libro: puntod){
            System.out.println(libro.getTitulo());
        }
    }
}
