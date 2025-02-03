/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noestaticas;

/**
 *
 * @author oscar.domalo
 */
public class Empleado extends Persona {
   
    double salario;
    int idEmpleado;
    //String estatura;
    public String at1;
    public Empleado(String nombre, int edad, double estatura, double salario, int idEmpleado) {
        super(nombre, edad, estatura);
        this.salario = salario;
        this.idEmpleado = idEmpleado;
    }
    
    @Override
    public void mostrarDatos(){
     
        super.mostrarDatos();
        System.out.println("Salario: " + salario);
        System.out.println("ID Empleado: " + idEmpleado);
        
    }
    
}
