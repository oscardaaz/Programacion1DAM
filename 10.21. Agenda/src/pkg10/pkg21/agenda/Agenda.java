/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10.pkg21.agenda;

import java.util.Scanner;

/**
 *
 * @author oscar.domalo 
 * Diseño de una agenda con el siguiente menu: 1 - Nuevo
 * contacto 2 - Buscar por nombre 3 - Mostrar todos 4 - Salir La agenda tendra
 * un maximo de 20 personas Se debe comprobar que la agenda no este llena antes
 * de añadir un nuevo contacto Se deve comprobar que el nombre que se quiere
 * insertar no este ya en la agenda La opcion de busqueda por nombre debe buscar
 * con patrones La tabla debe quedar ordenada alfabeticamente por nombre Los
 * datos se guardan en el archivo agenda.txt
 */
public class Agenda {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Contacto[] agenda = new Contacto[20];
        agenda[0] = new Contacto("Pepe", 698765432);
        System.out.println(agenda[0]);
       
            System.out.println("Seleccione una opcion: ");
            System.out.println("1 - Nuevo contacto.");
            System.out.println("2 - Buscar por nombre: ");
            System.out.println("3 - Mostrar todos");
            System.out.println("4 - Salir");
       
      
    
        

        //leerFichero();
    }

    void nuevoContacto() {
        int cantidadContactos = 0;
        final int MAX_CONTACTOS = 20;
        if (cantidadContactos >= MAX_CONTACTOS) {
            System.out.println("Error ya has llegado al limite de contactos");
        }else{
            for (int i = 0; i < MAX_CONTACTOS; i++) {
                agenda[i] = new Contacto(sc.nextLine());
                cantidadContactos++;
            }
            
        }
    }
        

    void buscarPorNombre(String nombre) {

    }

    void mostrarTodos() {

    }

    void salir() {
        //ordenar y salir.
    }

    void leerFichero() {

    }

}
