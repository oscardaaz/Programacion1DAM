/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cosas.en.sucio;



    public class CosasEnSucio {

        public static int numerosPares (int numero){
            System.out.println("Los primeros " + numero + " numeros pares son: ");
                for ( int i = 1; i <= numero; i++){
                    System.out.println(i * 2);
                       
                }
                return numero;
        }
            
        public static void main(String[] args) {
        
            //Crea la función muestraPares (int n) que muestre por consola los primeros n números pares.
            numerosPares(5);
        
        
    }
    
}
