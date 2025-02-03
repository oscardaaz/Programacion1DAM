/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.clases.caja;

import java.util.Objects;

/**
 *
 * @author oscar.domalo
 */
public class Caja {
    
    // Atributos de la clase Caja
    int ancho, alto, fondo;  // Dimensiones de la caja
    String unidad;           // Unidad de medida (CM o M)
    String etiqueta;         // Etiqueta descriptiva de la caja
    String material;         // Material de la caja (por defecto "Carton")

    // Constructor de la clase Caja
    Caja (int ancho, int alto, int fondo, String unidad){
        this.ancho = ancho;  // Asigna el ancho de la caja
        this.alto = alto;    // Asigna el alto de la caja
        this.fondo = fondo;  // Asigna el fondo de la caja
        
        // Valida y asigna la unidad de medida (CM o M)
        this.setUnidad(unidad.toUpperCase());
        
        // Asigna el material por defecto "Carton"
        this.material = "Carton";
        this.etiqueta = "hola";
    }

    // Método para establecer la unidad de medida
    void setUnidad(String unidad){
        // Verifica si la unidad es "CM" o "M"
        if (unidad.toUpperCase().equals("CM") || unidad.toUpperCase().equals("M")){
            this.unidad = unidad.toUpperCase();  // Asigna la unidad en mayúsculas
        } else {
            System.out.println("La unidad debe ser CM o M");  // Mensaje de error si la unidad no es válida
        }
    }
    
    // Método para calcular el volumen de la caja
    double getVolumen(){
        double volumen = ancho * alto * fondo;  // Calcula el volumen en la unidad actual
        
        // Si la unidad es "CM", convierte el volumen a metros cúbicos
        if (unidad.toUpperCase().equals("CM")) {
            volumen = volumen / 1000000;  // 1 m³ = 1,000,000 cm³
        }
        
        return volumen;  // Retorna el volumen calculado
    }
    
    // Método para establecer la etiqueta de la caja
    void setEtiqueta(String etiqueta){
        // Verifica que la etiqueta no exceda los 30 caracteres
        if (etiqueta.length() > 30) {
            System.out.println("La etiqueta no puede contener más de 30 caracteres");
        } else {
            this.etiqueta = etiqueta;  // Asigna la etiqueta si es válida
        }
    }

    // Método para establecer el material de la caja
    void setMaterial(String material){
        // Verifica que el material no exceda los 20 caracteres
        if (material.length() > 20) {
            System.out.println("El material no puede contener más de 20 caracteres");
        } else {
            this.material = material;  // Asigna el material si es válido
        }
    }
    
    // Método para representar la caja como una cadena de texto
    @Override
    public String toString(){
        String infoCaja;
        // Construye la cadena con la información de la caja
        infoCaja = "La caja tiene " + (alto + "," + ancho + "," + fondo) + 
                   ", un volumen de: " + this.getVolumen() + " " + unidad + 
                   " cúbicos, de material " + material + " con la etiqueta " + etiqueta + ".";
        return infoCaja;
    }
    
    // Método para comparar dos cajas y determinar si son iguales
    @Override
    public boolean equals(Object otraCaja){
        boolean iguales = false;
        Caja laOtraCaja = (Caja) otraCaja;  // Convierte el objeto a tipo Caja
        
        // Compara todos los atributos de las dos cajas
        if (this.alto == laOtraCaja.alto && this.ancho == laOtraCaja.ancho &&
            this.fondo == laOtraCaja.fondo && this.etiqueta.equals(laOtraCaja.etiqueta) &&
            this.material.equals(laOtraCaja.material) && this.unidad.equals(laOtraCaja.unidad)) {
            iguales = true;  // Si todos los atributos son iguales, las cajas son iguales
            System.out.println("Las cajas son iguales " + iguales);
        }
        return iguales;
        // Retorna el resultado de la comparación
    
    
    
    
    
    }

  
    }
