/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;
/**
 *
 * @author oscar.domalo
 */
public class Ejercicios {
    
    public static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2){ //Creamos la funcion diferenciaMin
        
        //Creamos una variable con la operacion necesaria.
        int diferenciaMinutos = (hora1*60+minuto1)-(hora2*60+minuto2);
        
        //Imprimimos el texto con el resultado en pantalla.
        System.out.println("Los minutos de diferencia son: "+Math.abs(diferenciaMinutos)+" minutos");
        return diferenciaMinutos;//Ponemos el return, siendo necesario para almacenar la variable si fuera necesario.     
    }
        
    public static void main(String[] args) {
           
            //Llamamos a nuestra funcion en el main.
            diferenciaMin(14,30,18,50); 
  
    }
    
}
