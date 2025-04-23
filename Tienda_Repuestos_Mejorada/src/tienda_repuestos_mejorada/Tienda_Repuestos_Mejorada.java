package tienda_repuestos_mejorada;

import java.util.Scanner;

public class Tienda_Repuestos_Mejorada {

    public static void main(String[] args) {

        // Cargar los datos desde el archivo binario al iniciar
        GestionRepuestos.cargarDatos();

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            // Menú de opciones
            System.out.println("\n1. Listar por codigo (Comparator)");
            System.out.println("2. Listar por descripcion");
            System.out.println("3. Listar por departamento y descripcion");
            System.out.println("4. Listar con stock menor a cantidad");
            System.out.println("5. Buscar por descripcion");
            System.out.println("6. Alta");
            System.out.println("7. Modificar");
            System.out.println("8. Borrar");
            System.out.println("9. Salir y guardar");
            System.out.println("10. Listar por codigo (Comparable - compareTo)");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            // Ejecutar la opción seleccionada
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
                case 10:
                    GestionRepuestos.listarPorCodigoComparable();
                    break;
                default:
                    System.out.println("Opcion no valida, intenta nuevamente.");
            }
        } while (opcion != 9); // Repetir hasta que el usuario elija salir

        sc.close(); // Cerrar el scanner al final
    }

    // Método para dar de alta un nuevo repuesto
    private static void altaRepuesto(Scanner sc) {
        System.out.print("Codigo: ");
        int codigo = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
        System.out.print("Descripcion: ");
        String descripcion = sc.nextLine();
        System.out.print("Departamento: ");
        String departamento = sc.nextLine();
        System.out.print("Stock: ");
        int stock = sc.nextInt();

        // Llamar al método de alta
        if (GestionRepuestos.altaRepuesto(codigo, descripcion, departamento, stock)) {
            System.out.println("Repuesto agregado con exito.");
        } else {
            System.out.println("Error al agregar el repuesto. El codigo ya existe.");
        }
    }

    // Método para modificar un repuesto
    private static void modificarRepuesto(Scanner sc) {
        System.out.print("Codigo del repuesto a modificar: ");
        int codigo = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
        System.out.print("Nueva descripcion: ");
        String descripcion = sc.nextLine();
        System.out.print("Nuevo departamento: ");
        String departamento = sc.nextLine();
        System.out.print("Nuevo stock: ");
        int stock = sc.nextInt();

        // Llamar al método de modificación
        if (GestionRepuestos.modificarRepuesto(codigo, descripcion, departamento, stock)) {
            System.out.println("Repuesto modificado con exito.");
        } else {
            System.out.println("Error: Repuesto no encontrado.");
        }
    }

    // Método para borrar un repuesto
    private static void borrarRepuesto(Scanner sc) {
        System.out.print("Codigo del repuesto a borrar: ");
        int codigo = sc.nextInt();

        // Llamar al método de borrado
        if (GestionRepuestos.borrarRepuesto(codigo)) {
            System.out.println("Repuesto borrado con exito.");
        } else {
            System.out.println("Error: Repuesto no encontrado.");
        }
    }
}
