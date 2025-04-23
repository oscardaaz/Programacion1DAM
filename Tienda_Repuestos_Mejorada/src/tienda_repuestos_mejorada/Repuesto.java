package tienda_repuestos_mejorada;

import java.io.Serializable;

public class Repuesto implements Serializable, Comparable<Repuesto> {

    private int codigo; // Código único del repuesto
    private String descripcion; // Descripción del repuesto
    private String departamento; // Departamento al que pertenece
    private int stock; // Cantidad en stock

    // Constructor que inicializa todos los atributos del repuesto
    public Repuesto(int codigo, String descripcion, String departamento, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.departamento = departamento;
        this.stock = stock;
    }

    // Métodos getter y setter para cada atributo
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Método para mostrar los datos del repuesto
    public void mostrar() {
        System.out.println("Codigo: " + codigo + ", Descripcion: " + descripcion + ", Departamento: " + departamento + ", Stock: " + stock);
    }

    @Override
    public int compareTo(Repuesto otro) {
        return Integer.compare(this.codigo, otro.codigo);
    }
}
