/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.pkg8.pkg23.poligono;

/**
 *
 * @author oscar.domalo
 */
public class Triangulo extends Poligono {
    
    private double area;
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        area = area();
    }
    
    @Override
    double area(){
        double calculo = altura * base / 2;
        return calculo;
        
    }
    double getArea(){
       return area;
   }
    @Override
    public String toString(){
      String info;
      return "Triangulo (Base: "+base + " ,altura: " + altura+ " y el area :" + getArea() + ").";
              
   }
}
