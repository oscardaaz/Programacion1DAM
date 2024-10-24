/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios2;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author oscar.domalo
 */
public class Ejercicios2 {

    public static double esfera (double radio){ //Creamos la funcion esfera con la variable radio que calcule los datos necesarios.
        //Creamos un bucle do while para que solo se introduzcan los datos validos.
    do{
      
        Scanner sc = new Scanner(System.in);   
        System.out.print("Introduce el radio de la esfera en metros: "); 
        sc.useLocale(Locale.US);
        radio = sc.nextDouble();
    //Creamos un condicional if para meter un mensaje si se introducen los datos erroneos.
    if (radio <= 0) {
                System.out.println("Error, el radio debe ser un numero positivo. Intentalo de nuevo, gracias.");
                }
    }while(radio<=0);//Condicion para que salga del bucle y ejecute el siguiente codigo.
            
            DecimalFormat df = new DecimalFormat("#.##"); //Definimos un formato de aproximacion de decimales
            //Creamos las dos variables de calculos necesarias
            double superficie = 4 * Math.PI*Math.pow(radio, 2);
            double volumen = 4*Math.PI/3*Math.pow(radio, 3);
            //Iniciamos las salidas por pantalla necesarias.
            System.out.println("");
            System.out.println("La superficie de la esfera es: " + df.format(superficie) + " metros cuadrados.");
            System.out.println("");
            System.out.println("El volumen de la esfera es: " + df.format(volumen) + " metros cubicos.");
            System.out.println("");

            return superficie;
           
   }    
   
   
    public static void main(String[] args) {
        
     esfera(-1); //Invocamos a la funcion en el main para ejecutarla.
     
       
    }
    
}
 