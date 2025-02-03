/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.clases.calendario;

/**
 *
 * @author oscar.domalo
 */
public class Calendario {
    int año, mes, dia;
     // Constructor de la clase Calendario
    Calendario(int año, int mes, int dia) {
        // Validación del año
        if (año >= 1 && año <= 2025) {
            this.año = año;
        } else {
            System.out.println("Año inválido.");
        }

        // Validación del mes
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Mes inválido.");
        }

        // Validación del día
        if (dia >= 1 && dia <= 31) {
            // Verificación de meses con 30 días
            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
                System.out.println("Día inválido para un mes de 30 días.");
            } else {
                this.dia = dia;
            }
        } else {
            System.out.println("Día inválido.");
        }
    }

    // Método para incrementar el día
    void incrementarDia() {
        // Verificación de meses con 30 días
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 30) {
            dia = 1;
            incrementarMes();
        } else if (dia == 31) {
            dia = 1;
            incrementarMes();
        } else {
            dia++;
        }
    }

    // Método para incrementar el mes
    void incrementarMes() {
        if (mes == 12) {
            mes = 1;
            incrementarAño(1);
        } else {
            mes++;
        }
    }

    // Método para incrementar el año
    void incrementarAño(int cantidad) {
        if ((año + cantidad) <= 2025) {
            año += cantidad;
        } else {
            System.out.println("No se puede incrementar el año más allá de 2025.");
        }
    }

    // Método para mostrar la fecha actual
    void mostrar() {
        if (año <= 2025 && mes >= 1 && mes <= 12 && dia >= 1 && dia <= 31) {
            System.out.println("La fecha actual es: " + dia + " / " + mes + " / " + año);
        } else {
            System.out.println("La fecha es inválida.");
        }
    }

    // Método para comparar si dos fechas son iguales
    boolean iguales(Calendario otraFecha) {
        // Compara año, mes y día de la fecha invocante con la fecha pasada como parámetro
        return this.año == otraFecha.año && this.mes == otraFecha.mes && this.dia == otraFecha.dia;
    }
}
