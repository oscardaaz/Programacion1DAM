/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections;

import java.util.Comparator;

/**
 *
 * @author oscar.domalo
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creacion de una tabla de numeros enteros
        //Contenedor<Integer> c = new Contenedor(new Integer[0]);
        Integer[] enteros = new Integer[0];
        Contenedor<Integer> cont = new Contenedor<>(enteros);
        //Metemos los datos en el contenedor
        /*for (int i = 0; i < 30; i++){
            c.insertarAlFinal((int)(Math.random()*10));*/
        for (int i = 0; i < 30; i++){
            cont.insertarAlFinal((int)(Math.random()*10));            
        }
        System.out.println("Tabla original: " + cont /*c*/);
        //Ordenar los elementos como no añadimos argumentos utiliza sel 1º metodo ordenar
        cont.ordenar();
        System.out.println("Tabla ordenada: " + cont);
        //Ordenar los elementos de Mayor a menor
        Comparator<Integer> ordenInteger = Comparator.naturalOrder();
        cont.ordenar(ordenInteger);
        System.out.println("Tabla con orden natural Integer: " + cont);
        //Creamos un comparador con el orden inverso al natural de la clase Integer
        Comparator<Integer> ordenInversoInteger = ordenInteger.reversed();
        cont.ordenar(ordenInversoInteger);
        System.out.println("Tabla con orden inverso de Integer: " + cont);
        System.out.println("Valor en indice 26: " + cont.get(0));
    }
    
} 
    