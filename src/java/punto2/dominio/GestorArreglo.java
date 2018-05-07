/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2.dominio;

/**
 *
 * @author Alejandro
 */
public class GestorArreglo {

    int[] num = new int[100];
    int numeroAgregar;

    public GestorArreglo() {
    }

    public GestorArreglo(int numero) {
        this.numeroAgregar = numero;
    }

    public int getNumero() {
        return numeroAgregar;
    }

    public void setNumero(int numero) {
        this.numeroAgregar = numero;
    }

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }
    
    public void agregarNumero(){
        num[num.length]=numeroAgregar;
    }

    public int obtenerMayor() {
        int mayor = 0;
        for (int i = 0; i < num.length; i++) {
            mayor = num[0];
            if (mayor > num[i]) {
                mayor = num[i];
            }
        }
        return mayor;
    }

    public int obtenerMenor() {
        int menor = 0;
        for (int i = 0; i < num.length; i++) {
            menor = num[i];
            if (menor < num[i]) {
                menor = num[i];
            }
        }
        return menor;
    }
    
    public double calcularPromedio(){
        double promedio = 0;
        for(int i = 0;i<num.length;i++){
            promedio= promedio+num[i];
        }
        promedio= promedio / num.length+1;
        return promedio;
    }
}
