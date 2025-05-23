/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud15.coche;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
        Coche f1;
        
        emf = Persistence.createEntityManagerFactory("UD15_CochePU");
        em = emf.createEntityManager();
        tx = em.getTransaction();
        tx.begin();
        Scanner sc = new Scanner(System.in);

        /*System.out.println("Introduzca matricula a modificar");
        String matricula = sc.next();
        f1 = em.find(Coche.class, matricula);
        
        //tx.begin();
        if (f1 != null) {

            System.out.println("Introduce nueva marca: ");
            f1.marca = sc.next();
            System.out.println("Introduce nuevo modelo:");
            f1.modelo = sc.next();
            System.out.println("Introduce nuevo numero de plazas:");
            f1.numPlazas = sc.nextInt();

        } else {
            System.out.println("No existe esa matricula en la BBDD.");
        }
        //tx.commit();

        System.out.println("Los nuevos datos del coche son:");
        System.out.println(f1);*/

        
        /*f1 = em.find(Coche.class,"1221CCC");
        System.out.println("");
        System.out.println(f1);*/
        
        
        List<Coche> coches = new ArrayList<>();
        
        Coche c1 = new Coche("1334CCC","Ford","Mondeo",5);
        Coche c2 = new Coche("4040CGT","Ford","Fiesta",4);
        Coche c3 = new Coche("7060UGT","Audi","A3",4);
        Coche c4 = new Coche("1221CCC","Audi","TT",4);
        
        // Solo para los mensajes de confirmacion tampoco es necesario.
        coches.add(c1);
        coches.add(c2);
        coches.add(c3);
        coches.add(c4);

        em.persist(c1);
        em.persist(c2);
        em.persist(c3);
        em.persist(c4);
        //c1.numPlazas =3;
       
        //Para generar mensaje de confirmacion de todos los insertados sin necesidad 
        //de ir uno por uno (Simplemente por curiosidad no es necesario)  
       
        for (Coche c : coches) {
        if (em.contains(c)) {
        System.out.println("El coche con matrícula " + c.matricula + " ha sido insertado correctamente.");
        } else {
        System.out.println("Error al insertar el coche con matrícula " + c.matricula);
        }
    }
         
        tx.commit();
        em.close();
        emf.close();
    }
}
