/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenprogramacion2ºtrimestre;

import java.util.*;

/**
 *
 * @author oscar.domalo
 */
public class ExamenProgramacion2ºTrimestre {

    public static void main(String[] args) {

        GestionRepuestos.cargarDatos();

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            // Menú de opciones
            System.out.println("\n1. Listar por codigo");
            System.out.println("2. Listar repuestos ordenados por descripción");
            System.out.println("3. Listar repuestos ordenados por departamento y descripción");
            System.out.println("4. Listar repuestos con stock inferior a…");
            System.out.println("5. Buscar repuesto por descripción");
            System.out.println("6. Alta de repuesto");
            System.out.println("7. Modificación de repuesto");
            System.out.println("8. Borrar de repuesto");
            System.out.println("9. Salir y guardar");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    GestionRepuestos.listarPorCodigo();
                    break;
                case 2:
                    GestionRepuestos.listarPorDescripcion();
                    break;
                case 3:
                    GestionRepuestos.listarPorDeptoYDescripcion();
                    break;
                case 4:
                    System.out.print("Introduce la cantidad minima de stock: ");
                    int cantidad = sc.nextInt();
                    GestionRepuestos.listarPorStock(cantidad);
                    break;
                case 5:
                    System.out.print("Introduce la descripcion a buscar: ");
                    String descripcion = sc.nextLine();
                    GestionRepuestos.buscarPorDescripcion(descripcion);
                    break;
                case 6:
                    altaRepuesto(sc);
                    break;
                case 7:
                    modificarRepuesto(sc);
                    break;
                case 8:
                    borrarRepuesto(sc);
                    break;
                case 9:
                    GestionRepuestos.guardarDatos();
                    System.out.println("Datos guardados correctamente.");
                    break;

                default:
                    System.out.println("Opcion no valida, intenta nuevamente.");
            }
        } while (opcion != 9);

        sc.close();
    }

    private static void altaRepuesto(Scanner sc) {
        System.out.print("Codigo: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        System.out.print("Descripcion: ");
        String descripcion = sc.nextLine();
        System.out.print("Departamento: ");
        String departamento = sc.nextLine();
        System.out.print("Stock: ");
        int stock = sc.nextInt();

        if (GestionRepuestos.altaRepuesto(codigo, descripcion, departamento, stock)) {
            System.out.println("Repuesto agregado con exito.");
        } else {
            System.out.println("Error al agregar el repuesto. El codigo ya existe.");
        }
    }

    private static void modificarRepuesto(Scanner sc) {
        System.out.print("Codigo del repuesto a modificar: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        System.out.print("Nueva descripcion: ");
        String descripcion = sc.nextLine();
        System.out.print("Nuevo departamento: ");
        String departamento = sc.nextLine();
        System.out.print("Nuevo stock: ");
        int stock = sc.nextInt();

        if (GestionRepuestos.modificarRepuesto(codigo, descripcion, departamento, stock)) {
            System.out.println("Repuesto modificado con exito.");
        } else {
            System.out.println("Error: Repuesto no encontrado.");
        }
    }

    private static void borrarRepuesto(Scanner sc) {
        System.out.print("Codigo del repuesto a borrar: ");
        int codigo = sc.nextInt();

        if (GestionRepuestos.borrarRepuesto(codigo)) {
            System.out.println("Repuesto borrado con exito.");
        } else {
            System.out.println("Error: Repuesto no encontrado.");
        }
    }
}
