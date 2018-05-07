/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1.aplicacion.modelo.dominio;

/**
 *
 * @author Alvaro
 */
public class Conversor {
     //Metodo para convertir Fahrenheit a Celcius
    public Double convertirFarnheitACelcius(Double farenheit){
        return  (farenheit-32) / 1.8;
    }
    //Metodo para convertir Celcius a Fahrenheint
    public Double convertirCelciusFarenheit(Double celcius){
        return celcius * 1.8 + 32;
    }
    //Metodo para convertir de Celcius a Kelvin
    public Double convertirCelciusAKelvin(Double celcius){
        return celcius + 273.15;
    }
    //Metodo para convertir de Celcius a Kelvin
    public Double convertirKelvinACelcius(Double kelvin){
        return kelvin - 273.15;
    }
    //Metodo para convertir de Fahrenheit a Kelvin
    public Double convertirFahrenheintAKelvin (Double fahrenheint){
        return 5/9 * (fahrenheint + 459.67);
    }
    //Metodo para convertir de Kelcin a Fahrenheint
    public Double convertirKelvinAFahrenheint(Double kelvin){
        //return 1.8 *(kelvin – 273.15) + 32;
        return 1.8 * (kelvin - 273.15)+32;
    }
    
}
