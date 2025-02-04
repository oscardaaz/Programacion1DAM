/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.pkg8.pkg23.poligono;

/**
 *
 * @author oscar.domalo
 */
public class Actividad823Poligono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Triangulo t1 = new Triangulo(5,10);
      Rectangulo r1 = new Rectangulo(5,10);
      Rectangulo r2 = new Rectangulo(4,10);
        System.out.println(r1.area());
        System.out.println(t1.area());
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(t1);
        System.out.println(r1.color);
    }
    
}
