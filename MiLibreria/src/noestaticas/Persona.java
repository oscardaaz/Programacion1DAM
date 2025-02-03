/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noestaticas;

/**
 *
 * @author oscar.domalo
 */
public class Persona {
    public String nombre;
    public int edad;
    public double estatura;
    public int at1;
    public static int edadJubilacion = 65;
    //final String DNI;
    
    public Persona(String nombre, int edad, double estatura){
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }
    public Persona(String nombre){
        this.nombre = nombre;
        //this(nombre,10);
        
    }
    public static int getEdadJubilacion(){
        return edadJubilacion;
    }
    public void saludar(){
        System.out.println("Hola. Mi nombre es " + nombre);
        System.out.println("Encantado!");
    }
    public void cumplirAños(){
        int var;
        edad ++;
        
    }
    public void crecer (double incremento){
       
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " +edad);
        System.out.println("Estatura: "+estatura);
    }
}
