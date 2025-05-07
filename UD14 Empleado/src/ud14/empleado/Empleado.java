package ud14.empleado;

import java.sql.*;

/**
 *
 * @author oscar.domalo
 */
public class Empleado {

    int id, salario, comision,dir, departamento;
    String apellido, oficio;
    Date fecha_alta;

    public Empleado(int id) {
        this.id = id;

    }

    public Empleado(int id, int salario, int comision, int departamento, String apellido, String oficio, Date fecha_alta, int dir) {
        this.id = id;
        this.salario = salario;
        this.comision = comision;
        this.departamento = departamento;
        this.apellido = apellido;
        this.oficio = oficio;
        this.fecha_alta = fecha_alta;
        this.dir   = dir;
    }

    static private Connection conexion() {

        Connection con = null;
        String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB_T";
        try {
            con = DriverManager.getConnection(url, "alumno", "al25a");
        } catch (SQLException ex) {
            System.out.println("Error al conectar al SGBD");
        }
        return con;
    }

    public void create() {
        Connection con = conexion();
        String sql = " INSERT INTO EMPLE (EMP_NO,APELLIDO,OFICIO,DIR,FECHA_ALT,SALARIO,COMISION,DEPT_NO) "
                + "VALUES (                 ?,       ?,     ?,    ?,     ?,       ?,            ?)";

        try {
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, id);
            sentencia.setString(2, apellido);
            sentencia.setString(3, oficio);
            sentencia.setInt(4,dir);
            sentencia.setDate(5, fecha_alta);
            sentencia.setInt(6,salario);
            sentencia.setInt(7,comision);
            sentencia.setInt(7, departamento);
            sentencia.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al insertar");
        }
    }
    
    static public Empleado read(int id){
        Empleado empleado = null;
        
    }

}
