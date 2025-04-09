
package tabla.de.cadenas;

import java.util.Scanner;

/**
 *
 * @author oscar.domalo
 */
public class TablaDeCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Simulación de ficheros binarios con arrays de enteros ordenados
        int[][] ficheros = {
            {1, 3, 5, 7, 9},         // Fichero 1
            {2, 4, 6, 8, 10},        // Fichero 2
            {0, 2, 4, 6, 8, 10},     // Fichero 3
            {5, 10, 15, 20, 25}      // Fichero 4
        };

        // Nombres de los ficheros
        String[] nombresFicheros = {
            "fichero1.dat",
            "fichero2.dat",
            "fichero3.dat",
            "fichero4.dat"
        };

        // Leer el número a buscar desde el teclado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int numeroABuscar = scanner.nextInt();

        // Buscar el número en los ficheros binarios simulados
        boolean encontrado = false;

        for (int i = 0; i < ficheros.length; i++) {
            // Utilizamos búsqueda binaria para encontrar el número en el fichero i
            int indice = buscarBinario(ficheros[i], numeroABuscar);
            
            if (indice != -1) {
                System.out.println("El numero " + numeroABuscar + " se encuentra en el fichero '" 
                        + nombresFicheros[i] + "' en la posicion " + indice + ".");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El numero " + numeroABuscar + " no se encuentra en ningun fichero.");
        }
    }

    // Método que realiza una búsqueda binaria en un array de enteros
    public static int buscarBinario(int[] arr, int num) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (arr[medio] == num) {
                return medio; // Número encontrado
            } else if (arr[medio] < num) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1; // Número no encontrado
    }
}