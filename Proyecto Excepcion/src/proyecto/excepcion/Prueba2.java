/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.excepcion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oscar.domalo
 */
public class Prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String texto = "";
        BufferedReader br = null;
        FileReader fr = null;
        try {
            fr = new FileReader("Test.txt");
            br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null) {
                texto += linea + '\n';
                linea = br.readLine();
            }

            /*int a = 1, b = 0, c;
            
            try {
            c = a/b;
            }catch(ArithmeticException error){
            System.out.println("Error aritmético");
            }catch (Exception error){
            System.out.println("Error general");
            }finally{
            System.out.println("Ejecucion bloque finally");
            }*/
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
        System.out.println(texto);
    }
}
