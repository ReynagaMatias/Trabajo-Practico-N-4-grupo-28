
package punto6.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ines Coraite
 */
public class GestorAuto implements Serializable{
    
    
    List<Auto> listaAutos = new ArrayList(); 
    Auto auto = new Auto(); //

    public GestorAuto() { //Este metedo carga la listaAutos de tipo Libro de manera estatico

        listaAutos.add(auto = new Auto("JPK-555", "Renaul", "Duster", "Rojo", "Nafta"));
        listaAutos.add(auto = new Auto("JPK-345", "Fiat", "Palio", "Azul", "Diesel"));
        listaAutos.add(auto = new Auto("JPK-576", "Renaul", "Duster", "Negro", "Nafta"));
        listaAutos.add(auto = new Auto("JPK-5544", "For", "For Ranger", "Blanco", "Diesel"));

    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public List<Auto> getListaAutos() {
        return listaAutos;
    }

    public void setListaAutos(List<Auto> listaAutos) {
        this.listaAutos = listaAutos;
    }

    public void modificarAuto(Auto autoseleccionado) { // este metodo modifica el auto seleccionado 
        
        for (int i = 0; i < listaAutos.size(); i++) {
            if (listaAutos.get(i).equals(autoseleccionado)) {
               listaAutos.set(i, autoseleccionado); // modifica en auto seleccionado con la operacion set
               
            }

        }

    }
    
}
