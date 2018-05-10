/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto8.aplicacion.modelo.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import punto8.aplicacion.modelo.dominio.Libro;

/**
 *
 * @author Alejandro
 */
public class GestorLibros implements Serializable {

    private List<Libro> libros = new ArrayList<>();

    public GestorLibros() {
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void agregar(Libro libroAgregado) {
        libros.add(libroAgregado);
    }

    public Libro busqueda(String tituloBuscado) {
        System.out.println("entroa la busqueda");
        Libro librobuscado = null;
        if (tituloBuscado != null) {
            for (int i = 0; i < libros.size(); i++) {
                if (libros.get(i).getTitulo().equals(tituloBuscado)) {
                    librobuscado = libros.get(i);
                }
            }
        }
        return librobuscado;
    }

}
