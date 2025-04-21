/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodogenerico;

import java.util.*;

/**
 *
 * @author oscar.domalo
 */
public class MetodoGenerico {

     public static <T> List<T> eliminarDuplicados(List<T> lista) {
        return new ArrayList<>(new LinkedHashSet<>(lista));
    }
     
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Luis", "Ana", "Pedro", "Luis");
        List<String> sinRepetidos = eliminarDuplicados(nombres);
        System.out.println(sinRepetidos); // [Ana, Luis, Pedro]
    }
  
}
