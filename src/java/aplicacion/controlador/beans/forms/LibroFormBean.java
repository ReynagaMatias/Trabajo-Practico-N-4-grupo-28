/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import punto7.modelo.dominio.GestorLibro;
import punto7.modelo.dominio.Libro;

/**
 *
 * @author ribeiro
 */
@ManagedBean
@RequestScoped
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
