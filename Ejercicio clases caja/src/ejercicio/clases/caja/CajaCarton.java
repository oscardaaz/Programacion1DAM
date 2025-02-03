/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.clases.caja;

/**
 *
 * @author oscar.domalo
 */
public class CajaCarton extends Caja{
    
    // Variable estática para almacenar la superficie total de cartón utilizada en todas las cajas
    private static double m2Carton = 0;
    
    // Constructor de la clase CajaCarton
    public CajaCarton(int ancho, int alto, int fondo) {
        // Llama al constructor de la clase padre (Caja) con los parámetros proporcionados
        super(ancho, alto, fondo, "CM");
        
        // Actualiza la superficie total de cartón utilizada
        this.updateM2Carton();
    }
    
    // Método para actualizar la superficie total de cartón utilizada
    void updateM2Carton() {
        // Calcula la superficie de la caja y la suma a la superficie total de cartón
        // La superficie se divide por 10000 para convertir de cm² a m²
        m2Carton += 2 * (ancho * fondo + ancho * alto + fondo * alto) / 10000;  
    }
    
    // Método estático para obtener la superficie total de cartón utilizada
    static double getm2Carton() {
        // Imprime la superficie total de cartón utilizada
        System.out.println("La superficie de las cajas totales = " + m2Carton + " m2" + "\n");
        return m2Carton;
    }
   
    // Sobrescribe el método getVolumen de la clase padre (Caja)
    @Override
    double getVolumen() {
        // Calcula el volumen de la caja y lo reduce en un 20% (multiplicando por 0.8)
        double resultado;
        resultado = super.getVolumen() * 0.8;
        return resultado;
    }
    
    // Sobrescribe el método toString para proporcionar una representación en cadena de la caja
    @Override
    public String toString() {
        // Crea una cadena con información sobre la caja, incluyendo su volumen
        String info;
        info = "La caja " + this.getClass().getSimpleName() + " tiene un volumen de: " + this.getVolumen() + " " + unidad + " cúbicos" + "\n";
        return info;





}}


