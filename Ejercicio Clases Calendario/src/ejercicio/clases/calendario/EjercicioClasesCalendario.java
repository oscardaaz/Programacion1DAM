/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.clases.calendario;

/**
 *
 * @author oscar.domalo
 */
public class EjercicioClasesCalendario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear dos fechas iguales
        Calendario fecha1 = new Calendario(2023, 10, 15);
        Calendario fecha2 = new Calendario(2023, 10, 15);

        // Crear una fecha distinta
        Calendario fecha3 = new Calendario(2023, 11, 20);

        // Mostrar las fechas
        System.out.println("Fecha 1:");
        fecha1.mostrar();
        System.out.println("Fecha 2:");
        fecha2.mostrar();
        System.out.println("Fecha 3:");
        fecha3.mostrar();

        // Comparar fechas
        System.out.println("¿Fecha1 y Fecha2 son iguales? " + fecha1.iguales(fecha2)); // true
        System.out.println("¿Fecha1 y Fecha3 son iguales? " + fecha1.iguales(fecha3)); // false

        // Incrementar el día de fecha1
        System.out.println("\nIncrementando un día a Fecha1:");
        fecha1.incrementarDia();
        fecha1.mostrar();

        // Incrementar el mes de fecha2
        System.out.println("\nIncrementando un mes a Fecha2:");
        fecha2.incrementarMes();
        fecha2.mostrar();

        // Incrementar el año de fecha3
        System.out.println("\nIncrementando 2 años a Fecha3:");
        fecha3.incrementarAño(2);
        fecha3.mostrar();

        // Intentar incrementar el año más allá de 2025
        System.out.println("\nIntentando incrementar Fecha3 más allá de 2025:");
        fecha3.incrementarAño(10); // Esto no debería funcionar
        fecha3.mostrar();
    }
    
}
