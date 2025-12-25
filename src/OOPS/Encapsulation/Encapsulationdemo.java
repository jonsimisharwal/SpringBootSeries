package OOPS.Encapsulation;
 class car {
    private String brand;
    private String color;
   private int speed;
    public void drive(){
        System.out.println(brand  +" is driving at "+ speed);
    }
     public car(String brand,String color,int speed){
         System.out.println("constructor is called");
         this.brand=brand;
         this.color=color;
         this.speed=speed;
         setSpeed(speed);
     }

     public int getSpeed(){
        return this.speed;
     }
     public void setSpeed(int speed){
        if(speed<0){
            speed=0;
        }
        this.speed=speed;
     }

}

public class Encapsulationdemo {
}
