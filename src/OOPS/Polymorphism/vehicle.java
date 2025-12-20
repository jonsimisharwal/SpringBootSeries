package OOPS.Polymorphism;

public class vehicle {
    public  String brand;
    public int speed;

    public vehicle(String brand,int speed){
        this.brand = brand;
        this.speed = speed;
    }

    public void setSpeed(int speed){
        if(speed<0){
            speed=0;
        }
        this.speed=speed;
    }
    public int getSpeed(){
        return this.speed;
    }
    public void displayInfo(){
        System.out.println("Brand: "+ brand +"Speed: "+ speed +" ");
    }

    void start(){

        System.out.println("vehicle starting...");
    }

    void start(String greet){
        System.out.println("hello," + greet);
    }
}
