/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.excepcion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author oscar.domalo
 */
public class Personas {

    public static void main(String[] args) {

        Scanner sc;
        String nombres = "";
        double mediaAltura = 0;
        int mediaEdad = 0, contador = 0;
        FileReader fr;
        BufferedReader br = null;
        DecimalFormat df = new DecimalFormat("#.00");

        try {

            fr = new FileReader("Personas.txt");
            br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null) {
                sc = new Scanner(linea).useLocale(Locale.US);

                nombres += sc.next();
                mediaEdad += sc.nextInt();
                mediaAltura += sc.nextDouble();
                contador++;
                linea = br.readLine();

            }
            mediaEdad = mediaEdad/contador;
            mediaAltura = mediaAltura/contador;

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
        System.out.println("Personas: " +nombres + " ");
        System.out.println("Media de edad: " +mediaEdad + " años.");
        System.out.println("Media de altura: " +df.format(mediaAltura) + " metros.");
        

    }
}
