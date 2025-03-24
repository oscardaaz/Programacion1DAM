/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package protectora;

/**
 *
 * @author oscar.domalo
 */
public class Protectora {

    public static void main(String[] args) {
        
        Animal a1 = new Animal();
        
        //System.out.println(a1);
        Gato g1 = new Gato(true,true,5,"001");
        //System.out.println(g1);
        //g1.dimeTodoGato();
        
        
        System.out.println(g1);
        g1.setChip("002");
        System.out.println(g1);
    }
    
    
}
