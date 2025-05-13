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
public class UD15Coche1_FIND {

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

        

        f1 = em.find(Propietario.class,"001W");
        System.out.println(f1);
 tx = em.getTransaction();
        tx.begin();
        
        
        
        
        tx.commit();
        em.close();
        emf.close();
    }

}
