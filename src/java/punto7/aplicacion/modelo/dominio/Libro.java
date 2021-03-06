/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto7.aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Alvaro
 */
public class Libro implements Serializable{
    private String ISBN;
    private String autor;
    private String titulo;
    private double precio;

    public Libro(String ISBN, String autor, String titulo, double precio) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.titulo = titulo;
        this.precio = precio;
    }

    public Libro() {
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
