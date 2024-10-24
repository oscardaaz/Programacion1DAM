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

    /*public static double esfera (double radio){//Creamos la funcion esfera con la variable radio que calcule los datos necesarios.
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
    
}*/
        //Implementa la función que calcula y devuelve la distancia euclídea que separa los puntos (x1, y1) y (x2, y2).
    /*public static double calcularDistancia(){ //Creamos la funcion para calcular la distancia euclidea de dos puntos (x,y).
        
            DecimalFormat df = new DecimalFormat("#.##"); //Definimos la aproximacion a los decimales necesarios.
            Scanner sc = new Scanner(System.in); //Iniciamos el escaner.
            sc.useLocale(Locale.US); //Forzamos a usar decimales con punto.
            
            //Iniciamos las variables necesarias y pedimos los datos al usuario por teclado.
            System.out.print("Introduce el valor de x1: ");
            double x1 = sc.nextDouble();
            System.out.print("Introduce el valor de y1: ");
            double y1 = sc.nextDouble();
            System.out.print("Introduce el valor de x2: ");
            double x2 = sc.nextDouble();
            System.out.print("Introduce el valor de y2: ");
            double y2 = sc.nextDouble();
            System.out.println("");//Salto de linea
            
            //Creamos la variable de la operacion que necesitamos, y la imprimimos en pantalla.
            double distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
            System.out.println("La distancia euclidea de tus puntos es de: " + df.format(distancia)+" unidades.");
        
            return distancia;
        
    }
    public static void main(String[] args) {
    
        //Implementa la función que calcula y devuelve la distancia euclídea que separa los puntos (x1, y1) y (x2, y2).
        
        calcularDistancia(); //Lamamos a la funcion creada.
        
            }
    }*/