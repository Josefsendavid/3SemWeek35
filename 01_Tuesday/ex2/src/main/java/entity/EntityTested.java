/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import static entity.Customer_.created;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author David
 */
public class EntityTested {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
       /* Customer customer1 = new Customer("John", "Hansen", (Date) created);
        Customer customer2 = new Customer("Morten", "Messer", (Date) created);
        Customer customer3 = new Customer("Anders", "Lund", (Date) created);*/
        try {
                em.getTransaction().begin();
                em.persist(customer1);
                em.persist(customer2);
                em.persist(customer3);
                em.getTransaction().commit();
                //Verify that books are managed and has been given a database id
                System.out.println(customer1.getId());
                System.out.println(customer2.getId());
                System.out.println(customer3.getId());
                
        }finally{
            em.close();
        }
    }
}
