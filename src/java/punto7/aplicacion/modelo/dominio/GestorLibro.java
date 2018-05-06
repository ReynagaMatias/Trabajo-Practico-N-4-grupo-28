
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
