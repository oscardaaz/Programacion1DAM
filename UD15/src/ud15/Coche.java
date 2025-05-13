/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud15;

import java.io.*;
/**
 *
 * @author miguel.cormur
 */
import javax.persistence.*;
@Entity
public class Coche implements Serializable{
    @Id
    String matricula;
    String marca;
    String modelo;
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
        return matricula + "\t" + marca + "\t" + modelo + "\t" + numPlazas;
    }
     
}
