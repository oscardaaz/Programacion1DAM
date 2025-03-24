/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protectora;

/**
 *
 * @author oscar.domalo
 */
public class Gato extends Animal{
    boolean araña,muerde;
    
   
    Gato(boolean pelo, boolean domestico, int edad, String chip){
        terrestre = true;
        patas = 4;
        this.pelo = pelo;
        this.domestico = domestico;
        this.edad = edad;
        super.chip = this.chip;
        araña = true;
        muerde = true;
    }
   
    @Override
    void sonido(){
        System.out.println("miau");
    }
    @Override
    public String toString(){
        return super.toString() + " araña: " + araña + " muerde: "+muerde;
    }
    void dimeTodoGato(){
        System.out.println(this.toString() + " ,patas: " + patas + " , Pelo: " + pelo
        +" , Domestico: " + domestico);
    }
    void setMuerde(boolean muerde){
        this.muerde = muerde;
    }
    void setChip(String chip){
        this.chip = chip;
    }
    
}
