/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;

import javax.faces.view.ViewScoped;
import punto7.aplicacion.modelo.dominio.GestorLibro;
import punto7.aplicacion.modelo.dominio.Libro;

/**
 *
 * @author Ines Coraite
 */
@ManagedBean
@ViewScoped
public class Punto7FormBean implements Serializable {
 
    GestorLibro gestorLibro=new GestorLibro();
    Libro nuevoLibro = new Libro();

    public Libro getNuevoLibro() {
        return nuevoLibro;
    }

    public void setNuevoLibro(Libro nuevoLibro) {
        this.nuevoLibro = nuevoLibro;
    }
   
    public GestorLibro getGestorLibro() {
        return gestorLibro;
    }

    public void setGestorLibro(GestorLibro gestorLibro) {
        this.gestorLibro = gestorLibro;
    }
    
    
    public Punto7FormBean() {
    }
    
    public void agregarListaLibros(){
        gestorLibro.agregarLibro(nuevoLibro);
        nuevoLibro= new Libro();
    }
    
    
}
