package OOPS.Constructor;

public class car {

    String brand;
    String color;
    int speed;
    //this refers to  current instance/object
    //java provide default constructor to every class
    //uding record create class amd call it as object
     public car(String brand,String color,int speed){
         System.out.println("constructor is called");
         this.brand=brand;
         this.color=color;
         this.speed=speed;
     }
    public void drive() {
        System.out.println(brand + " is driving at " + speed);

    }
}