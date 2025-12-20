package OOPS.interfaces;

public class Interfacedemo {
    public static void main(String args[]){
        ElectricCar e1=new ElectricCar();
        e1.applyBrakes();
        e1.turnLeft();

        CarControls myCar = new ElectricCar();
        myCar.turnLeft();
    }
}
