/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.cambio;

/**
 *
 * @author oscar.domalo
 */
public class Cambio {
    

    // Denominaciones de billetes y monedas
    private static final int[] DENOMINACIONES = {500, 200, 100, 50, 20, 10, 5, 2, 1};

    // Método para calcular y mostrar el cambio con el menor número de billetes y monedas
    public static void calcularCambio(int cambio) {
        System.out.println("Cambio a devolver:");
        
        for (int denominacion : DENOMINACIONES) {
            int cantidad = cambio / denominacion;  // Cantidad de billetes/monedas de esa denominación
            if (cantidad > 0) {
                System.out.println(cantidad + " billetes/monedas de " + denominacion + " euros");
                cambio %= denominacion;  // Actualizamos el cambio restante
            }
        }
    }}

    


