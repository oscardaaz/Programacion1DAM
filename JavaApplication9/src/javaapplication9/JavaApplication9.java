package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author oscar.domalo
 */
public class JavaApplication9 {
   

    

   
    

    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String texto = sc.next();
        //System.out.println(texto);
       String textoInvertido = "";
        
        
        for (int i = texto.length()-1; i > -1; i--) {
            textoInvertido += texto.charAt(i);
            //textoInvertido = textoInvertido.concat(texto.charAt(i)+"");
            //System.out.println(textoInvertido);
             
                
            
        }
         
        
        System.out.println(texto + textoInvertido);
    }

}
