/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipo.futbol;
import java.util.Map;
import java.util.Scanner;

public class Jugador {
    private String dni;
    private String nombre;
    private String posicion;
    private double estatura;

    public Jugador(String dni, String nombre, String posicion, double estatura) {
        this.dni = dni;
        this.nombre = nombre;
        this.posicion = posicion;
        this.estatura = estatura;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return nombre + " (" + posicion + ", " + estatura + " m)";
    }

    // altaJugador
    public static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        if (plantilla.containsKey(dorsal)) {
            System.out.println("Ese dorsal ya está ocupado.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("DNI: ");
        String dni = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Posición (portero, defensa, centrocampista, delantero): ");
        String posicion = sc.nextLine();
        System.out.print("Estatura (en metros): ");
        double estatura = sc.nextDouble();
        sc.nextLine(); // Limpieza del buffer

        Jugador nuevo = new Jugador(dni, nombre, posicion, estatura);
        plantilla.put(dorsal, nuevo);
        System.out.println("Jugador añadido con éxito.");
    }

    // eliminarJugador
    public static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        return plantilla.remove(dorsal);
    }

    // mostrar todos
    public static void mostrar(Map<Integer, Jugador> plantilla) {
        for (Map.Entry<Integer, Jugador> entrada : plantilla.entrySet()) {
            System.out.println("Dorsal " + entrada.getKey() + ": " + entrada.getValue().getNombre());
        }
    }

    // mostrar por posición
    public static void mostrar(Map<Integer, Jugador> plantilla, String posicion) {
        for (Map.Entry<Integer, Jugador> entrada : plantilla.entrySet()) {
            if (entrada.getValue().getPosicion().equalsIgnoreCase(posicion)) {
                System.out.println("Dorsal " + entrada.getKey() + ": " + entrada.getValue().getNombre());
            }
        }
    }

    // editarJugador
    public static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        if (!plantilla.containsKey(dorsal)) {
            return false;
        }

        Jugador j = plantilla.get(dorsal);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nuevo nombre (" + j.getNombre() + "): ");
        String nombre = sc.nextLine();
        System.out.print("Nueva posición (" + j.getPosicion() + "): ");
        String posicion = sc.nextLine();
        System.out.print("Nueva estatura (" + j.getEstatura() + "): ");
        double estatura = sc.nextDouble();
        sc.nextLine(); // Limpiar buffer

        j.setNombre(nombre);
        j.setPosicion(posicion);
        j.setEstatura(estatura);

        return true;
    }
}