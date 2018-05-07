/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;
import punto5.modelo.dominio.GestorProfesor;
import punto5.modelo.dominio.Profesor;

/**
 *
 * @author Ines Coraite
 */
@ManagedBean
@ViewScoped
public class ProfesorFormBean implements Serializable {
    // se instancian las clases necesarias
    GestorProfesor gestorProfesor=new GestorProfesor();
    Profesor profesor =new Profesor();
    Profesor profesorSeleccionado = new Profesor();
   // se crean los constructores
    public Profesor getProfesorSeleccionado() {
        return profesorSeleccionado;
    }

    public void setProfesorSeleccionado(Profesor profesorSeleccionado) {
        this.profesorSeleccionado = profesorSeleccionado;
    }
    
    public GestorProfesor getGestorProfesor() {
        return gestorProfesor;
    }

    public void setGestorProfesor(GestorProfesor gestorProfesor) {
        this.gestorProfesor = gestorProfesor;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    public ProfesorFormBean() {
        
    }
    
    public void agregarProfesor(){ // este metodo hace el llamamiento del metodo agregarProfesor y pasa como parametro profesor de tipo Profesor
        gestorProfesor.agregarProfesor(profesor);
        profesor=new Profesor();
    }
    public void asignarProfesorSeleccionado (Profesor profesor){ // este metodo asigna a profesorSelecionado
        this.profesorSeleccionado= profesor;
    }
    
}
