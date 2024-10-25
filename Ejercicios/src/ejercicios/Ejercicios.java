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
    
    public static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2){
        int diferenciaMinutos = (hora1*60+minuto1)-(hora2*60+minuto2);
        System.out.println("Los minutos de diferencia son: "+Math.abs(diferenciaMinutos)+" minutos");
        return diferenciaMinutos;
        
    }
        
    public static void main(String[] args) {
       
      
            diferenciaMin(24,40,24,60);
    
    
    
    }
    
}
