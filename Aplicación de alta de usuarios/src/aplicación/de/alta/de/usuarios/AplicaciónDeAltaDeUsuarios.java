/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicación.de.alta.de.usuarios;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author oscar.domalo
 * 
 * Diseña una aplicación para guardar los datos de los usuarios (nombre, edad, 
 * altura), leídos por teclado, en un fichero de texto (Usuarios.txt). Si el 
 * fichero ya existe se añadirán los registros al final del mismo. 
 * Cada usuario estará en una línea distinta del fichero. El registro de 
 * usuarios finalizará cuando se introduzca un "*" por teclado.
 * 
 * Cuando finalice la inserción de datos el programa leerá el fichero creado 
 * y mostrará la información por consola.
 */
public class AplicaciónDeAltaDeUsuarios {
    
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Creamos el archivo de texto donde se guardarán los usuarios
        File archivo = new File("Usuarios.txt");
        
        // Bucle para capturar los datos de los usuarios
        while (true) {
            System.out.println("Introduce el nombre del usuario (o '*' para finalizar): ");
            String nombre = scanner.nextLine();
            
            // Si el nombre es '*', terminamos la captura
            if (nombre.equals("*")) {
                break;
            }

            // Leer edad (como texto)
            System.out.println("Introduce la edad del usuario: ");
            String edad = scanner.nextLine();

            // Leer altura
            System.out.println("Introduce la altura del usuario (en metros): ");
            String altura = scanner.nextLine();

            // Intentamos escribir en el archivo (si no existe, lo creará)
            try (FileWriter writer = new FileWriter(archivo, true);
                 BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
                bufferedWriter.write(nombre + ", " + edad + ", " + altura);
                bufferedWriter.newLine(); // Salto de línea para el siguiente usuario
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }
        }

        // Ahora leemos el archivo y mostramos los datos en consola
        System.out.println("\nDatos de los usuarios registrados:");
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        
        // Cerramos el scanner
        scanner.close();
    }
}

  