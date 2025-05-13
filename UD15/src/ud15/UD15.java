/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud15;

import java.util.List;
import java.util.Scanner;
import javax.persistence.*;

/**
 *
 * @author miguel.cormur
 */
public class UD15 {

    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner sc = new Scanner(System.in);
        String matricula = "";
        boolean borrado = false;*/
        String jpql;
        Query query;
        List<Coche> coches;
        List<PropietarioCoche> propietarios;
        EntityManagerFactory emf;
        EntityManager em;
        
        
        
        EntityTransaction tx;
        //Coche c1,c2,c3,c4;
        
        emf = Persistence.createEntityManagerFactory("UD15PU");
        em = emf.createEntityManager();
        jpql = "SELECT p FROM PropietarioCoche p";
        //jpql = "SELECT c FROM Coche c";
        query = em.createQuery(jpql);
        propietarios = query.getResultList();
        for (PropietarioCoche pc : propietarios) {
            System.out.println(pc);
        }
        /*coches = query.getResultList();
        System.out.println(" ");
        for (Coche c : coches) {
            System.out.println(c);
        }*/
        //tx = em.getTransaction();
        /*System.out.print("Introduzca el codigo del coche a modificar: ");
        matricula = sc.next();*/
        /*c1 = em.find(Coche.class, matricula);*/
        //tx.begin();
        /*if(c1 !=null){    
            System.out.print("Introduzca nueva marca: ");
            c1.marca = sc.next();
            System.out.print("Introduzca nueva modelo: ");
            c1.modelo = sc.next();
            System.out.print("Introduzca nueva numero de plazas: ");
            c1.numPlazas = sc.nextInt();*/
            /*em.remove(c1);
            borrado = true;
        } else {
            System.out.println("La matricula no se encuentra en la base de datos");
        }*/
       /* PropietarioCoche pc1 = new PropietarioCoche("0004a" , "Patri");
        PropietarioCoche pc2 = new PropietarioCoche("0005z" , "Raul");
        PropietarioCoche pc3 = new PropietarioCoche("0003f" , "Belén");
        em.persist(pc1);
        em.persist(pc2);
        em.persist(pc3);*/
        //Coche c1 = new Coche("1244CCC", "Ford", "Fiesta", 5);
        /*c2 = new Coche("1242CCC", "Ford", "Fiesta", 4);
        c3 = new Coche("4242CGT", "Audi", "A3", 4);
        c4 = new Coche("1242CCR", "Audi", "TT", 4);
        //em.persist(c1);
        em.persist(c2);
        em.persist(c3);
        em.persist(c4);*/
        /*c1 = em.find(Coche.class, "4242CGT");
        System.out.println(c1);
        c2 = em.find(Coche.class, "1242CCR");
        System.out.println(c2);
        c3 = em.find(Coche.class, "1444CCC");
        System.out.println(c3);*/
        //tx.commit();
       /* if(borrado){
            System.out.println("El coche con matricula " + matricula + " se ha borrado correctamente");
        }*/
        /*System.out.println("Los nuevos datos del cohe son: ");
        System.out.println(c1);*/
        em.close();
        emf.close();
    }

}
