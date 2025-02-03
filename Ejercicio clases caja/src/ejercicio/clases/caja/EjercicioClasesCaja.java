/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.clases.caja;

/**
 *
 * @author oscar.domalo
 */
public class EjercicioClasesCaja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Caja c1 = new Caja(200,200,200,"cm");
        System.out.println(c1);*/
        
        CajaCarton cc1 = new CajaCarton(200,200,200);
        System.out.println(cc1);
        
        CajaCarton cc2 = new CajaCarton(200,200,200);
        System.out.println(cc2);
        
        CajaCarton cc3 = new CajaCarton(100,100,100);
    
        CajaCarton.getm2Carton();
        System.out.println(cc1.equals(cc2));
    }
    
    
}
