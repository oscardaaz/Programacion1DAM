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
            System.out.println("2. Listar repuestos ordenados por descripcion");
            System.out.println("3. Listar repuestos ordenados por departamento y descripcion");
            System.out.println("4. Listar repuestos con stock inferior a…");
            System.out.println("5. Buscar repuesto por descripcion");
            System.out.println("6. Alta de repuesto");
            System.out.println("7. Modificacion de repuesto");
            System.out.println("8. Borrar de repuesto");
            System.out.println("9. Salir y guardar");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            System.out.println();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("Repuestos listados por codigo: \n");
                    //System.out.println();
                    GestionRepuestos.listarPorCodigo();
                    break;
                case 2:
                    System.out.println("Lista por descripcion: \n");
                    GestionRepuestos.listarPorDescripcion();
                    break;
                case 3:
                    System.out.println("Lista por departamento y descripcion: \n");
                    GestionRepuestos.listarPorDeptoYDescripcion();
                    break;
                case 4:
                    System.out.println("Listar repuestos con stock inferior a…");
                    System.out.print("Introduce la cantidad minima de stock: \n");
                    int cantidad = sc.nextInt();
                    GestionRepuestos.listarPorStock(cantidad);
                    break;
                case 5:
                    System.out.print("Introduce la descripcion a buscar: \n");
                    String descripcion = sc.nextLine();
                    GestionRepuestos.buscarPorDescripcion(descripcion);
                    break;
                case 6:
                    System.out.println("Da de alta un nuevo repuesto: \n");

                    altaRepuesto(sc);
                    break;
                case 7:
                    System.out.println("Modifica un repuesto existente: \n");
                    modificarRepuesto(sc);
                    break;
                case 8:
                    System.out.println("Borra un repuesto existente: \n");
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
