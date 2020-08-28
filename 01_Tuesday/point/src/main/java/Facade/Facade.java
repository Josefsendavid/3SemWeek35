/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import entity.Point;
import static entity.Point_.x;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author David
 */
public class Facade {
      private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
      
      public Facade(){}
    
      public Point create(Point p){
          EntityManager em = emf.createEntityManager();
          em.getTransaction().begin();
          em.persist(p);
          em.getTransaction().commit();
          em.close();
          return p;
      }
      
      public Point get(Long id){
          EntityManager em = emf.createEntityManager();
          return em.find(Point.class, id);
      }
      
      
    public List<Point> getAll() {
        EntityManager em = emf.createEntityManager();
        try{
        TypedQuery<Point>query
                    = em.createQuery("Select point from Point Point", Point.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    /**
     *
     * @param id
     * @return
     */
    public Point findBook(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            Point point = em.find(Point.class, id);
            return point;
        } finally {
            em.close();
        }
    }
}
