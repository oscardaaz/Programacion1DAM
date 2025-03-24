/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author oscar.domalo
 */
public class PlazaParking extends Inmueble {

    private static int m2PlazaParkingTotales = 0;
    private static int numeroPlazaParkingTotales = 0;
    int idGaraje;
    boolean puntoCarga;

    public PlazaParking(int m2, boolean alquiler,
            int idGaraje, boolean puntoCarga) {
        
        this.idGaraje = idGaraje;
        this.puntoCarga = puntoCarga;
        numeroPlazaParkingTotales++;
    }

    @Override
    public String toString() {
        return "Hola el id de tu garaje es : " + idGaraje + " tiene punto de carga"
                + puntoCarga + "y el alquiler pagado: " + super.alquiler;
    }
    public void getNumTotalesGaraje(){
        System.out.println("El numero de garajes en total es: " + numeroPlazaParkingTotales);
        
    }
    
}
