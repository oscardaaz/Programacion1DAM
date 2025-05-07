/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud14peliculas;
import oracle.sql.*;
/**
 *
 * @author oscar.domalo
 */
public class Pelicula {
    
    String titulo;
    int anio, duracion, presupuesto, recaudacion, oscar;
    
    public Pelicula(String titulo, int anio, int duracion, int presupuesto,int recaudacion, int oscar){
        this.titulo = titulo;
        this.anio = anio;
        this.duracion = duracion;
        this.presupuesto = presupuesto;
        this.recaudacion = recaudacion;
        this.oscar = oscar;
    }
    public Pelicula(String titulo){
        this.titulo = titulo;
        this.anio = 2000;
    }
    
    @Override
    public String toString(){
      return "Titulo: " + titulo + ", año; " + anio + ", duracion: " + duracion
              + ", presupuesto: " + presupuesto + ", recaudacion: " + recaudacion
              + ", numero de oscar: " + oscar + "\n"; 
    }
    
    
    
}
