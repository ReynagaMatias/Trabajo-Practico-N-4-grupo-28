
package aplicacion.controlador.beans.forms;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import punto7.modelo.dominio.GestorLibro;
import punto7.modelo.dominio.Libro;

/**
 *
 * @author ribeiro
 */
@ManagedBean
@ViewScoped
public class LibroFormBean implements Serializable{

    GestorLibro gestorLibro= new GestorLibro();
    Libro nuevoLibro= new Libro();
    
    public LibroFormBean() {
        
    }
    
    public GestorLibro getGestorLibro() {
        return gestorLibro;
    }

    public void setGestorLibro(GestorLibro gestorLibro) {
        this.gestorLibro = gestorLibro;
    }

    public Libro getNuevoLibro() {
        return nuevoLibro;
    }

    public void setNuevoLibro(Libro nuevoLibro) {
        this.nuevoLibro = nuevoLibro;
    }
    
    public void agregarLibros(){
        gestorLibro.agregarLibro(nuevoLibro);
        nuevoLibro=new Libro();
    }
 
    
}
