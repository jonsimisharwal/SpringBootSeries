package Collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
class Carnew{
    String brand;
    Carnew(String brand){
        this.brand=brand;
    }
}
public class GenericsDemo {
    public static void main(String args[]) {
        List<String> users = new ArrayList<>();
        users.add("Alice");
        users.add("Bob");
        users.add("jont");
        System.out.println("print all users");
        for (String user:users){
            System.out.println(user);
        }
        System.out.println(users.get(1));

        Carnew c1=new Carnew("tesla");
        Carnew c2=new Carnew("toyota");

        List<Carnew> lst=new ArrayList<>();
        lst.add(c1);
        lst.add(c2);
        for (Carnew car: lst){
            System.out.println(car.brand);
        }
         //iterator
        Iterator<String> it= users.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

