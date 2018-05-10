/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2.aplicacion.modelo.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public class GestorNumeros implements Serializable {

    List<Integer> lista = new ArrayList<>();

    public GestorNumeros() {
    }

    public List<Integer> getLista() {
        return lista;
    }

    public void setLista(List<Integer> lista) {
        this.lista = lista;
    }
    
    public void agregarNumero(Integer nuevoNumero){
        lista.add(nuevoNumero);
    }

    public int obtenerMenor() {
        int menor=0;
        if (!lista.isEmpty()) {
            menor = lista.get(0);
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i)<menor)
                menor = lista.get(i);
            }
        }
        return menor;
    }

    public int obetenerMayor() {
        int mayor=0;
        if (!lista.isEmpty()) {
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i) > mayor)
                mayor = lista.get(i);
            }
        }
        return mayor;
    }
    
    public double obtenerPromedio(){
        double promedio=0;
        if(!lista.isEmpty()){
            for(int i = 0;i<lista.size();i++){
                promedio=promedio+lista.get(i);
            }
            promedio = promedio / lista.size();
        }
        return promedio;
    }
}
