/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noestaticas;

/**
 *
 * @author oscar.domalo
 */
public class CuentaCorriente {
    String dni;
    String nombre;
    double saldo;
    
    public CuentaCorriente (String dni, String nombre){
    this(dni,nombre,0);
    //this.dni = dni;
    //this.nombre = nombre;
    
}
    public CuentaCorriente (String dni, double cant){
        this(dni,null,cant);
        //this.dni = dni;
        //this.saldo = cant;
    }
    
    public CuentaCorriente (String dni, String nombre, double cant){
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = cant;
    }
    public void meterDinero (double cant){
        saldo += cant;
    }
    public void muestraInfoCuenta(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Dni:" + dni);
        System.out.println("Saldo: " + saldo + " euros");
    }
    public boolean sacarDinero(double cant){
        boolean luzVerde;
        if (saldo >= cant) {
            saldo -= cant;
            luzVerde = true;
        }else{
            System.out.println("No queda dinero suficiente.");
            luzVerde = false;
        }
        return luzVerde;
    }
}
