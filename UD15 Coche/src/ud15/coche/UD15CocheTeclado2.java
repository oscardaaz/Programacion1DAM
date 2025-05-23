package ud15.coche;

import java.util.Scanner;
import javax.persistence.*;

/**
 *
 * @author oscar.domalo
 */
public class UD15CocheTeclado2 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UD15_CochePU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Scanner sc = new Scanner(System.in);
        tx.begin();

        int opcion;

        do {
            System.out.println("\nIntroduce los datos del coche:");

            System.out.print("Matricula: ");
            String matricula = sc.next();

            System.out.print("Marca: ");
            String marca = sc.next();

            System.out.print("Modelo: ");
            String modelo = sc.next();

            System.out.print("Numero de plazas: ");
            int numPlazas = sc.nextInt();

            Coche coche = new Coche(matricula, marca, modelo, numPlazas);

            em.persist(coche);

            System.out.println("Coche insertado correctamente:\n");
            System.out.println(coche);

            System.out.println("Desea insertar otro coche? (1 = Si, 0 = No): \n");
            opcion = sc.nextInt();

        } while (opcion == 1);
        tx.commit();
        em.close();
        emf.close();
    }
}
