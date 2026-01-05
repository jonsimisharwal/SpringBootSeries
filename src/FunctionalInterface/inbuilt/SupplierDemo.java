package FunctionalInterface.inbuilt;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String args[]){
        //value supplier h
        Supplier<Double> randomNum =() ->Math.random();
        Supplier<Double> randomnum =Math::random;
        System.out.println(randomNum.get());
    }
}
