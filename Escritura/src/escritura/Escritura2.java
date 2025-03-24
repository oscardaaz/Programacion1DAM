/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escritura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author oscar.domalo
 */
public class Escritura2 {

    public static void main(String[] args) {

        
        FileReader fr;
        BufferedReader br = null;
        String nombres = "";
        String texto = "";
        FileReader in = null;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("MiTexto.txt", true))){ 
            
            bw.write("Primera linea del archivo");
            bw.newLine();
            bw.write("Segunda linea");
            bw.newLine();
            bw.write("Fin del archivo" + "\n");
            bw.newLine();

        } catch (IOException ex) {
            System.out.println("Error al crear fichero: " + ex.getMessage());
        }

        try {
            in = new FileReader("MiTexto.txt");
            int c = in.read();
            while (c != -1) {
                texto += (char) c;
                c = in.read();
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (in != null) {

                try {
                    in.close();

                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }

        }
        System.out.println(texto);

    }

}
