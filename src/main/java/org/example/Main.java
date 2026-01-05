package org.example;

<<<<<<< HEAD
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
=======
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println(String.format("Hello and welcome!"));

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            IO.println("i = " + i);
        }
    }
}
>>>>>>> 634919327d39d633b5821aec87aec2259a91de9d
