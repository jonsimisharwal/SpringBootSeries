package OOPS.Polymorphism;


public class car extends vehicle {
    private int doors;
    public car(String brand,int speed,int doors){
        super(brand,speed);
        this.doors=doors;

    }
    @Override
    void start(){
        System.out.println("car starting...");
    }

}
