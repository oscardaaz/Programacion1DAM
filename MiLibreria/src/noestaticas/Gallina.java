package noestaticas;

/**
 *
 * @author oscar.domalo
 */
public class Gallina {

    String codigo;
    int edad;
    int huevosPuestos;

    public Gallina(String codigo, int edad){
        this.codigo = codigo;
        this.edad = edad;
    }
    
    public void poneHuevo(){
        huevosPuestos++;
    }
    public void poneHuevo(int numero){
        huevosPuestos += numero;
    }
    public void datosGallina(){
        System.out.println("Nombre: " + codigo + " ,edad: " + edad + ", huevos puestos: " + huevosPuestos);
    }
}
