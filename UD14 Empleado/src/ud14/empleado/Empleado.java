package ud14.empleado;

import java.sql.*;
import java.sql.Date;
/**
 *
 * @author oscar.domalo
 */
public class Empleado {

    int id, salario, comision, dir, departamento;
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
        this.dir = dir;
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
                + "VALUES (                 ?,       ?,     ?,    ?,     ?,       ?,       ?,     ?)";

        try {
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, id);
            sentencia.setString(2, apellido);
            sentencia.setString(3, oficio);
            sentencia.setInt(4, dir);
            sentencia.setDate(5, new java.sql.Date(fecha_alta.getTime()));
            sentencia.setInt(6, salario);
            sentencia.setInt(7, comision);
            sentencia.setInt(8, departamento);
            sentencia.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al insertar");
            ex.printStackTrace();
        }
    }
    //Metodo estatico.
    static public Empleado read(int id) {
        Empleado empleado = null;
        String sql = "SELECT * FROM EMPLE WHERE EMP_NO = ?";
        try {
            Connection con = conexion();
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, id);
            ResultSet rs = sentencia.executeQuery();
            if (rs.next()) {
                
                String apellido = rs.getString(2); 
                String oficio = rs.getString(3);
                int dir = rs.getInt(4);
                Date fecha_alta = rs.getDate(5);
                int salario = rs.getInt(6);
                int comision = rs.getInt(7);
                int departamento = rs.getInt(8);
                empleado = new Empleado(id,salario,comision,departamento,apellido,oficio,fecha_alta, dir);
                
            }
        }catch (SQLException ex){
            System.out.println("Error al insertar el alumno");
            ex.printStackTrace();
        }
        return empleado;
    }
    
    //Metodo no estatico.
    public void read(){
        String sql = "SELECT * FROM EMPLE WHERE EMP_NO = ?";
        try{
            Connection con = conexion();
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1,id);
            ResultSet rs = sentencia.executeQuery();
            if (rs.next()) {
                this.apellido = rs.getString(2);
                this.oficio = rs.getString(3);
                this.dir = rs.getInt(4);
                this.fecha_alta= rs.getDate(5);
                this.salario = rs.getInt(6);
                this.comision= rs.getInt(7);
                this.departamento = rs.getInt(8);
            }
        }catch (SQLException ex){
            System.out.println("Error al consultar un alumno");
            ex.printStackTrace();
        }
    }
    public void update(){
        String sql = "UPDATE EMPLE SET APELLIDO=?, OFICIO=?, DIR=?, FECHA_ALT=?, SALARIO=?, COMISION=?, DEPT_NO=? WHERE EMP_NO=?";
        
        try{
            Connection con = conexion();
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1,this.id);
            sentencia.setString(2,this.apellido);
            sentencia.setString(3, this.oficio);
            sentencia.setInt(4,this.dir);
            sentencia.setDate(5,this.fecha_alta);
            sentencia.setInt(6,this.salario);
            sentencia.setInt(7,this.comision);
            sentencia.setInt(8,this.departamento);
            sentencia.executeUpdate();
            con.close();
        }catch (SQLException ex){
            System.out.println("Error al actualizar el alumno");
            ex.printStackTrace();
        }
    }
    
    public void delete(){
        String sql = "DELETE FROM EMPLE WHERE EMP_NO = ?";
        try{
            Connection con = conexion();
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1,id);
            sentencia.executeUpdate();
        }catch (SQLException ex){
            System.out.println("Error al eliminar un alumno");
            ex.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", salario=" + salario + ", comision=" + comision + ", dir=" + dir + ", departamento=" + departamento + ", apellido=" + apellido + ", oficio=" + oficio + ", fecha_alta=" + fecha_alta + '}';
    }
    
   
}
