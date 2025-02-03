
package ejercicio.borrarnombres;

import java.util.Arrays;

/**
 *
 * @author oscar.domalo
 */
public class EjercicioBorrarNombres {
    
public static String[] borrarNombre(String[] nombres, int indice){
       if (indice < 0 || indice >=nombres.length) {
           System.out.println("Indice no valido");
           return nombres;
       }
       String [] nuevoArreglo = new String[nombres.length - 1];
       for (int i = 0; i < indice; i++){
           nuevoArreglo[i] = nombres[i];
       }
       for (int i = indice +1; i <nombres.length; i++){
           nuevoArreglo[i - 1] = nombres[i];
       }
       return nuevoArreglo;
}
    
    public static void main(String[] args) {
        
        System.out.println("Ejecucion funcion borrar nombre: ");
        String[] nombres = {"Juan", "Manuel", "Pepe", "Ana"};
        System.out.println("Tabla original:");
        System.out.println(Arrays.toString(nombres));
        nombres = borrarNombre(nombres,2);
        System.out.println("Tabla actualizada :");
        System.out.println(Arrays.toString(nombres));
    }
    
}
