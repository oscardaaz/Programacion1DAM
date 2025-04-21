/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_cola_y_pila;

import java.util.ArrayList;

/**
 *
 * @author oscar.domalo
 */
public class Pila<T> {
     private ArrayList<T> elementos = new ArrayList<>();

    public void apilar(T elemento) {
        elementos.add(elemento);
    }

    public T desapilar() {
        if (!estaVacia()) {
            return elementos.remove(elementos.size() - 1);
        }
        return null;
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    public T cima() {
        if (!estaVacia()) {
            return elementos.get(elementos.size() - 1);
        }
        return null;
    }
}
