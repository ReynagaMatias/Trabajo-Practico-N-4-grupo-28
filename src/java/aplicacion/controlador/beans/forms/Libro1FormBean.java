/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import punto7.modelo.dominio.utilis.GestorLibro1;
import punto7.modelo.dominio.utilis.Libro1;

/**
 *
 * @author  Ines
 */
@ManagedBean
@RequestScoped
public class Libro1FormBean {
  GestorLibro1 gestorLibro= new GestorLibro1();
    Libro1 nuevoLibro= new Libro1();

    public GestorLibro1 getGestorLibro() {
        return gestorLibro;
    }

    public void setGestorLibro(GestorLibro1 gestorLibro) {
        this.gestorLibro = gestorLibro;
    }

    public Libro1 getNuevoLibro() {
        return nuevoLibro;
    }

    public void setNuevoLibro(Libro1 nuevoLibro) {
        this.nuevoLibro = nuevoLibro;
    }

    public void agregarLibros(){
        gestorLibro.agregarLibro(nuevoLibro);
        nuevoLibro=new Libro1();
    }
 
    public Libro1FormBean() {
    }
    
}
