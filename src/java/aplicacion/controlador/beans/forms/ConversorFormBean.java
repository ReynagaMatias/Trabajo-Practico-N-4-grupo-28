/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import punto1.aplicacion.modelo.dominio.Conversor;

/**
 *
 * @author Alvaro
 */
@ManagedBean
@ViewScoped
public class ConversorFormBean {
    
    private Conversor conversor;
    private double valor;

    /**
     * Creates a new instance of ConversorFormBean
     */
    public ConversorFormBean() {
        conversor = new Conversor();
    }
    
     // getter y setter de lo atributos
    public Conversor getConversor() {
        return conversor;
    }

    public void setConversor(Conversor conversor) {
        this.conversor =  conversor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
