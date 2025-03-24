/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author oscar.domalo
 */
public class Local extends Inmueble {

    private static int m2LocalesTotales = 0;
    private static int numeroLocalesTotales = 0;
    int idLocal;
    boolean luz;
    boolean agua;

    public Local(int m2, boolean alquiler, int idLocal, boolean luz, boolean agua) {
        super.m2 = m2;
        super.alquiler = alquiler;
        this.idLocal = idLocal;
        this.luz = luz;
        this.agua = agua;
        m2LocalesTotales += m2;
        numeroLocalesTotales++;
        
        

    }
    public void getNumTotalesLocales(){
        System.out.println("El numero de locales en total es: " +numeroLocalesTotales);
        
    }


    @Override
    public String toString() {
        return " Tu local tiene el id: " + idLocal + " TIene luz: " + luz + " y agua: " + agua;
    }

}
