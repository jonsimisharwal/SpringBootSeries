package FunctionalInterface;

import java.util.function.Function;

public class functioninterfacedemo {
    //one input give result
    public static Function<Integer, Integer> addFunction = (a) -> a + 3 ;
    public static void main(String args[]){
        System.out.println(addFunction.apply(11));

    }
}
