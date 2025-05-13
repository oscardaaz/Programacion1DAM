/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud15;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author miguel.cormur
 */
@Entity
public class PropietarioCoche implements Serializable{
    @Id
    String dni;
    String nombre;
    String matricula_coche;
    String poblacion;
    Integer telefono;

    PropietarioCoche() {
    }

    PropietarioCoche(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return dni + "\t" + nombre + "\t" + matricula_coche + "\t" + poblacion + "\t" + telefono;
    }  
}
