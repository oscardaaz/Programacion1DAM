/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.excepcion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author oscar.domalo
 */
public class Escaner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        double numero, suma = 0;
        //FileReader fr = null;
        BufferedReader br = null;
        
        
        try {
            
            
            br = new BufferedReader(new FileReader("Test.txt"));
            String linea = br.readLine();
            while (linea != null) {
                sc = new Scanner(linea).useLocale(Locale.US);
                
                if (sc.hasNextDouble()) {
                    numero = sc.nextDouble();
                    suma += numero;
                }
               
                linea = br.readLine();
                 
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (br != null) {

                try {
                    br.close();

                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }

            System.out.println("Mensaje despues de la Excepcion");

        }
        System.out.println(suma);
    }
}
