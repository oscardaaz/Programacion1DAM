/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author oscar.domalo
 */
public class Trastero {

    private static int m2TrasterosTotales;
    private static int numeroTrasterosTotales;
    int idTrastero;
    boolean luz;
    boolean agua;

    public Trastero(int m2, boolean alquiler,
            int idTrastero, boolean luz, boolean agua) {
        this.idTrastero = idTrastero;
        this.luz = luz;
        this.agua = agua;
        numeroTrasterosTotales++;
    }

    @Override
    public String toString() {
        return "El id de tu trastero es: " + idTrastero
                + " ,Tienes luz: " + luz + " y agua: " + agua;
    }
    public void getNumTrasterosTotales(){
        System.out.println("El numero de trasteros en total es: " + numeroTrasterosTotales);
    }

}
