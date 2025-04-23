package tienda_repuestos;

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Tienda_Repuestos {

    static Repuesto[] repuestos = new Repuesto[100]; // Array para almacenar hasta 100 repuestos
    static int total = 0; // Número actual de repuestos en el array
    static final String FILE_NAME = "repuestos.dat"; // Nombre del archivo binario

    public static void main(String[] args) {

        cargarDatos(); // Cargar los datos desde el archivo binario al iniciar
        Scanner sc = new Scanner(System.in); // Scanner para leer entradas del usuario
        int opcion;
        do {
            // Mostrar menú de opciones
            System.out.println("\n1. Listar por codigo\n2. Listar por descripcion\n3. Listar por departamento y descripcion\n4. Listar con stock menor a cantidad\n5. Buscar por descripcion\n6. Alta\n7. Modificar\n8. Borrar\n9. Salir y guardar");
            opcion = sc.nextInt(); // Leer opción seleccionada por el usuario
            sc.nextLine(); // Limpiar el buffer
            // Ejecutar la opción seleccionada
            switch (opcion) {
                case 1:
                    listarPorCodigo();
                    break;
                case 2:
                    listarPorDescripcion();
                    break;
                case 3:
                    listarPorDeptoYDescripcion();
                    break;
                case 4:
                    listarPorStock(sc);
                    break;
                case 5:
                    buscarPorDescripcion(sc);
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
                    guardarDatos();
                    break; // Salir y guardar datos en archivo
            }
        } while (opcion != 9); // Repetir hasta que el usuario elija salir
    }

    // Método para cargar datos desde el archivo binario
    static void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            while (true) {
                Repuesto r = (Repuesto) ois.readObject(); // Leer objeto del archivo
                repuestos[total++] = r; // Guardar en el array y aumentar el contador
            }
        } catch (EOFException e) {
            // Fin del archivo alcanzado, es lo esperado
        } catch (Exception e) {
            System.out.println("No se pudo cargar archivo: " + e.getMessage());
        }
    }

    // Método para guardar datos en el archivo binario
    static void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            for (int i = 0; i < total; i++) {
                oos.writeObject(repuestos[i]); // Escribir cada objeto en el archivo
            }
        } catch (IOException e) {
            System.out.println("Error al guardar datos: " + e.getMessage());
        }
    }

    // Método para listar repuestos ordenados por código (orden natural)
    static void listarPorCodigo() {
        for (int i = 0; i < total - 1; i++) {
            for (int j = i + 1; j < total; j++) {
                if (repuestos[i].codigo > repuestos[j].codigo) {
                    Repuesto tmp = repuestos[i];
                    repuestos[i] = repuestos[j];
                    repuestos[j] = tmp;
                }
            }
        }
        for (int i = 0; i < total; i++) {
            repuestos[i].mostrar(); // Mostrar todos los repuestos
        }
    }

    // Método para listar repuestos ordenados por descripción
    static void listarPorDescripcion() {
        for (int i = 0; i < total - 1; i++) {
            for (int j = i + 1; j < total; j++) {
                if (repuestos[i].descripcion.compareToIgnoreCase(repuestos[j].descripcion) > 0) {
                    Repuesto tmp = repuestos[i];
                    repuestos[i] = repuestos[j];
                    repuestos[j] = tmp;
                }
            }
        }
        for (int i = 0; i < total; i++) {
            repuestos[i].mostrar();
        }
    }

    // Método para listar repuestos ordenados por departamento y luego por descripción
    static void listarPorDeptoYDescripcion() {
        for (int i = 0; i < total - 1; i++) {
            for (int j = i + 1; j < total; j++) {
                int cmp = repuestos[i].departamento.compareToIgnoreCase(repuestos[j].departamento);
                if (cmp > 0 || (cmp == 0 && repuestos[i].descripcion.compareToIgnoreCase(repuestos[j].descripcion) > 0)) {
                    Repuesto tmp = repuestos[i];
                    repuestos[i] = repuestos[j];
                    repuestos[j] = tmp;
                }
            }
        }
        for (int i = 0; i < total; i++) {
            repuestos[i].mostrar();
        }
    }

    // Método para listar repuestos con stock inferior a una cantidad
    static void listarPorStock(Scanner sc) {
        System.out.print("Introduce la cantidad minima de stock: ");
        int cantidad = sc.nextInt(); // Leer cantidad del usuario
        for (int i = 0; i < total; i++) {
            if (repuestos[i].stock < cantidad) {
                repuestos[i].mostrar(); // Mostrar si stock < cantidad
            }
        }
    }

    // Método para buscar repuestos por descripción parcial (contiene el texto)
    static void buscarPorDescripcion(Scanner sc) {
        System.out.print("Introduce la descripcion a buscar: ");
        String desc = sc.nextLine(); // Leer descripción a buscar
        for (int i = 0; i < total; i++) {
            if (repuestos[i].descripcion.toLowerCase().contains(desc.toLowerCase())) {
                repuestos[i].mostrar();
            }
        }
    }

    // Método para dar de alta un nuevo repuesto
    static void altaRepuesto(Scanner sc) {
        System.out.print("Codigo: ");
        int cod = sc.nextInt(); // Leer código del nuevo repuesto
        sc.nextLine();
        System.out.print("Descripcion: ");
        String desc = sc.nextLine(); // Leer descripción
        System.out.print("Departamento: ");
        String depto = sc.nextLine(); // Leer departamento
        System.out.print("Stock: ");
        int stock = sc.nextInt(); // Leer cantidad de stock
        repuestos[total++] = new Repuesto(cod, desc, depto, stock); // Crear y añadir nuevo repuesto
    }

    // Método para modificar un repuesto existente por código
    static void modificarRepuesto(Scanner sc) {
        System.out.print("Codigo del repuesto a modificar: ");
        int cod = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < total; i++) {
            if (repuestos[i].codigo == cod) {
                System.out.print("Nueva descripcion: ");
                repuestos[i].descripcion = sc.nextLine();
                System.out.print("Nuevo departamento: ");
                repuestos[i].departamento = sc.nextLine();
                System.out.print("Nuevo stock: ");
                repuestos[i].stock = sc.nextInt();
                return;
            }
        }
        System.out.println("Repuesto no encontrado.");
    }

    // Método para borrar un repuesto por código
    static void borrarRepuesto(Scanner sc) {
        System.out.print("Codigo del repuesto a borrar: ");
        int cod = sc.nextInt();
        for (int i = 0; i < total; i++) {
            if (repuestos[i].codigo == cod) {
                for (int j = i; j < total - 1; j++) {
                    repuestos[j] = repuestos[j + 1]; // Desplazar elementos para sobrescribir el borrado
                }
                repuestos[--total] = null; // Decrementar total y eliminar última referencia
                System.out.println("Repuesto borrado.");
                return;
            }
        }
        System.out.println("Repuesto no encontrado.");
    }
}
