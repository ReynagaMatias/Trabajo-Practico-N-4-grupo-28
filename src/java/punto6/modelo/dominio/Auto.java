/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Ines Coraite
 */
public class Auto implements Serializable{
    // aqui se define los atributos de la clase Auto
    private String patente;
    private String marca;
    private String modelo;
    private String color;
    private String tipoDeCombustible;
    
    // Sus respectivos constructores

    public Auto(String patente, String marca, String modelo, String color, String tipoDeCombustible) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public Auto() {
        
    }

    
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }
    
    
}
