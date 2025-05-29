/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inmobiliarionombreapellido;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author oscar.domalo
 */
public class InmobiliarioNombreApellido {

    public static final EntityManagerFactory emf
            = Persistence.createEntityManagerFactory("inmobiliarioNombreApellidoPU");

    static List<Piso> lista = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*9(1) - Crear un menú que llame a las funciones creadas en los puntos 
        anteriores y vaya sincronizando los datos de oracle con los de una lista
        que refleje las inserciones - modificaciones - borrados realizados por 
        el usuario.*/
        
        int opcion;
        do {
            System.out.println("\n--- Menu Inmobiliaria ---");
            System.out.println("1. Dar de alta un piso");
            System.out.println("2. Modificar un piso");
            System.out.println("3. Borrar un piso");
            System.out.println("4. Listar pisos por precio ascendente");
            System.out.println("5. Listar pisos por precio descendente");
            System.out.println("6. Listar pisos por precio provincia, m2 y precio.");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1 ->
                    altaPiso(sc);
                case 2 ->
                    modificarPiso(sc);
                case 3 ->
                    borrarPiso(sc);
                case 4 ->
                    listarPisos();
                case 5 ->
                    listarPisosInvertido();
                case 6 ->
                    listarPisosTriple();
                case 0 ->
                    System.out.println("Saliendo...");
                default ->
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
        sc.close();

    }

    /*3(1) - Crear la función “altaPiso” que pida al usuario los datos de los 
    atributos, cree un objeto Piso, lo haga persistente en oracle y lo devuelva en
    la llamada.*/
    
    public static Piso altaPiso(Scanner sc) {

        System.out.print("Referencia: ");
        String referencia = sc.nextLine();
        System.out.print("Provincia: ");
        String provincia = sc.nextLine();
        System.out.print("Metros cuadrados: ");
        Integer m2 = sc.nextInt();
        System.out.print("Numero de habitaciones: ");
        Integer numeroHabitaciones = sc.nextInt();
        System.out.print("Precio: ");
        Integer precio = sc.nextInt();
        System.out.print("Telefono: ");
        Integer telefono = sc.nextInt();

        Piso piso = new Piso(referencia,
                provincia, m2,
                numeroHabitaciones, precio,
                telefono
        );
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(piso);
            tx.commit();
            System.out.println("Piso guardado en la base de datos.");
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            System.err.println("Error al guardar: " + e.getMessage());
        } finally {

            em.close();
        }
        return piso;
    }

    /*4(1) - Crear la función “modificaPiso” que pida al usuario la referencia 
    del piso y permita modificar todos los atributos del piso salvo la referencia 
    y haga persistente los cambios en oracle, devolviendo el objeto piso modificado
    en la llamada.*/
    
    public static Piso modificarPiso(Scanner sc) {
        System.out.print("Referencia del piso a modificar: ");
        String referencia = sc.nextLine();
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Piso piso = null;
        try {
            piso = em.find(Piso.class, referencia);
            if (piso != null) {
                System.out.print("Provincia: ");
                String provincia = sc.nextLine();
                System.out.print("Metros cuadrados: ");
                Integer m2 = sc.nextInt();
                System.out.print("Numero de habitaciones: ");
                Integer numeroHabitaciones = sc.nextInt();
                System.out.print("Precio: ");
                Integer precio = sc.nextInt();
                System.out.print("Telefono: ");
                Integer telefono = sc.nextInt();
                tx.begin();
                piso.setProvincia(provincia);
                piso.setM2(m2);
                piso.setNumeroHabitaciones(numeroHabitaciones);
                piso.setPrecio(precio);
                piso.setTelefono(telefono);

                em.merge(piso);
                tx.commit();
                System.out.println("Piso actualizado.");

            } else {
                System.out.println("Piso no encontrado.");
            }
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            System.err.println("Error al modificar: "
                    + e.getMessage());
            piso = null;
        } finally {
            em.close();
        }
        return piso;
    }

    /*5(1) - Crear la función “borraPiso” que pida al usuario la referencia del
    piso a borrar, lo elimine de la base de datos y devuelva el objeto piso borrado
    en la llamada.*/
    
    public static Piso borrarPiso(Scanner sc) {
        System.out.print("Referencia del piso a eliminar: ");
        String referencia = sc.nextLine();
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Piso piso = null;
        try {
            piso = em.find(Piso.class, referencia);
            if (piso != null) {
                tx.begin();
                em.remove(piso);
                tx.commit();
                System.out.println("Piso eliminado.");
            } else {
                System.out.println("Piso no encontrado.");
            }
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            System.err.println("Error al eliminar: "
                    + e.getMessage());
            piso = null;
        } finally {
            em.close();
        }
        return piso;
    }

    /*6(1) - Crear la función “listarPisos” (ordenados por orden natural - precio
    ascendente) de la inmobiliaria. Para ello debe leer de oracle todos
    los datos de la tabla y volcarlos en una lista, que devolverá
    en la llamada y que estará disponible en el programa principal para todas 
    las inserciones, modificaciones o borrados de pisos que se realicen.*/
    
    public static List<Piso> listarPisos() {
        EntityManager em = emf.createEntityManager();
        try {
            List<Piso> lista = em.createQuery("SELECT p FROM Piso p"
                    + " ORDER BY p.precio", Piso.class).getResultList();
            if (lista.isEmpty()) {
                System.out.println("No hay contactos.");
            } else {
                System.out.println("\nLista de contactos por precio ascendente:");
                for (Piso c : lista) {
                    System.out.println(c);
                }
            }
        } finally {
            em.close();
        }
        return lista;
    }

    /*7(1) - Crear la función “listarPisosInverso”, que devuelva la lista 
    ordenada por precio descendente.*/
    
    public static List<Piso> listarPisosInvertido() {
        EntityManager em = emf.createEntityManager();
        try {
            List<Piso> lista = em.createQuery("SELECT p FROM Piso p"
                    + " ORDER BY p.precio DESC", Piso.class).getResultList();
            if (lista.isEmpty()) {
                System.out.println("No hay contactos.");
            } else {
                System.out.println("\nLista de contactos por precio descendente:");
                for (Piso c : lista) {
                    System.out.println(c);
                }
            }
        } finally {
            em.close();
        }
        return lista;
    }

    /*8(1) - Crear la función “listarPisosTriple” que devuelva la lista 
    ordenada por provincia, m2 y precio.*/
    
    public static List<Piso> listarPisosTriple() {
        EntityManager em = emf.createEntityManager();
        try {
            List<Piso> lista = em.createQuery("SELECT p FROM Piso p "
                    + "ORDER BY p.provincia, p.m2, p.precio", Piso.class).getResultList();
            if (lista.isEmpty()) {
                System.out.println("No hay contactos.");
            } else {
                System.out.println("\nLista de contactos ordenada por provincia, m2 y precio.");
                for (Piso c : lista) {
                    System.out.println(c);
                }
            }
        } finally {
            em.close();
        }
        return lista;
    }

   

}
