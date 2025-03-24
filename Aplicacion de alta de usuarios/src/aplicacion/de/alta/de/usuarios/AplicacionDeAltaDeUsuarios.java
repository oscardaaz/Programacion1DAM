/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacion.de.alta.de.usuarios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



/**
 *
 * @author oscar.domalo
 */
public class AplicacionDeAltaDeUsuarios {

    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        BufferedWriter bw = null;
        
        try {
            // Open the BufferedWriter in append mode
            bw = new BufferedWriter(new FileWriter("MiTexto.txt", true));

            String input = "";
            // Continuously prompt for input until '*' is entered
            do {
                System.out.println("Ingrese texto (o '*' para terminar): ");
                input = sc.nextLine();
                
                if (!input.equals("*")) {
                    bw.write(input);
                    bw.newLine(); // Add new line after each input
                }
            } while (!input.equals("*")); // Terminate loop if input is "*"

            System.out.println("El texto se ha guardado correctamente.");
        } catch (IOException ex) {
            System.out.println("Error al crear o escribir en el archivo: " + ex.getMessage());
        } finally {
            try {
                // Ensure that the BufferedWriter is closed after usage
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException ex) {
                System.out.println("Error al cerrar el archivo: " + ex.getMessage());
            }
        }
    }
}