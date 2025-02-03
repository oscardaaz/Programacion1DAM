/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tresenraya;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author manue
 */
public class TresEnRaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definimos el tablero con una tabla bidimensional de 3x3 tipo String
        String[][] tablero = new String[3][3];
        //Declaramos las variables a utilizar en el programa
        String nombreJugador1, nombreJugador2;
        final String FICHA1 = "X", FICHA2 = "O";
        
        Scanner sc = new Scanner(System.in);
        //Recuperamos los nombres de los jugadores y le asignamos una ficha a cada uno
        System.out.println("Introduce los nombres de los jugadores: ");
        nombreJugador1 = sc.next();
        nombreJugador2 = sc.next();
        System.out.println(nombreJugador1 + " juega con ficha " + FICHA1+".");
        System.out.println(nombreJugador2 + " juega con ficha " + FICHA2 +".");
       //llamamos a una función que carga blancos en las celdas
        inicializaTablero(tablero);
        
        juego(tablero,nombreJugador1,nombreJugador2,FICHA1,FICHA2);
        
        
    }
// Declaración de funciones fuera del main
// Función que carga espacios en blanco en cada celda del tablero
    public static void inicializaTablero(String[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j]= " ";
            }
        }
    }
 //Función que muestra tablero con el formato de tabla
    public static void muestraTablero(String[][] tablero) {
        for (String[] elem: tablero) {
            System.out.println(Arrays.toString(elem));
        }
    }
    
 //Función que muestra el tablero con un formato personalizado
    public static void muestraTablero2(String[][] tablero){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+tablero[i][j]+"]");
            }
            System.out.println("");
            
        }
    }
    
 //Función que coloca ficha y devuelve un boolean a false la casilla ya está ocupada
    public static boolean colocaFicha(String[][] tablero, int x, int y, String ficha){
        x -=1;
        y -=1;
        if (!" ".equals(tablero[x][y])){
            return false;
        }else{
            tablero[x][y] = ficha;
            return true;
        }
            
    }
//Función que desarrolla el juego en un bucle de 9 iteraciones, que son las casillas del tablero
    public static void juego(String[][] tablero,String nombreJugador1, String nombreJugador2, String ficha1, String ficha2) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        String ficha;
        String jugador;
        // 
        for (int i = 0; i < 9; i++) {
            //en cada iteración voy cambiando el nombre del jugador y la ficha de forma alternativa
             if(i%2 ==0){
                ficha = ficha1;
                jugador = nombreJugador1;
            }else{
                ficha = ficha2;
                jugador = nombreJugador2;
            }
        
            boolean casillaLibre = false;
            System.out.println("Le toca a " +jugador+" .Introduce las coordenadas x, y de la celda:");
            
            //Si las coordenadas no son válidas le pido otras en un bucle
            while (!casillaLibre){
                x= sc.nextInt();
                y = sc.nextInt();
                casillaLibre = colocaFicha(tablero,x,y,ficha);
                if (!casillaLibre){
                    System.out.println("Casilla ocupada, indica otras coordenadas: ");
                }
            }
           //Tras cada iteración (jugada), muestro cómo queda el tablero
           muestraTablero2(tablero);
        }
        
}
}