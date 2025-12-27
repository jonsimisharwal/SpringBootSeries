package FunctionalInterface.inbuilt;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class RealExamples {
    public static void main(String args[]){
        // <tittle> cost $price
        BiFunction<String,Double,String> Dataformat = (title,price) -> title +"cost $"+ price ;
        System.out.println(Dataformat.apply("java basics",599.78));

        // isExpensive
        Predicate<Double> isExpensive = price -> price>500;
        System.out.println(isExpensive.test(90.00));
    }
}
