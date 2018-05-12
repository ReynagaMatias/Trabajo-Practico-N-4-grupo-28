/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import punto8.aplicacion.modelo.dominio.Libro;

/**
 *
 * @author Alvaro
 */
@ManagedBean
@ViewScoped
public class LibroFormBean implements Serializable{
    
    private String ISBN;
    private String titulo;
    private String autor;
    private double precio;
    private List<Libro> libros;
    private Libro libro;

    /**
     * Creates a new instance of LibroFormBean
     */
    public LibroFormBean() {
        libros = new ArrayList();
    }

    public LibroFormBean(String ISBN, String titulo, String autor, double precio, List<Libro> libros, Libro libro) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.libros = libros;
        this.libro = libro;
    }
    
    public void agregarLibro(Libro libro){
        System.out.println("Esta Ingresando al metodo agregar libro");
        libros.add(libro);
        libro = new Libro();
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    
    
    
}
