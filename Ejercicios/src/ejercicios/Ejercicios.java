/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author oscar.domalo
 */
public class Ejercicios {
    public static void main(String[] args) {
       
        //Realiza un programa que calcule el máximo común divisor de dos números.
        
        Scanner scanner = new Scanner(System.in);//Declaramos el escaner
        //Pedimos al usuario los numeros por teclado.
        System.out.print("Ingrese el primer numero: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int b = scanner.nextInt();

        //Implementamos el algoritmo de Euclides
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        //Imprimimos en pantalla el maximo comun divisor
        System.out.println("El maximo comun divisor de los numeros es: " +a);
        
        
    
        
        
    }
}