package ud15.coche;

import java.util.Scanner;
import javax.persistence.*;

/**
 *
 * @author oscar.domalo
 */
public class UD15CocheTeclado {

    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UD15_CochePU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Scanner sc = new Scanner(System.in);
        
        tx.begin();
        System.out.println("Introduce los datos del coche:");

        System.out.print("Matrícula: ");
        String matricula = sc.nextLine();

        System.out.print("Marca: ");
        String marca = sc.nextLine();

        System.out.print("Modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Número de plazas: ");
        int numPlazas = sc.nextInt();

        Coche coche = new Coche(matricula, marca, modelo, numPlazas);

        em.persist(coche);
        tx.commit();

        System.out.println("Coche insertado correctamente:");
        System.out.println(coche);

        em.close();
        emf.close();
        
    }
}