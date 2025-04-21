/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_cola_y_pila;

import java.util.ArrayList;

/**
 *
 * @author IamOs
 * @param <T>
 */
public class Cola<T> {
    
     private ArrayList<T> elementos = new ArrayList<>();

    public void encolar(T elemento) {
        elementos.add(elemento);
    }

    public T desencolar() {
        if (!estaVacia()) {
            return elementos.remove(0);
        }
        return null;
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    public T frente() {
        if (!estaVacia()) {
            return elementos.get(0);
        }
        return null;
    }
}
