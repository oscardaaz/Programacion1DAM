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

    /*public static double esfera (){//Creamos la funcion esfera con la variable radio que calcule los datos necesarios.
        //Creamos un bucle do while para que solo se introduzcan los datos validos.
        
        double radio;
    do{
      
        Scanner sc = new Scanner(System.in);   
        System.out.print("Introduce el radio de la esfera en metros: "); 
        sc.useLocale(Locale.US);
        //Iniciamos la variable necesaria para los calculos posteriores.
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
       
        esfera();
           
   }    
   
   
  
     
       
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
        
            }*/
 
/* static double distancia (double x1, double y1, double x2, double y2){
        DecimalFormat df = new DecimalFormat("#.##");
        double distancia = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2, 2));
        System.out.println("La distancia euclidea de tus dos puntos es de: "+df.format(distancia)+" unidades.");
        System.out.println("");
        return distancia;
    }
        
    public static void main(String[] args) {
        distancia(-5,4,6,-5);
        distancia(5,4,7,1);*/
    
    
      /* public static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2){
        int diferenciaMinutos = (hora1*60+minuto1)-(hora2*60+minuto2);
        System.out.println("Los minutos de diferencia son: "+Math.abs(diferenciaMinutos)+" minutos");
        return diferenciaMinutos;
        
    }
        
    public static void main(String[] args) {
       
      
            diferenciaMin(24,40,24,60);*/
    
    
   /* public static int calculoSegundos (){
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce las dias, horas, minutos");
            int dias = sc.nextInt(), horas = sc.nextInt(), minutos = sc.nextInt();
            int segundos = dias*24*3600 + horas*3600+minutos*60;
            System.out.println("Los segundos totales son: "+segundos);
            return segundos;
        }
        
        public static void main(String[] args) {
        
        /*Escribe una función a la que se le pase como parámetros de entrada una cantidad de días, horas y 
        minutos. La función calculará y devolverá el número de segundos que existen en los datos de entrada.*/
        
        
            //calculoSegundos();
        


}