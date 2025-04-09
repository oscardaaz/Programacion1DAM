/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datos.de.clientes;

/**
 *
 * @author oscar.domalo
 */
import java.io.*;
import java.util.*;

public class DatosDeClientes {

    private static final String ARCHIVO = "clientes.dat";
    private static List<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {
        cargarClientes();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Añadir nuevo cliente");
            System.out.println("2. Modificar datos");
            System.out.println("3. Dar de baja cliente");
            System.out.println("4. Listar los clientes");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la línea nueva

            switch (opcion) {
                case 1:
                    añadirCliente(scanner);
                    break;
                case 2:
                    modificarCliente(scanner);
                    break;
                case 3:
                    darDeBajaCliente(scanner);
                    break;
                case 4:
                    listarClientes();
                    break;
                case 0:
                    guardarClientes();
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);
    }

    private static void cargarClientes() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO))) {
            clientes = (List<Cliente>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo, comenzando con lista vacía.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los datos.");
        }
    }

    private static void guardarClientes() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            oos.writeObject(clientes);
        } catch (IOException e) {
            System.out.println("Error al guardar los datos.");
        }
    }

    private static void añadirCliente(Scanner scanner) {
        System.out.print("Introduce el ID del cliente: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consumir la línea nueva
        System.out.print("Introduce el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce el teléfono del cliente: ");
        String telefono = scanner.nextLine();

        Cliente cliente = new Cliente(id, nombre, telefono);
        clientes.add(cliente);
        System.out.println("Cliente añadido con éxito.");
    }

    private static void modificarCliente(Scanner scanner) {
        System.out.print("Introduce el ID del cliente a modificar: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consumir la línea nueva

        for (Cliente cliente : clientes) {
            if (cliente.id == id) {
                System.out.print("Introduce el nuevo nombre del cliente: ");
                cliente.nombre = scanner.nextLine();
                System.out.print("Introduce el nuevo teléfono del cliente: ");
                cliente.telefono = scanner.nextLine();
                System.out.println("Cliente modificado con éxito.");
                return;
            }
        }

        System.out.println("Cliente no encontrado.");
    }

    private static void darDeBajaCliente(Scanner scanner) {
        System.out.print("Introduce el ID del cliente a dar de baja: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consumir la línea nueva

        Iterator<Cliente> iterator = clientes.iterator();
        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            if (cliente.id == id) {
                iterator.remove();
                System.out.println("Cliente dado de baja con éxito.");
                return;
            }
        }

        System.out.println("Cliente no encontrado.");
    }

    private static void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("Clientes registrados:");
            for (Cliente cliente : clientes) {
                System.out.println("ID: " + cliente.id + ", Nombre: " + 
                        cliente.nombre + ", Teléfono: " + cliente.telefono);
            }
        }
    }
}