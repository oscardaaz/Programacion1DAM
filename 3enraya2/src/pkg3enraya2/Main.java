/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3enraya2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author oscar.domalo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String tablero[][] = new String[3][3];
        String jugador = " X ";

        while (true) {

            verTablero(tablero);
            System.out.println("Le toca al jugador" + jugador);
            int fila = sc.nextInt();
            int columna = sc.nextInt();

            if (tablero[fila][columna] == null) {
                tablero[fila][columna] = jugador;

                if (tablero[fila][columna] == "X") {
                    System.out.println("error, ahi nooo!!! Ya hay ficha!!!!");

                }
                if (jugador == "X") {
                    jugador = "O";
                } else {
                    jugador = "X";
                }
            } else {
                System.out.println("error, ahi nooo!!! Ya hay ficha!!!!");
            }

        }

    }

    public static void verTablero(String tablero[][]) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = "  ";

            }

        }

        for (String[] elemento : tablero) {

            System.out.println(Arrays.toString(elemento));

        }

        /*for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
          System.out.println("|" + tablero[i][j] + "|" + tablero[i][j] + "|" + tablero[i][j] + "|");
                               
                }
      }*/
    }

    public static void piezasTablero(String tablero[][]) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = "  ";
            }
        }
    }

}
