/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.marcapagina;

/**
 *
 * @author oscar.domalo
 */
public class ClaseMarcaPagina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcaPagina libro1 = new MarcaPagina("Fundacion");
        MarcaPagina libro2 = new MarcaPagina("The expanse");
        libro1.incrementoPagina();
        System.out.println(libro1.ultimaPagina());
        
        libro1.reiniciarLectura();
        System.out.println(libro1.ultimaPagina());
        
        libro2.incrementoPagina();
        libro2.incrementoPagina();
        libro2.incrementoPagina();
        System.out.println(libro2.ultimaPagina());
    }
    
}
