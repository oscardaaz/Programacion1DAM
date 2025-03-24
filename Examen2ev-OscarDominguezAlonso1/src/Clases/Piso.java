/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author oscar.domalo
 */
public class Piso extends Inmueble {

    private static int m2PisosTotales = 0;
    private static int numeroPisosTotales = 0;
    boolean exterior;
    int numeroHabitaciones;
    int numeroBaños;
    boolean garaje;
    int idGaraje;
    boolean trastero;
    int idTrastero;

    public Piso(int m2, boolean alquiler, boolean exterior, int numeroHabitaciones, int numeroBaños, boolean garaje,
             int idGaraje, boolean trastero, int idTrastero) {
        super.m2 = this.m2;
        super.alquiler = this.alquiler;
        this.exterior = exterior;
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
        this.garaje = garaje;
        this.idGaraje = idGaraje;
        this.trastero = trastero;
        this.idTrastero = idTrastero;
        m2PisosTotales = m2;
        numeroPisosTotales++;

    }

    public int setM2PisosTotales() {

        return m2PisosTotales += m2;

    }
    public void getNumTotalesPisos(){
        System.out.println("El numero de Pisos en total es: " + numeroPisosTotales);
    }

    public int getM2PisosTotales() {
        return m2PisosTotales;
    }
    

    @Override
    public String toString() {
        return "El piso tiene baños: " + numeroBaños + " tiene trastero: " + trastero
                +" y los m2 " + m2 + " y el alquiler pagado: " + alquiler;
              
    }
   
}
