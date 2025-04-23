package tienda_repuestos_v2;

import java.util.Scanner;

public class Tienda_Repuestos_v2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        // Cargar los datos desde el archivo
        GestionRepuestos.cargarDatos();

        do {
            // Mostrar el menú
            System.out.println("\n*** Tienda de Repuestos ***");
            System.out.println("1. Listar por código");
            System.out.println("2. Listar por descripción");
            System.out.println("3. Listar por departamento y descripción");
            System.out.println("4. Listar con stock menor a una cantidad");
            System.out.println("5. Buscar por descripción");
            System.out.println("6. Alta de repuesto");
            System.out.println("7. Modificar repuesto");
            System.out.println("8. Borrar repuesto");
            System.out.println("9. Salir y guardar");
            System.out.print("Seleccione una opción: ");
            
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

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
                    System.out.print("Ingrese la cantidad mínima de stock: ");
                    int cantidad = sc.nextInt();
                    GestionRepuestos.listarPorStock(cantidad);
                    break;
                case 5: 
                    System.out.print("Ingrese la descripción a buscar: ");
                    String descripcion = sc.nextLine();
                    GestionRepuestos.buscarPorDescripcion(descripcion); 
                    break;
                case 6: 
                    System.out.print("Ingrese el código: ");
                    int codigo = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese la descripción: ");
                    String descripcionAlta = sc.nextLine();
                    System.out.print("Ingrese el departamento: ");
                    String departamentoAlta = sc.nextLine();
                    System.out.print("Ingrese el stock: ");
                    int stockAlta = sc.nextInt();
                    if (GestionRepuestos.altaRepuesto(codigo, descripcionAlta, departamentoAlta, stockAlta)) {
                        System.out.println("Repuesto dado de alta.");
                    }
                    break;
                case 7: 
                    System.out.print("Ingrese el código del repuesto a modificar: ");
                    int codigoModificar = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese la nueva descripción: ");
                    String descripcionModificar = sc.nextLine();
                    System.out.print("Ingrese el nuevo departamento: ");
                    String departamentoModificar = sc.nextLine();
                    System.out.print("Ingrese el nuevo stock: ");
                    int stockModificar = sc.nextInt();
                    if (GestionRepuestos.modificarRepuesto(codigoModificar, descripcionModificar, departamentoModificar, stockModificar)) {
                        System.out.println("Repuesto modificado.");
                    }
                    break;
                case 8: 
                    System.out.print("Ingrese el código del repuesto a borrar: ");
                    int codigoBorrar = sc.nextInt();
                    if (GestionRepuestos.borrarRepuesto(codigoBorrar)) {
                        System.out.println("Repuesto borrado.");
                    }
                    break;
                case 9: 
                    // Guardar los datos y salir
                    GestionRepuestos.guardarDatos();
                    System.out.println("Datos guardados. Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 9);
    }
}
