package collections;


import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oscar.domalo
 */
public class Contenedor<T extends Comparable<T>> {
    private T[] tabla;
    
public Contenedor(T[] tabla){
    this.tabla = tabla;
}
void insertarAlFinal(T elemento){
tabla = Arrays.copyOf(tabla, tabla.length +1);
tabla[tabla.length -1] = elemento;
}
void ordenar(){
    Arrays.sort(tabla);
}
//Sobrecarga porque ya hay un metodo ordenar()
void ordenar(Comparator<T> comp){
    Arrays.sort(tabla,comp);
}
    @Override
    public String toString(){
    return Arrays.deepToString(tabla);
}
//Metodo que devuelve el elemento que ocupa el indice
T get(int indice){
    T elemento = null;
    for(int i= 0; i < tabla.length; i++){
        if(i == indice){
            elemento = tabla[i];
        }
    }
    return elemento;
}
} 
