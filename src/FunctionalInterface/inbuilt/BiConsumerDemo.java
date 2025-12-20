package FunctionalInterface.inbuilt;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String args[]){
        //accept two inputs and return no result
        BiConsumer<Integer,Integer> addConsumer = (a,b) -> System.out.println("Addition:" + a +b );
        addConsumer.accept(10,30);
    }
}
