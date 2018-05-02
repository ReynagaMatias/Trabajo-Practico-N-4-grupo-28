/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import punto3.aplicacion.modelo.dominio.Calculadora;

/**
 *
 * @author Alvaro
 */
@ManagedBean
@RequestScoped
public class CalculadoraFromBean {
    private double numeroA;
    private double numeroB;
    private Calculadora calculadora;

    /**
     * Creates a new instance of CalculadoraFromBean
     */
    public CalculadoraFromBean() {
        calculadora=new Calculadora();
    }
    
    public double sumar(){
        return this.calculadora.sumar(numeroA, numeroB);
    }
    
    public double restar(){
        return this.calculadora.restar(numeroA, numeroB);
    }
    
    public double multiplicar(){
        return this.calculadora.multiplicar(numeroA, numeroB);
    }
    
    public double dividir(){
        return this.calculadora.dividir(numeroA, numeroB);
    }
    
    
    
    public double getNumeroA() {
        return numeroA;
    }

    public void setNumeroA(double numeroA) {
        this.numeroA = numeroA;
    }

    public double getNumeroB() {
        return numeroB;
    }

    public void setNumeroB(double numeroB) {
        this.numeroB = numeroB;
    }

    public Calculadora getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
    
}
