/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import punto8.aplicacion.modelo.dominio.Libro;
import punto8.aplicacion.modelo.utils.GestorLibros;

/**
 *
 * @author Alejandro
 */
@ManagedBean
@ViewScoped
public class punto8FormBean implements Serializable {

    GestorLibros gestor = new GestorLibros();
    Libro nuevoLibro = new Libro();
    String titulobuscado;
    Libro librobuscado = new Libro();

    /**
     * Creates a new instance of punto8FormBean
     */
    public punto8FormBean() {
        gestor = new GestorLibros();
        nuevoLibro = new Libro();
        librobuscado = new Libro();
    }

    public String getTitulobuscado() {
        return titulobuscado;
    }

    public void setTitulobuscado(String titulobuscado) {
        this.titulobuscado = titulobuscado;
    }

    public GestorLibros getGestor() {
        return gestor;
    }

    public void setGestor(GestorLibros gestor) {
        this.gestor = gestor;
    }

    public Libro getNuevoLibro() {
        return nuevoLibro;
    }

    public void setNuevoLibro(Libro nuevoLibro) {
        this.nuevoLibro = nuevoLibro;
    }

    public void agregar() {
        gestor.agregar(nuevoLibro);
        nuevoLibro = new Libro();
    }

    public void buscar() {
        if (titulobuscado != null) {
            System.out.println("entro a la busqueda del bean");
            librobuscado = gestor.busqueda(titulobuscado);
            System.out.println(librobuscado.getAutor());
        } else {

            librobuscado = null;
            System.out.println("no se iso la busqueda");
        }
    }

    public Libro getLibrobuscado() {
        return librobuscado;
    }

    public void setLibrobuscado(Libro librobuscado) {
        this.librobuscado = librobuscado;
    }

}
