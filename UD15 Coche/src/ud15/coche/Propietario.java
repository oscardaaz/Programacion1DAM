/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud15.coche;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author oscar.domalo
 */
@Entity
public class Propietario implements Serializable {

    @Id
    String dni;
    String nombre, matricula_coche, poblacion;
    int telefono;
    
    Propietario(){
    
    }

    public Propietario(String dni, String nombre, String matricula_coche, String poblacion, int telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.matricula_coche = matricula_coche;
        this.poblacion = poblacion;
        this.telefono = telefono;
    }

    

    

    @Override
    public String toString() {
        return "Propietario { " + "dni= " + dni + ", nombre= " + nombre + " }";
    }

   
    
    
    
    
    
}
