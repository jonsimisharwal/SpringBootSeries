package OOPS.Polymorphism;

public class Polymorphismdemo {
    public static void main(String args[]){
        bike b1= new bike("toyoto",40,false);
        b1.displayInfo();

        car c1= new car("fortunier",200,4);
        c1.start();
        vehicle v1= new vehicle("tvs",200);
        v1.start();
        // a parent object can call child class
        //Method overriding (runtime polymorphism)
        vehicle v2=new car("tesla",180,5);
        v2.start();
        v2.start("good morning");

    }
}
