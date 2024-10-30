package Pregunta1;

import java.util.List;

public class Libreria implements ILibreria{
    
    List<Libro>libros;

    @Override
    public void añadirLibro(Libro libro) {
        libros.add(libro);
    }

    @Override
    public Libro buscarLibro(String titulo) {
        for (Libro libro:libros){
            if(libro.getTitulo()== titulo){
                return libro;
            }
        }
        System.out.println("No se encontro el libro");
        return null;
    }

    @Override
    public List<Libro> buscarLibroAutor(String autor) {
        List<Libro>encontrados = null;
        for(Libro libro:libros){
            if(libro.getAutor()== autor){
                encontrados.add(libro);
            }
        }
        return encontrados;
    }


    @Override
    public List<Libro> buscarLibroPrecios(double precio1, double precio2) {
        List<Libro>encontrados = null;
        for(Libro libro:libros){
            if(libro.getPrecio()>precio1 && libro.getPrecio()<precio2){
                encontrados.add(libro);
            }
        }
        return encontrados;
    }

    @Override
    public List<Libro> buscarLibrosAno(int ano) {
        List<Libro> encontrados = null;
        for(Libro libro:libros){
            if(libro.getAño()==ano){
                encontrados.add(libro);
            }
        }
        return encontrados;
    }
}
