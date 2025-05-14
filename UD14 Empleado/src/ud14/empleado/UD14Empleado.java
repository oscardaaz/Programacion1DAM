package ud14.empleado;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author oscar.domalo
 */
public class UD14Empleado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Crear un nuevo empleado
        
        /*Empleado nuevoEmpleado = new Empleado(
                1010,                       // id
                3000,                       // salario
                500,                        // comision
                10,                         // departamento
                "GARCIA",                   // apellido
                "PROG",              // oficio
                Date.valueOf("2024-05-14"), // fecha_alta
                7839                        // dir (ID del jefe, si aplica)
        );
        nuevoEmpleado.create();
        System.out.println("Empleado creado: " + nuevoEmpleado);*/
        
        // Leer un empleado por ID (método estático)
        
        //Empleado empleadoLeido = Empleado.read(1001);

        //Metodo no estatico
        /*Empleado empleado = new Empleado(1001); // solo el id
        empleado.read(); // llena los datos desde la BD
        System.out.println(empleado);*/

        /*if (empleadoLeido != null) {
            System.out.println("Empleado leído desde la BD: " + empleadoLeido);
        } else {
            System.out.println("Empleado no encontrado.");
        }*/

 /* // Actualizar el empleado
        if (empleadoLeido != null) {
            empleadoLeido.setSalario(3500);
            empleadoLeido.setComision(700);
            empleadoLeido.setApellido("PEREZ");
            empleadoLeido.update(); // (IMPORTANTE: debes corregir el método update)
            System.out.println("Empleado actualizado: " + empleadoLeido);
        }*/
        // Eliminar el empleado
        /*Empleado empleadoLeido = new Empleado(1002);
        if (empleadoLeido != null) {
            empleadoLeido.delete();
            System.out.println("Empleado eliminado.");
        }*/
        //sc.close();
        Empleado empleado = new Empleado(1001);
        empleado.read();
        System.out.println(empleado);
        
        System.out.println(Empleado.read(1001));
        
        
        /*Empleado empleado = new Empleado(1001);
        empleado.delete(1001);*/
        
        //Empleado.delete(1001);
        
        
        // Llamada a las funciones de prueba
    
       /* mainCreate(1003, "LOPEZ", "ANALISTA", 2500, 300, 7839, 20, Date.valueOf("2024-05-14"));
        mainReadEstatico(1003);
        mainReadDinamico(1003);
        mainUpdate(1003, "LOPEZ ACTUALIZADO", 2800, 500);
        mainDelete(1003);
    }

    // Función para crear un nuevo empleado
    public static void mainCreate(int id, String apellido, String oficio, int salario, int comision, int dir, int dept, Date fecha) {
        Empleado nuevo = new Empleado(id, salario, comision, dept, apellido, oficio, fecha, dir);
        nuevo.create();
        System.out.println("Empleado creado: " + nuevo);
    }

    // Función para leer un empleado (estático)
    public static void mainReadEstatico(int id) {
        Empleado emp = Empleado.read(id);
        if (emp != null) {
            System.out.println("Empleado leído (estático): " + emp);
        } else {
            System.out.println("No se encontró el empleado con ID: " + id);
        }
    }

    // Función para leer un empleado (no estático)
    public static void mainReadDinamico(int id) {
        Empleado emp = new Empleado(id);
        emp.read();
        System.out.println("Empleado leído (instancia): " + emp);
    }

    // Función para actualizar un empleado
    public static void mainUpdate(int id, String apellidoNuevo, int salarioNuevo, int comisionNueva) {
        Empleado emp = new Empleado(id);
        emp.read(); // Cargar los datos del empleado desde la base de datos
        emp.setApellido(apellidoNuevo);
        emp.setSalario(salarioNuevo);
        emp.setComision(comisionNueva);
        emp.update();
        System.out.println("Empleado actualizado: " + emp);
    }

    // Función para eliminar un empleado
    public static void mainDelete(int id) {
        Empleado emp = new Empleado(id);
        emp.delete();
        System.out.println("Empleado eliminado con ID: " + id);
    }*/
}
}