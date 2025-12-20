package FunctionalInterface.inbuilt;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String args[]){
        //accepts a single input and returns no result
        Consumer<String> consumer1= (str) -> System.out.println(str);
        Consumer<String> consumer2= System.out::println;
        consumer2.accept("hii");
        consumer1.accept("hello");

        List<Integer> numbers = Arrays.asList(1,2,3,4,6);
        Consumer<Integer> multipleByTwo = n -> System.out.println(n*2);
        numbers.forEach(multipleByTwo);

    }
}
