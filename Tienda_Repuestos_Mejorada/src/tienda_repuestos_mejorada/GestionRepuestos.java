package tienda_repuestos_mejorada;

import java.io.*;
import java.util.*;

public class GestionRepuestos {

    private static final String FILE_NAME = "repuestos.dat";
    private static Repuesto[] repuestos = new Repuesto[100]; // Array para almacenar hasta 100 repuestos
    private static int total = 0; // Número actual de repuestos en el array

    // Método para cargar los datos desde el archivo binario
    public static void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            while (true) {
                Repuesto r = (Repuesto) ois.readObject();
                repuestos[total++] = r;
            }
        } catch (EOFException e) {
            // Fin del archivo alcanzado, es lo esperado
        } catch (Exception e) {
            System.out.println("No se pudo cargar archivo: " + e.getMessage());
        }
    }

    // Método para guardar los datos en el archivo binario
    public static void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            for (int i = 0; i < total; i++) {
                oos.writeObject(repuestos[i]);
            }
        } catch (IOException e) {
            System.out.println("Error al guardar datos: " + e.getMessage());
        }
    }

    // Método para listar repuestos ordenados por código
    public static void listarPorCodigo() {
        ordenarRepuestos((r1, r2) -> Integer.compare(r1.getCodigo(), r2.getCodigo()));
        mostrarRepuestos();
    }

    // Método para listar repuestos ordenados por descripción
    public static void listarPorDescripcion() {
        ordenarRepuestos((r1, r2) -> r1.getDescripcion().compareToIgnoreCase(r2.getDescripcion()));
        mostrarRepuestos();
    }

    // Método para listar repuestos ordenados por departamento y luego por descripción
    public static void listarPorDeptoYDescripcion() {
        ordenarRepuestos((r1, r2) -> {
            int cmp = r1.getDepartamento().compareToIgnoreCase(r2.getDepartamento());
            return cmp != 0 ? cmp : r1.getDescripcion().compareToIgnoreCase(r2.getDescripcion());
        });
        mostrarRepuestos();
    }

    // Método para listar repuestos con stock menor a una cantidad
    public static void listarPorStock(int cantidad) {
        for (int i = 0; i < total; i++) {
            if (repuestos[i].getStock() < cantidad) {
                repuestos[i].mostrar();
            }
        }
    }

    // Método para buscar repuestos por descripción
    public static void buscarPorDescripcion(String desc) {
        for (int i = 0; i < total; i++) {
            if (repuestos[i].getDescripcion().toLowerCase().contains(desc.toLowerCase())) {
                repuestos[i].mostrar();
            }
        }
    }

    // Método para dar de alta un nuevo repuesto
    public static boolean altaRepuesto(int codigo, String descripcion, String departamento, int stock) {
        // Verificar si el código ya existe
        for (int i = 0; i < total; i++) {
            if (repuestos[i].getCodigo() == codigo) {
                System.out.println("El codigo ya existe.");
                return false; // No se puede agregar, ya existe el código
            }
        }
        // Agregar el nuevo repuesto
        repuestos[total++] = new Repuesto(codigo, descripcion, departamento, stock);
        return true;
    }

    // Método para modificar un repuesto
    public static boolean modificarRepuesto(int codigo, String descripcion, String departamento, int stock) {
        for (int i = 0; i < total; i++) {
            if (repuestos[i].getCodigo() == codigo) {
                repuestos[i].setDescripcion(descripcion);
                repuestos[i].setDepartamento(departamento);
                repuestos[i].setStock(stock);
                return true;
            }
        }
        System.out.println("Repuesto no encontrado.");
        return false;
    }

    // Método para borrar un repuesto
    public static boolean borrarRepuesto(int codigo) {
        for (int i = 0; i < total; i++) {
            if (repuestos[i].getCodigo() == codigo) {
                for (int j = i; j < total - 1; j++) {
                    repuestos[j] = repuestos[j + 1]; // Desplazar elementos
                }
                repuestos[--total] = null; // Eliminar el último elemento
                return true;
            }
        }
        System.out.println("Repuesto no encontrado.");
        return false;
    }

    // Método auxiliar para ordenar los repuestos
    private static void ordenarRepuestos(Comparator<Repuesto> comparator) {
        for (int i = 0; i < total - 1; i++) {
            for (int j = i + 1; j < total; j++) {
                if (comparator.compare(repuestos[i], repuestos[j]) > 0) {
                    Repuesto tmp = repuestos[i];
                    repuestos[i] = repuestos[j];
                    repuestos[j] = tmp;
                }
            }
        }
    }

    // Método para mostrar todos los repuestos
    private static void mostrarRepuestos() {
        for (int i = 0; i < total; i++) {
            repuestos[i].mostrar();
        }
    }
}
