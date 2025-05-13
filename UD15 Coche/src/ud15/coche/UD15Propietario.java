/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud15.coche;

import java.util.Scanner;
import javax.persistence.*;

/**
 *
 * @author oscar.domalo
 */
public class UD15Propietario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf;
        EntityManager em;
        EntityTransaction tx;

        emf = Persistence.createEntityManagerFactory("UD15_CochePU");
        em = emf.createEntityManager();
        tx = em.getTransaction();

        tx.begin();

        Propietario p1 = new Propietario("001W", "Jorge", "002","madrid",1231);
        em.persist(p1);
        Propietario p2 = new Propietario("991C", "Marcos","002","madrid",1231);
        em.persist(p2);
        Propietario p3 = new Propietario("987P", "Oscar","002","madrid",1231);
        em.persist(p3);
        Propietario p4 = new Propietario("476B", "Patri","002","madrid",1231);
        em.persist(p4);

        
        
        tx.commit();

        em.close();
        emf.close();
    }

}
