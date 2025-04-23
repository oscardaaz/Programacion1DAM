package examenprogramacion2ºtrimestre;

import java.io.*;
import java.util.*;

public class GestionRepuestos {

    static String FICHERO = "repuestos.dat";
    static Repuesto[] repuestos = new Repuesto[100];
    static int total = 0;

    public static void cargarDatos() {
        try (ObjectInputStream fich = new ObjectInputStream(new FileInputStream(FICHERO))) {
            while (true) {
                Repuesto r = (Repuesto) fich.readObject();
                repuestos[total++] = r;
            }
        } catch (EOFException e) {
        } catch (Exception e) {
            System.out.println("No se pudo cargar archivo: " + e.getMessage());
        }
    }

    public static void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICHERO))) {
            for (int i = 0; i < total; i++) {
                oos.writeObject(repuestos[i]);
            }
        } catch (IOException e) {
            System.out.println("Error al guardar datos: " + e.getMessage());
        }
    }

    public static void listarPorDescripcion() {
        Repuesto[] ordenados = ordenarRepuestos(
                (r1, r2) -> r1.getDescripcion().compareToIgnoreCase(r2.getDescripcion())
        );
        mostrarRepuestos(ordenados);
    }

    public static void listarPorDeptoYDescripcion() {
        Repuesto[] ordenados = ordenarRepuestos((r1, r2) -> {
            int cmp = r1.getDepartamento().compareToIgnoreCase(r2.getDepartamento());
            return (cmp != 0) ? cmp : r1.getDescripcion().compareToIgnoreCase(r2.getDescripcion());
        });
        mostrarRepuestos(ordenados);
    }

    public static void listarPorStock(int cantidad) {
        for (int i = 0; i < total; i++) {
            if (repuestos[i].getStock() < cantidad) {
                repuestos[i].mostrar();
            }
        }
    }

    public static void buscarPorDescripcion(String desc) {
        for (int i = 0; i < total; i++) {
            if (repuestos[i].getDescripcion().toLowerCase().contains(desc.toLowerCase())) {
                repuestos[i].mostrar();
            }
        }
    }

    public static boolean altaRepuesto(int codigo, String descripcion, String departamento, int stock) {
        for (int i = 0; i < total; i++) {
            if (repuestos[i].getCodigo() == codigo) {
                System.out.println("El codigo ya existe.");
                return false;
            }
        }
        repuestos[total++] = new Repuesto(codigo, descripcion, departamento, stock);
        return true;
    }

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

    public static boolean borrarRepuesto(int codigo) {
        for (int i = 0; i < total; i++) {
            if (repuestos[i].getCodigo() == codigo) {
                for (int j = i; j < total - 1; j++) {
                    repuestos[j] = repuestos[j + 1];
                }
                repuestos[--total] = null;
                return true;
            }
        }
        System.out.println("Repuesto no encontrado.");
        return false;
    }

    private static Repuesto[] ordenarRepuestos(Comparator<Repuesto> comparator) {
        Repuesto[] copia = Arrays.copyOf(repuestos, total);
        for (int i = 0; i < copia.length - 1; i++) {
            for (int j = i + 1; j < copia.length; j++) {
                if (comparator.compare(copia[i], copia[j]) > 0) {
                    Repuesto tmp = copia[i];
                    copia[i] = copia[j];
                    copia[j] = tmp;
                }
            }
        }
        return copia;
    }

    private static void mostrarRepuestos(Repuesto[] lista) {
        for (Repuesto r : lista) {
            r.mostrar();
        }
    }

    public static void listarPorCodigo() {
        Repuesto[] copia = Arrays.copyOf(repuestos, total);
        Arrays.sort(copia);
        mostrarRepuestos(copia);
    }

}
