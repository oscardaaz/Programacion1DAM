/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegoahorcado;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author manue
 */
public class JuegoAhorcado {

  //Declaraci�n de funciones
    public static void muestraPalabra(char[] tsalida){
        for (int i = 0; i < tsalida.length; i++) {
            System.out.print(tsalida[i]+" ");
        }
        
        System.out.println("");
    }
    
   // programa principal
    public static void main(String[] args) {
       //Declaraci�n de variables/tablas utilizadas
       String palabra;
       char[] tsalida;
       char cletra;
       int longitud;
       int numeroLetras, numAciertos = 0;
      boolean hayVidas = true, noAcierta= true;
      
       Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la palabra a adivinar: ");
      //recuperamos la palabra en un String y lo pasamos a min�sculas
        palabra = sc.next().toLowerCase();
        longitud = palabra.length();
        numeroLetras = longitud;
        
        System.out.println("Introduzca la primera letra: ");
        
        // creamos una tabla de caracteres de igual longitud que la palabra
         tsalida = new char[longitud];
        // rellenamos la tabla anterior co el caracter '_'
            for (int i = 0; i < longitud; i++) {
                tsalida[i] = '_';
            }
        //Empieza el juego dentro de un bucle
        
        int numeroVidas = 7;
        while(hayVidas && noAcierta){
                if(numeroVidas>0){
                    System.out.println("Dispones de " + numeroVidas + " vidas");
                    System.out.println("El numero para rendirte es 'O'");
                }
                numAciertos = 0;
                //recuperamos la letra en un char y lo pasamos a min�sculas
                //El m�todo next devuelve un String, y pasa pasarlo a caracter
                //usamos el m�todo chartAt().
                cletra = sc.next().toLowerCase().charAt(0);
                // En un for comprobamos uno a uno los caracteres de la palabra
                // coinciden con la letra, s� es as� la actualizamos en la salida
                // a mostrar, en la misma posici�n en la que se encuentra en la 
                // palabra.
                //Podemos comparar con un == porque son caracteres ambos y est�n 
                // en min�sculas los dos valores le�dos del teclado
               
                for (int i = 0; i < longitud; i++) {
                    if (palabra.charAt(i)==cletra){
                        tsalida[i] = cletra;
                        //Por cada acierto, controlamos si hemos acertado la palabra
                        //entera decrementando las acertadas de la longitud de la palabra.
                        numeroLetras--;
                        //Si hay varias letras iguales en la palabra lo indicamos
                        numAciertos++;
                    }
                }if (cletra == '0') {
                    System.out.println("Ooh, te has rendido, la palabra era " + palabra);
                     break;         
                }
                if (numAciertos>0){ //si encontr� alguna letra lo muestra al usuario
                    System.out.println("Hay "+numAciertos+ " " + cletra + ".");
                }
                else{
                    System.out.println("No hay ninguna " + cletra + ".");
                    numeroVidas--;
                }

                if (numeroLetras==0){ //si ya no hay letras por acertar nos salimos del bucle
                    noAcierta = false;
                    System.out.println("Has acertado");
                    System.out.print("La palabra correcta era: ");
                    //muestraPalabra(tsalida);
                }
                if (numeroVidas == 0) {
                    System.out.println("Lo siento has agotado tus vidas, otra vez sera.");
                    System.out.println("La palabra correcta era " +palabra +".");
                    break;  
                }else{ // si a�n hay letras por acertar, pedimos otra letra
                    muestraPalabra(tsalida);
                    System.out.println("Introduce otra letra: ");

                }
                        
            }
                
    }
}
 
    
    

