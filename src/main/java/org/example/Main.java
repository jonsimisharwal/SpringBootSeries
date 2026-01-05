package org.example;

import com.mysql.cj.Session;
import jakarta.persistence.EntityManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String args[]){
        EntityManager em=JPAUtil.getEntityManager();
        try{
            em.getTransaction().begin();
            UserClassHibernate user=new UserClassHibernate("Alice");

            em.persist(user);
            em.getTransaction().commit();
            System.out.println("User Saved:" + user.getId());
        } catch(Exception e){
            if (em.getTransaction().isActive())
                em.getTransaction().rollback();

            e.printStackTrace();
        }finally{
            em.close();
            JPAUtil.close();
        }
    }
}