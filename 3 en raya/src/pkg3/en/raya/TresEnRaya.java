/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.en.raya;

import java.util.Scanner;

/**
 *
 * @author oscar.domalo
 */






public class TresEnRaya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] tablero = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        char jugador = 'X';
        
        while (true) {
            // Mostrar el tablero
            for (int i = 0; i < 3; i++) {
                System.out.println(tablero[i][0] + "|" + tablero[i][1] + "|" + tablero[i][2]);
            }

            // Pedir la jugada
            System.out.println("Jugador " + jugador + ", ingresa fila (0, 1, 2) y columna (0, 1, 2): ");
            int fila = scanner.nextInt();
            int columna = scanner.nextInt();

            // Verificar si la casilla está vacía
            if (tablero[fila][columna] == ' ') {
                tablero[fila][columna] = jugador;

                // Comprobar si el jugador ganó
                if (esGanador(tablero, jugador)) {
                    for (int i = 0; i < 3; i++) {
                        System.out.println(tablero[i][0] + "|" + tablero[i][1] + "|" + tablero[i][2]);
                    }
                    System.out.println("¡Jugador " + jugador + " gana!");
                    break;
                }

                // Cambiar de jugador
                if (jugador == 'X') {
                    jugador = 'O';
                } else {
                    jugador = 'X';
                }
            } else {
                System.out.println("Casilla ocupada, intenta de nuevo.");
            }
        }
        scanner.close();
    }

    // Método para verificar si un jugador ha ganado
    private static boolean esGanador(char[][] tablero, char jugador) {
        // Verificar filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) {
                return true;
            }
        }
        // Verificar columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador) {
                return true;
            }
        }
        // Verificar diagonales
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
            return true;
        }
        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
            return true;
        }
        return false;
    }
}


