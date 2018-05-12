/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto7.aplicacion.modelo.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import punto8.aplicacion.modelo.dominio.Libro;

/**
 *
 * @author Alvaro
 */
public class GestorLibro implements Serializable{
    private List<Libro> libros= new ArrayList();

    public GestorLibro() {
        libros = new ArrayList();
    }
    
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    
    
}
