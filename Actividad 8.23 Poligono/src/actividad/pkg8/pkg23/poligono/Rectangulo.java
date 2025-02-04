/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.pkg8.pkg23.poligono;

/**
 *
 * @author oscar.domalo
 */
public class Rectangulo extends Poligono {
    
    
    private double area;
    
    Rectangulo(double base, double altura){
        this.altura = altura;
        this.base = base;
        area = area();
        color = "negro";
    }
    
    @Override
    double area(){
       return base*altura;
   } 
   
   double getArea(){
       return area;
   }
    @Override
   public String toString(){
      
      return "Rectangulo " + color +" (Base: "+base + " ,altura: " + altura+ " y el area :" + getArea() + ").";
   }
}
