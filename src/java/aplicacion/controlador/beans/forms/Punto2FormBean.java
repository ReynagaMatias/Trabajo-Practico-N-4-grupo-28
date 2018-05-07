package aplicacion.controlador.beans.forms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import punto2.dominio.GestorArreglo;

/**
 *
 * @author Alejandro
 */
@ManagedBean
@ViewScoped
public class Punto2FormBean implements Serializable{
    GestorArreglo gestor = new GestorArreglo();

    /**
     * Creates a new instance of Punto2FormBean
     */
    public Punto2FormBean() {
        gestor = new GestorArreglo();
    }

    public GestorArreglo getGestor() {
        return gestor;
    }

    public void setGestor(GestorArreglo gestor) {
        this.gestor = gestor;
    }
    
}
