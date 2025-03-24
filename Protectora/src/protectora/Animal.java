/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protectora;

/**
 *
 * @author oscar.domalo
 */
public class Animal {
    int patas;
    boolean pelo, terrestre, domestico;
    int edad;
    String chip;
    
    
    
    void sonido(){
        System.out.println("Sonido por defecto");
    }
    
    @Override
    public String toString(){
        return "El animal: " + chip + "es terrestre: " + terrestre;
    }
    
    /*void setChip(String chip){
        super.chip = this.chip;
    }*/
}
