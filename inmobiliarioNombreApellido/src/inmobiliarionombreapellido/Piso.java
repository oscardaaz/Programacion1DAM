/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmobiliarionombreapellido;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author oscar.domalo
 */

@Entity
public class Piso implements Comparable<Piso>, Serializable{
    
    @Id
    String referencia;
    
    String provincia;
    Integer m2, numeroHabitaciones, precio,telefono;

    public Piso() {
        
    }

    public Piso(String referencia, String provincia, Integer m2, Integer numeroHabitaciones, Integer precio, Integer telefono) {
        this.referencia = referencia;
        this.provincia = provincia;
        this.m2 = m2;
        this.numeroHabitaciones = numeroHabitaciones;
        this.precio = precio;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Piso { " + " referencia = " + referencia + " , provincia = " + provincia + " "
                + " , m2 = " + m2 + " , numeroHabitaciones = " + numeroHabitaciones + " , precio = " + precio + " , telefono = " + telefono + " } ";
    }

    @Override
    public int compareTo(Piso o) {
        return this.precio.compareTo(o.precio);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Piso other = (Piso) obj;
        return Objects.equals(this.referencia, other.referencia);
    }
    
    
    
    //Getters y Setters
    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Integer getM2() {
        return m2;
    }

    public void setM2(Integer m2) {
        this.m2 = m2;
    }

    public Integer getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(Integer numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

   
   
    
    
    }  
  
    
    
    
    
    
    

