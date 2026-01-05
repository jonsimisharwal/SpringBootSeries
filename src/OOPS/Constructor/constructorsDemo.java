package OOPS.Constructor;

public class constructorsDemo {
 public static void main(String args[]){
     car c1=new car("toyota","yellow",70);
    // c1.speed=180;
   //  c1.brand="toyoto";
   //  c1.color="red";
     c1.drive();

     car c2=new car("tesla","red",90);
     c2.drive();
 }
}
