/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;
import punto6.modelo.dominio.Auto;
import punto6.modelo.dominio.GestorAuto;

/**
 *
 * @author Ines Coraite
 */
@ManagedBean
@ViewScoped
public class AutoFormBean implements Serializable {
   // aqui se instancias las clases necesarias
    GestorAuto gestorAuto=new GestorAuto();
    Auto autoseleccionado = new Auto();


    /**
     * Creates a new instance of AutoFormBean
     */ 
    //respectivos constructores
    public AutoFormBean() {
    }

    public GestorAuto getGestorAuto() {
        return gestorAuto;
    }

    public void setGestorAuto(GestorAuto gestorAuto) {
        this.gestorAuto = gestorAuto;
    }
      public void asignarAutoSeleccionado(Auto auto) { // este metodo asinga el autoseleccionado de tipo auto
        this.autoseleccionado = auto;

    }
    public void modificarAuto(){
        
        gestorAuto.modificarAuto(autoseleccionado);
  
    }

    public Auto getAutoseleccionado() {
        return autoseleccionado;
    }

    public void setAutoseleccionado(Auto autoseleccionado) {
        this.autoseleccionado = autoseleccionado;
    }
            
            
    
    
}
