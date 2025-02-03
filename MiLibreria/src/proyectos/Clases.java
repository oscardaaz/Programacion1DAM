
package proyectos;

import static estaticas.MisFunciones.*;
import noestaticas.CuentaCorriente;
import noestaticas.Empleado;
import noestaticas.Gallina;
import noestaticas.Persona;


/**
 *
 * @author oscar.domalo
 */


public class Clases {

    public static void main(String[] args) { 
     
        /*
        int c;
        Persona p1, p2;
        CuentaCorriente c1;
        p1 = new Persona("Juan");
        CuentaCorriente c2;
        p2 = new Persona("Ana", 35, 170);
        c1 = new CuentaCorriente("00000000A", "Pepe", 0);
        c = suma(4,5);
        System.out.println(c);
        
        saludo("Oscar");
        
        Gallina g1, g2;
        g1 = new Gallina("Pepe",1);
        g2 = new Gallina("Juanita",2);
            
        g1.poneHuevo();
        g1.poneHuevo(5);
        g2.poneHuevo(10);
        g1.datosGallina();
        g2.datosGallina();
        */
        
        Persona p1 = new Persona("pepe",40,1.80);
            //p1.mostrarDatos();
            
        Empleado e1 = new Empleado("Juan", 35, 1.80, 1500, 001);
            //e1.mostrarDatos();
            
        p1 = new Empleado("Pepe",40, 1.70,1600, 002);
       
        p1.mostrarDatos();
              
    
    
        
        
    }
    
}
