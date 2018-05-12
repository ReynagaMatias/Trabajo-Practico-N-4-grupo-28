/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import punto1.aplicacion.modelo.dominio.Conversor;

/**
 *
 * @author Alvaro
 */
@ManagedBean
@ViewScoped
public class ConversorFormBean implements Serializable{
    
    private Conversor conversion;
    private double valor;
    private String tipoConversion;
    private double resultadoConversion;

    /**
     * Creates a new instance of ConversorFormBean
     */
    public ConversorFormBean() {
        conversion = new Conversor();
    }
    
    public double convertirTemparatura(){
        switch (tipoConversion){
            case "°F to °C":
                resultadoConversion=conversion.convertirFarnheitACelcius(valor);
                break;
            case "°C to °F":
                resultadoConversion=conversion.convertirCelciusFarenheit(valor);
                break;
            case "°C to K":
                resultadoConversion=conversion.convertirCelciusAKelvin(valor);
                break;
            case "K to °C":
                resultadoConversion=conversion.convertirKelvinACelcius(valor);
                break;
            case "°F to K":
                resultadoConversion=conversion.convertirFahrenheintAKelvin(valor);
                break;
            case "K to °F":
                resultadoConversion=conversion.convertirKelvinAFahrenheint(valor);
        }
        return resultadoConversion;
                
    }

    public double getResultadoConversion() {
        return resultadoConversion;
    }

    public void setResultadoConversion(double resultadoConversion) {
        this.resultadoConversion = resultadoConversion;
    }

    
    public Conversor getConversion() {
        return conversion;
    }

    public void setConversion(Conversor conversion) {
        this.conversion = conversion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipoConversion() {
        return tipoConversion;
    }

    public void setTipoConversion(String tipoConversion) {
        this.tipoConversion = tipoConversion;
    }
    
}
