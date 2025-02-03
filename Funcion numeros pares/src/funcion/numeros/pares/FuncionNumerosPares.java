
package funcion.numeros.pares;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author oscar.domalo
 */
public class FuncionNumerosPares {
    
    public static int numerosPares(){
        int pares = 0;
        for (int i = 0; i <= 30; i++) {
            pares =i;
            if (pares %2 == 0) {
                System.out.print(pares + ", ");
            }else;
 
            /*
             System.out.print(pares + ", ");*/
             
        }
        return pares;
    }
    
    public static int sumaNumeros(){
        int suma = 0;
        int numGenerado;
            Random rd = new Random();
            System.out.println("Numeros generados: ");
            for (int i = 1; i<=10; i++){
                numGenerado = rd.nextInt(15,51);
                System.out.print(numGenerado + "  ");
                suma += numGenerado;   
            }
            System.out.println("");
            System.out.println("La suma total de los 10 numeros aleatorios es: " +suma);
            return suma;
    }
    public static int sumaNumerosSobrecargada(int cantidad, int min, int max){
        int suma = 0;
        int numGenerado;
            Random rd = new Random();
            System.out.println("Numeros generados: ");
            for (int i = 1; i<=cantidad; i++){
                numGenerado = rd.nextInt(min,max+1);
                System.out.print(numGenerado + "  ");
                suma += numGenerado;   
            }
            System.out.println("");
            System.out.println("La suma total de los 10 numeros aleatorios es: " +suma);
            return suma;
    }
    /*public static String registraNombres(){
        Scanner sc = new Scanner(System.in);
        String nombres;
        String tablaNombres[] = new String[0];
        System.out.println("Introduce los nombres que desea registrar: ");
        while   (!nombres.equals("fin")){
            
            nombres = sc.next();
            
        }
        System.out.println(nombres);
     return nombres;  
    }*/
   public static String[] borrarNombre(String[] nombres, int indice){
       if (indice < 0 || indice >=nombres.length) {
           System.out.println("Indice no valido");
           return nombres;
       }
       String [] nuevoArreglo = new String[nombres.length - 1];
        System.arraycopy(nombres, 0, nuevoArreglo, 0, indice);
       for (int i = indice +1; i <nombres.length; i++){
           nuevoArreglo[i - 1] = nombres[i];
       }
       return nuevoArreglo;
}
    
    public static void main(String[] args) {
        //System.out.println("Ejecucion funcion numerosPares()");
        //numerosPares();
        //System.out.println("Ejecucion funcion suma numeros: ");
        //sumaNumeros();
        //System.out.println("Ejecucion funcion sumaNumeros sobrecargada: ");
        //sumaNumerosSobrecargada(10,15,50);
        //registraNombres();
        
       
        /*String[] nombres = {"Juan", "Manuel", "Pepe", "Ana"};
        System.out.println("Ejecucion funcion borrar nombre: ");
        System.out.println("Tabla original:");
        System.out.println(Arrays.toString(nombres));
        nombres = borrarNombre(nombres,2);
        System.out.println("Tabla actualizada :");
        System.out.println(Arrays.toString(nombres));*/
        
    }
    
}
