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
public class UD15Coche1_Borrar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf;
        EntityManager em;
        EntityTransaction tx;
        Coche f1;
        
        emf = Persistence.createEntityManagerFactory("UD15_CochePU");
        em = emf.createEntityManager();
        tx = em.getTransaction();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca matricula a modificar");
        String matricula = sc.next();
        f1 = em.find(Coche.class, matricula);
        
        tx.begin();
        if (f1 != null) {

            em.remove(f1);

        } else {
            System.out.println("No existe esa matricula en la BBDD.");
        }
        tx.commit();

        System.out.println("Borrado completado!");
        
        //tx.begin();
        //tx.rollback();
        //tx.commit();
        em.close();
        emf.close();
    }

}
