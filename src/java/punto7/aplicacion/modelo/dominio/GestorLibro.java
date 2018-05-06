/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto7.aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ines Coraite
 */
public class GestorLibro implements Serializable {
    List<Libro> listaLibros = new ArrayList();

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public GestorLibro() {
    }
    
    public void agregarLibro(Libro nuevoLibro){
        listaLibros.add(nuevoLibro);
        
    }
}
