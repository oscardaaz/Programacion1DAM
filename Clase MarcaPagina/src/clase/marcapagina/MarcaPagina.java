/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.marcapagina;

/**
 *
 * @author oscar.domalo
 */
public class MarcaPagina {
    
    String libro;
    int pagina;
    
    MarcaPagina(String libro){
        this.libro = libro;
        this.pagina = 1;
    }
    
    void incrementoPagina(){
        pagina++;
        
    }
   
    String ultimaPagina(){
        if (pagina == 1) {
            return "Todavia no has empezado a leer " + libro +" \n";
            }else return "Vas por la pagina: " + pagina + " del libro: " + libro + "\n";
        
    }
    void reiniciarLectura(){
        pagina = 1;
        System.out.println("Comenzando de nuevo la lectura de: "
        + libro + " desde cero.\n");
        
    }
    
}
