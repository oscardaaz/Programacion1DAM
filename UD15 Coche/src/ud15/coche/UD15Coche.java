/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud15.coche;

import javax.persistence.*;

/**
 *
 * @author oscar.domalo
 */
public class UD15Coche {

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
        
        
        Coche c1 = new Coche("1244CCC","Ford","Mondeo",5);
        //em.persist(c1);
        c1.numPlazas =3;
        
        tx.commit();
        em.close();
        emf.close();
    }
 
    
    
    
    
}
