/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud14.empleado;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oscar.domalo
 */
public class EmpleadoDAO {

    // Método para obtener una conexión a la base de datos
    private static Connection conexion() {

        Connection con = null;
        String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB_T";
        try {
            con = DriverManager.getConnection(url, "alumno", "al25a");
        } catch (SQLException ex) {
            System.out.println("Error al conectar al SGBD");
        }
        return con;
    }

    // Método para crear un nuevo empleado
    public static void create(Empleado empleado) {
        String sql = "INSERT INTO EMPLE (EMP_NO, APELLIDO, OFICIO, DIR, FECHA_ALT, SALARIO, COMISION, DEPT_NO) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try  {
            Connection con = conexion(); 
                
            PreparedStatement statement = con.prepareStatement(sql);
                statement.setInt(1, empleado.getId());
                statement.setString(2, empleado.getApellido());
                statement.setString(3, empleado.getOficio());
                statement.setInt(4, empleado.getDir());
                statement.setDate(5, new java.sql.Date(empleado.getFecha_alta().getTime()));
                statement.setInt(6, empleado.getSalario());
                statement.setInt(7, empleado.getComision());
                statement.setInt(8, empleado.getDepartamento());

                statement.executeUpdate();
                System.out.println("Eliminado con exito");
        } catch (SQLException ex) {
            System.out.println("Error al insertar el empleado");
            ex.printStackTrace();
        }
    }

    // Método para leer un empleado por ID
    public static Empleado read(int id) {
        String sql = "SELECT * FROM EMPLE WHERE EMP_NO = ?";
        Empleado empleado = null;

        try (Connection con = conexion(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String apellido = rs.getString("APELLIDO");
                String oficio = rs.getString("OFICIO");
                int dir = rs.getInt("DIR");
                Date fecha_alta = rs.getDate("FECHA_ALT");
                int salario = rs.getInt("SALARIO");
                int comision = rs.getInt("COMISION");
                int departamento = rs.getInt("DEPT_NO");

                empleado = new Empleado(id, salario, comision, departamento, apellido, oficio, fecha_alta, dir);
            }
        } catch (SQLException ex) {
            System.out.println("Error al leer el empleado");
            ex.printStackTrace();
        }

        return empleado;
    }

    // Método para actualizar los datos de un empleado
    public static void update(Empleado empleado) {
        String sql = "UPDATE EMPLE SET APELLIDO = ?, OFICIO = ?, DIR = ?, FECHA_ALT = ?, SALARIO = ?, COMISION = ?, DEPT_NO = ? "
                + "WHERE EMP_NO = ?";

        try (Connection con = conexion(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, empleado.getApellido());
            stmt.setString(2, empleado.getOficio());
            stmt.setInt(3, empleado.getDir());
            stmt.setDate(4, new java.sql.Date(empleado.getFecha_alta().getTime()));
            stmt.setInt(5, empleado.getSalario());
            stmt.setInt(6, empleado.getComision());
            stmt.setInt(7, empleado.getDepartamento());
            stmt.setInt(8, empleado.getId());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al actualizar el empleado");
            ex.printStackTrace();
        }
    }

    // Método para eliminar un empleado por ID
    public static void delete(int id) {
        String sql = "DELETE FROM EMPLE WHERE EMP_NO = ?";

        try (Connection con = conexion(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar el empleado");
            ex.printStackTrace();
        }
    }

    // Método para obtener todos los empleados
    public static List<Empleado> getAll() {
        List<Empleado> empleados = new ArrayList<>();
        String sql = "SELECT * FROM EMPLE";

        try (Connection con = conexion(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("EMP_NO");
                String apellido = rs.getString("APELLIDO");
                String oficio = rs.getString("OFICIO");
                int dir = rs.getInt("DIR");
                Date fecha_alta = rs.getDate("FECHA_ALT");
                int salario = rs.getInt("SALARIO");
                int comision = rs.getInt("COMISION");
                int departamento = rs.getInt("DEPT_NO");

                Empleado empleado = new Empleado(id, salario, comision, departamento, apellido, oficio, fecha_alta, dir);
                empleados.add(empleado);
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener todos los empleados");
            ex.printStackTrace();
        }

        return empleados;
    }
}


