/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista.nombres.ordenada;

import java.io.*;
import java.util.*;

/**
 *
 * @author oscar.domalo
 */
public class ListaNombresOrdenada {

    private static final String FICHERO = "nombres.txt";
    private static List<String> nombres = new ArrayList<>();

    public static void main(String[] args) {
        // Leer nombres del archivo
        cargarNombresDesdeArchivo();

        // Leer nombres nuevos hasta que se ingrese "fin"
        Scanner scanner = new Scanner(System.in);
        String nombre;

        System.out.println("Introduce nombres (escribe 'fin' para terminar):");
        while (true) {
            nombre = scanner.nextLine().trim();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }
            // Agregar el nombre de manera ordenada
            agregarNombreOrdenado(nombre);
        }

        // Guardar la lista de nombres en el archivo
        guardarNombresEnArchivo();

        System.out.println("Lista final de nombres:");
        for (String n : nombres) {
            System.out.println(n);
        }

        scanner.close();
    }

    // Cargar nombres desde el archivo
    private static void cargarNombresDesdeArchivo() {
        try (BufferedReader br = new BufferedReader(new FileReader(FICHERO))) {
            String nombre;
            while ((nombre = br.readLine()) != null) {
                nombres.add(nombre.trim());
            }
            // Ordenar la lista de nombres
            Collections.sort(nombres);
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo. Empezando con lista vacía.");
        }
    }

    // Agregar un nombre a la lista manteniendo el orden
    private static void agregarNombreOrdenado(String nombre) {
        nombres.add(nombre);
        Collections.sort(nombres);
    }

    // Guardar los nombres actuales en el archivo
    private static void guardarNombresEnArchivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FICHERO))) {
            for (String nombre : nombres) {
                bw.write(nombre);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar los nombres en el archivo.");
        }
    }
}
