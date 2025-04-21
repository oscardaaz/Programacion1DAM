/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases_cola_y_pila;

/**
 *
 * @author IamOs
 */
public class Clases_Cola_y_Pila {

    public static void main(String[] args) {

        // Prueba de Pila
        Pila<Integer> pila = new Pila<>();
        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);
        System.out.println("Desapilado: " + pila.desapilar()); // 3

        // Prueba de Cola
        Cola<String> cola = new Cola<>();
        cola.encolar("A");
        cola.encolar("B");
        cola.encolar("C");
        System.out.println("Desencolado: " + cola.desencolar()); // A
    }
}

