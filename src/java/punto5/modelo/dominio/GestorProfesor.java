/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ines Coraite
 */
public class GestorProfesor implements Serializable {
     List<Profesor> profesores=new ArrayList();

   // se crean los constructores
    public GestorProfesor() {
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
    
    public void agregarProfesor(Profesor profesor){ // este metodo agrega a las lista profesores un nuevo profesor de tipo Profesor
        profesores.add(profesor);
        
    }
    
    
}
