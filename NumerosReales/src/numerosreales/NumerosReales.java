/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosreales;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author oscar.domalo
 */
public class NumerosReales {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> positivos = new ArrayList<>();
        ArrayList<Double> negativos = new ArrayList<>();

        double numero;

        // Entrada de datos
        do {
            System.out.print("Introduce un numero (0 para terminar): ");
            numero = scanner.nextDouble();

            if (numero > 0) {
                positivos.add(numero);
            } else if (numero < 0) {
                negativos.add(numero);
            }

        } while (numero != 0);

        // Mostrar listas originales
        System.out.println("\nNumeros positivos: " + positivos);
        System.out.println("Suma de positivos: " + suma(positivos));

        System.out.println("\nNumeros negativos: " + negativos);
        System.out.println("Suma de negativos: " + suma(negativos));

        // Eliminar valores mayores a 10 o menores a -10
        positivos.removeIf(n -> n > 10);
        negativos.removeIf(n -> n < -10);

        // Mostrar listas filtradas
        System.out.println("\nPositivos tras eliminar valores > 10: " + positivos);
        System.out.println("Negativos tras eliminar valores < -10: " + negativos);

        scanner.close();
    }

    // Método para sumar los elementos de una lista
    public static double suma(ArrayList<Double> lista) {
        double suma = 0;
        for (double num : lista) {
            suma += num;
        }
        return suma;
    }
}
