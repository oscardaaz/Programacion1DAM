
package ud15.coche;

import java.io.Serializable;

/**
 *
 * @author oscar.domalo
 */

import javax.persistence.*;
@Entity

public class Coche implements Serializable{
    
    @Id
    String matricula;
    
    String marca, modelo;
    int numPlazas;

     Coche() {
        
    }

     Coche(String matricula, String marca, String modelo, int numPlazas) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.numPlazas = numPlazas;
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", numPlazas=" + numPlazas + '}';
    }
   
}
