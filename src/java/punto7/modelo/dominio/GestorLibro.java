
package punto7.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ines Coraite
 */
public class GestorLibro implements Serializable {
    List<Libro> listaLibros = new ArrayList<>();
    
    public GestorLibro() {
    }
    
    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void agregarLibro(Libro nuevoLibro){ // este metodo agrega un nuevoLibro a la listaLibros
        listaLibros.add(nuevoLibro);
    }    
}


