
package aplicacion.controlador.beans.forms;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import punto7.modelo.dominio.GestorLibro;
import punto7.modelo.dominio.Libro;

/**
 *
 * @author Ines Coraite
 */
@ManagedBean
@ViewScoped
public class LibroFormBean implements Serializable{
 // se instancias las clases GestorLibro y Libro
    GestorLibro gestorLibro= new GestorLibro();
    Libro nuevoLibro= new Libro();
    
    // se crea los respectivos constructores.
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
    
    public void agregarLibros(){ // este metodo hace el llamamiento del metodo agregarLibro y le pasa como parametro nuevoLibro 
        gestorLibro.agregarLibro(nuevoLibro);
        nuevoLibro=new Libro(); 
    }
 
    
}
