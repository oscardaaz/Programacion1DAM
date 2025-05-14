package ud14.empleado;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author oscar.domalo
 */
public class UD14EmpleadoDelete {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Crear un nuevo empleado
        /*Empleado nuevoEmpleado = new Empleado(
                1005,                       // id
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
            empleadoLeido.update();
            System.out.println("Empleado actualizado: " + empleadoLeido);
        }*/
 
 
        // Eliminar el empleado       
        Empleado empleado = new Empleado(1005);
        
            empleado.delete();
            
        
        //sc.close();
        
        
    }
}