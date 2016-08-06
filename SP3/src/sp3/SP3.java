/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Thomas Skogemann
 */
public class SP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SP3PU");
        
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        
        c1.discountType.add(new DiscountQuantity());
        c2.discountType.add(new DiscountFixed());
        em.persist(c1);
        em.persist(c2);
        em.getTransaction().commit();
        System.out.println("Hello world");
    }
    
}
