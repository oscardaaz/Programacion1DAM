/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.excepcion;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oscar.domalo
 */
public class ProyectoExcepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String texto = "";
        FileReader in = null;
        try {
            in = new FileReader("Test2.txt");
            int c = in.read();
            while (c != -1) {
                texto += (char) c;
                c = in.read();
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
            if (in != null) {

                try {
                    in.close();

                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }

            System.out.println("Mensaje despues de la Excepcion");

        }
        System.out.println(texto);
    }
}
