
package punto5.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Ines Coraite
 */
public class Profesor implements Serializable {
    // se definen los atributos de la clase Profesor
    private int nroLegajo;
    private String nombre;
    private String apellido;
    private String materia;
    
    // se crean los respectivos constructores de cada atributo

    public Profesor(int nroLegajo, String nombre, String apellido, String materia) {
        this.nroLegajo = nroLegajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
    }

    public Profesor() {
       
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
