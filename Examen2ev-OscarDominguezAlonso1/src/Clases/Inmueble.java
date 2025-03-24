/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author oscar.domalo
 */
public class Inmueble {

    private static int m2TotalesInmuebles;
    int m2;
    boolean alquiler;

    public static void Incrementam2TotalesInmueble(int incremento) {
        m2TotalesInmuebles += incremento;
    }

    public void setM2Totales(int m2) {
        this.m2 = m2;
    }

    public int getM2Totales() {
        return m2;
    }
    public void setAlquiler(boolean alquiler){
        this.alquiler = alquiler;
    }
    public boolean getAlquiler(){
        return alquiler;
    }

    @Override
    public String toString() {
        return "Tienes pagado el alquiler " + alquiler + "los m2 son: " + m2
                + getM2Totales();
    }
}
