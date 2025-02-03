/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrera.pkg5k.pkg10k;

import java.util.Scanner;

/**
 *
 * @author oscar.domalo
 */
public class Carrera5k10k {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Variables para los participantes
        String nombre;
        int categoria;
        double distanciaRecorrida;

        // Variables para los ganadores
        String ganador5k = "";
        String ganador10k = "";
        double mejorTiempo5k = 0;
        double mejorTiempo10k = 0;

        // Recolectar datos de los participantes
        System.out.println("Bienvenido a la Carrera Popular");
        while (true) {
            // Pedir nombre del participante
            System.out.print("Introduce el nombre del participante: ");
            nombre = scanner.nextLine();

            // Pedir categoría
            System.out.print("Introduce la categoría (5 para 5k, 10 para 10k): ");
            categoria = scanner.nextInt();
            
            // Recoger la distancia recorrida dependiendo de la categoría
            if (categoria == 5) {
                distanciaRecorrida = 5000;  // 5k
            } else if (categoria == 10) {
                distanciaRecorrida = 10000;  // 10k
                System.out.println("Participante " + nombre + " ha recorrido 5000m a mitad de carrera.");
            } else {
                distanciaRecorrida = 0;
                System.out.println("Categoría no válida.");
            }

            // Determinar el ganador en cada categoría
            if (categoria == 5) {
                if (distanciaRecorrida > mejorTiempo5k) {
                    mejorTiempo5k = distanciaRecorrida;
                    ganador5k = nombre;
                }
            } else if (categoria == 10) {
                if (distanciaRecorrida > mejorTiempo10k) {
                    mejorTiempo10k = distanciaRecorrida;
                    ganador10k = nombre;
                }
            }

            // Preguntar si desea agregar otro participante
            scanner.nextLine();  // Limpiar el buffer
            System.out.print("¿Deseas agregar otro participante? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                break;
            }
        }

        // Mostrar ganadores
        System.out.println("Ganador de la categoría 5k: " + ganador5k + " con " + mejorTiempo5k + " metros.");
        System.out.println("Ganador de la categoría 10k: " + ganador10k + " con " + mejorTiempo10k + " metros.");

        scanner.close();
    }
}
        
    
    

