package Collection;
import java.util.List;
import java.util.ArrayList;
class Car{
    String brand;
    Car(String brand){
        this.brand=brand;
    }
}
public class ListDemo {
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

        Car c1=new Car("tesla");
        Car c2=new Car("toyota");

        List<Car> lst=new ArrayList<>();
        lst.add(c1);
        lst.add(c2);
        for (Car car: lst){
            System.out.println(car.brand);
        }

    }
}
