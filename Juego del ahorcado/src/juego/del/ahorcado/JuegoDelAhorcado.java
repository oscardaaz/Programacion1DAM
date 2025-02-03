/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego.del.ahorcado;

import java.util.Scanner;

/**
 *
 * @author oscar.domalo
 */
public class JuegoDelAhorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        // Palabra secreta
        String palabraSecreta = "java";
        String palabraMostrada = "_".repeat(palabraSecreta.length());

        int intentos = 6;
        String letrasErradas = "";

        System.out.println("¡Bienvenido al Ahorcado!");

        while (intentos > 0) {
            System.out.println("\nPalabra: " + palabraMostrada);
            System.out.println("Letras erradas: " + letrasErradas);
            System.out.println("Tienes " + intentos + " intentos restantes.");

            System.out.print("Introduce una letra: ");
            String letra = scanner.nextLine().toLowerCase();

            // Si ya se intentó la letra
            if (palabraMostrada.contains(letra) || letrasErradas.contains(letra)) {
                System.out.println("Ya intentaste esa letra.");
                continue;
            }

            // Verificar si la letra está en la palabra secreta
            if (palabraSecreta.contains(letra)) {
                System.out.println("¡Correcto!");
                char[] palabraArray = palabraMostrada.toCharArray();
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (palabraSecreta.charAt(i) == letra.charAt(0)) {
                        palabraArray[i] = letra.charAt(0);
                    }
                }
                palabraMostrada = new String(palabraArray);
            } else {
                System.out.println("¡Incorrecto!");
                letrasErradas += letra + " ";
                intentos--;
            }

            // Verificar si el jugador ha ganado
            if (palabraMostrada.equals(palabraSecreta)) {
                System.out.println("¡Felicidades, adivinaste la palabra!");
                break;
            }
        }

        if (intentos == 0) {
            System.out.println("Has perdido. La palabra era: " + palabraSecreta);
        }

        scanner.close();
    }
        
}
