
package punto7.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Ines Coraite
 */
public class Libro implements Serializable{
    // se definen los atributos de la clase Libro
     private String ISBN;
    private String titulo;
    private String autor;
    private double precio;
    
  // se crea sus respectivos constructores
    public Libro(String ISBN, String titulo, String autor, double precio) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
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
    
    
}


