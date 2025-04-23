package tienda_repuestos;

import java.io.Serializable;

public class Repuesto implements Serializable {

    int codigo; // Código único del repuesto
    String descripcion; // Descripción del repuesto
    String departamento; // Departamento al que pertenece
    int stock; // Cantidad en stock

    // Constructor que inicializa todos los atributos del repuesto
    public Repuesto(int codigo, String descripcion, String departamento, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.departamento = departamento;
        this.stock = stock;
    }

    // Método para mostrar los datos del repuesto por pantalla
    public void mostrar() {
        System.out.println("Codigo: " + codigo + ", Descripcion: " + descripcion + ", Departamento: " + departamento + ", Stock: " + stock);
    }
}
