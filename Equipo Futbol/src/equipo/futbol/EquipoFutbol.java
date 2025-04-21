/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equipo.futbol;
import java.util.*;
/**
 *
 * @author oscar.domalo
 */
public class EquipoFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Integer, Jugador> plantilla = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ GESTIÓN PLANTILLA ---");
            System.out.println("1. Dar de alta un jugador");
            System.out.println("2. Eliminar un jugador");
            System.out.println("3. Mostrar todos los jugadores");
            System.out.println("4. Mostrar jugadores por posición");
            System.out.println("5. Editar un jugador");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el dorsal: ");
                    int dorsalAlta = sc.nextInt();
                    sc.nextLine();
                    Jugador.altaJugador(plantilla, dorsalAlta);
                    break;

                case 2:
                    System.out.print("Introduce el dorsal del jugador a eliminar: ");
                    int dorsalEliminar = sc.nextInt();
                    Jugador eliminado = Jugador.eliminarJugador(plantilla, dorsalEliminar);
                    if (eliminado != null) {
                        System.out.println("Jugador eliminado: " + eliminado.getNombre());
                    } else {
                        System.out.println("No existe un jugador con ese dorsal.");
                    }
                    break;

                case 3:
                    Jugador.mostrar(plantilla);
                    break;

                case 4:
                    System.out.print("Introduce la posición (portero, defensa, centrocampista, delantero): ");
                    String posicion = sc.nextLine();
                    Jugador.mostrar(plantilla, posicion);
                    break;

                case 5:
                    System.out.print("Introduce el dorsal del jugador a editar: ");
                    int dorsalEditar = sc.nextInt();
                    sc.nextLine();
                    boolean editado = Jugador.editarJugador(plantilla, dorsalEditar);
                    if (editado) {
                        System.out.println("Jugador editado correctamente.");
                    } else {
                        System.out.println("No se encontró jugador con ese dorsal.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}