package tienda_repuestos_v2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class GestionRepuestos {

    private static final String FILE_NAME = "repuestos.dat";
    private static List<Repuesto> repuestos = new ArrayList<>();
    private static int total = 0;

    public static void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            while (true) {
                Repuesto r = (Repuesto) ois.readObject();
                repuestos.add(r);
                total++;
            }
        } catch (EOFException e) {
            // Fin del archivo alcanzado, es lo esperado
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No se pudo cargar archivo: " + e.getMessage());
        }
    }

    public static void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            for (Repuesto r : repuestos) {
                oos.writeObject(r);
            }
        } catch (IOException e) {
            System.out.println("Error al guardar datos: " + e.getMessage());
        }
    }

    public static void listarPorCodigo() {
        ordenarRepuestos((r1, r2) -> Integer.compare(r1.getCodigo(), r2.getCodigo()));
    }

    public static void listarPorDescripcion() {
        ordenarRepuestos((r1, r2) -> r1.getDescripcion().compareToIgnoreCase(r2.getDescripcion()));
    }

    public static void listarPorDeptoYDescripcion() {
        ordenarRepuestos((r1, r2) -> {
            int cmp = r1.getDepartamento().compareToIgnoreCase(r2.getDepartamento());
            return cmp != 0 ? cmp : r1.getDescripcion().compareToIgnoreCase(r2.getDescripcion());
        });
    }

    public static void listarPorStock(int cantidad) {
        for (Repuesto r : repuestos) {
            if (r.getStock() < cantidad) {
                r.mostrar();
            }
        }
    }

    public static void buscarPorDescripcion(String desc) {
        for (Repuesto r : repuestos) {
            if (r.getDescripcion().toLowerCase().contains(desc.toLowerCase())) {
                r.mostrar();
            }
        }
    }

    public static boolean altaRepuesto(int codigo, String descripcion, String departamento, int stock) {
        for (Repuesto r : repuestos) {
            if (r.getCodigo() == codigo) {
                System.out.println("El código ya existe.");
                return false;
            }
        }
        repuestos.add(new Repuesto(codigo, descripcion, departamento, stock));
        total++;
        return true;
    }

    public static boolean modificarRepuesto(int codigo, String descripcion, String departamento, int stock) {
        for (Repuesto r : repuestos) {
            if (r.getCodigo() == codigo) {
                r.setDescripcion(descripcion);
                r.setDepartamento(departamento);
                r.setStock(stock);
                return true;
            }
        }
        System.out.println("Repuesto no encontrado.");
        return false;
    }

    public static boolean borrarRepuesto(int codigo) {
        for (int i = 0; i < repuestos.size(); i++) {
            if (repuestos.get(i).getCodigo() == codigo) {
                repuestos.remove(i);
                total--;
                return true;
            }
        }
        System.out.println("Repuesto no encontrado.");
        return false;
    }

    private static void ordenarRepuestos(Comparator<Repuesto> comparator) {
        repuestos.sort(comparator);
    }

    public static List<Repuesto> getRepuestos() {
        return repuestos;
    }
}
