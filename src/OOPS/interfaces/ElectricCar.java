package OOPS.interfaces;

public class ElectricCar implements CarControls {

    @Override
    public void turnLeft(){
         System.out.println("Electric Left");
    }

    @Override
    public void turnRight(){

        System.out.println("Electric right");
    }
    @Override
    public void  applyBrakes(){
        System.out.println("apply brakes");
    }
}
