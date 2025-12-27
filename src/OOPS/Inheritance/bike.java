package OOPS.Inheritance;

public class bike extends vehicle{
   private  boolean hasCarrier;
   public bike(String brand,int speed,boolean hasCarrier){
       super(brand , speed);
       this.hasCarrier=hasCarrier;
   }
   @Override
   public void displayInfo(){
       super.displayInfo();
       System.out.println("speed:" + getSpeed() +"has carrier:"+ hasCarrier);
   }
}
