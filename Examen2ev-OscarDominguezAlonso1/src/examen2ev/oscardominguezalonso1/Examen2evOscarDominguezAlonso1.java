/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2ev.oscardominguezalonso1;

import Clases.Local;
import Clases.Piso;
import Clases.PlazaParking;
import Clases.Trastero;

/**
 *
 * @author oscar.domalo
 */
public class Examen2evOscarDominguezAlonso1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Piso p1 = new Piso(50, true, true, 2, 2, true, 001, false, 111);
        Piso p2 = new Piso(70, true, false, 2, 2, false, 002, false, 112);
        Piso p3 = new Piso(90, true, false, 2, 2, true, 003, false, 113);
        Piso p4 = new Piso(110, false, true, 2, 2, false, 004, false, 114);
        Piso p5 = new Piso(130, false, false, 2, 2, false, 005, false, 115);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        p1.getNumTotalesPisos();
        System.out.println(p1.getM2PisosTotales());
        
        Local l1 = new Local(50, false, 0, true, false);
        Local l2 = new Local(100, true, 0, true, false);
        System.out.println(l1);
        System.out.println(l2);
        l1.getNumTotalesLocales();
        
        PlazaParking g1 = new PlazaParking(10, true, 001, false);
        PlazaParking g2 = new PlazaParking(20, true, 002, false);
        PlazaParking g3 = new PlazaParking(30, true, 003, false);
        PlazaParking g4 = new PlazaParking(40, true, 004, false);
        PlazaParking g5 = new PlazaParking(50, true, 005, false);
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g4);
        System.out.println(g5);
        g1.getNumTotalesGaraje();
        
        Trastero t1 = new Trastero(20, true, 001, false, false);
        Trastero t2 = new Trastero(40, true, 002, false, true);
        Trastero t3 = new Trastero(60, false, 003, true, false);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        t1.getNumTrasterosTotales();
        
        

    }

}
