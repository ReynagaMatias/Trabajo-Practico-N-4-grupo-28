/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto7.modelo.dominio.utilis;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ines
 */
public class GestorLibro1 {
    
     List<Libro1> listaLibros = new ArrayList();

    public List<Libro1> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro1> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public GestorLibro1() {
    }
    
    public void agregarLibro(Libro1 nuevoLibro){
        listaLibros.add(nuevoLibro);
        
    }
    
    
}
