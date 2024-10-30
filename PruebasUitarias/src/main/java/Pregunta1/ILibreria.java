/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Pregunta1;

import java.util.List;

/**
 *
 * @author juanc
 */
public interface ILibreria {
    void añadirLibro(Libro libro);
    Libro buscarLibro(String titulo);
    List<Libro> buscarLibroAutor(String autor);
    List<Libro> buscarLibroPrecios(double precio1, double precio2);
    List<Libro> buscarLibrosAno(int ano);
}
