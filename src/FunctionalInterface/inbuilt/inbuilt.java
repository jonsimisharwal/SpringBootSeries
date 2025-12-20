package FunctionalInterface.inbuilt;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class inbuilt {
    public static class BiFunctionDemo {
        // 2 inputs one return type -bi function
        public static BiFunction<Integer,Integer ,Integer> addFunction= Integer::sum ;
        public static void main(String args[]){
           System.out.println(addFunction.apply(10,20));
        }
    }

    public static class MethodRefrencesDemo {
        public static void main(String args[]){
            //1 using for loop
            List<String> names = Arrays.asList("Alice","Charlie","Bob");
            for(int i=0;i< names.size();i++){
                System.out.println(names.get(i));
            }

            for(String name:names){
                System.out.println(name);
            }
            names.forEach(new Consumer<String>() {
                @Override
                public void accept(String name) {
                    System.out.println(name);
                }
            });
            names.forEach((String name) -> {
                System.out.println(name);

            } );
            names.forEach(( name) -> {
                System.out.println(name);

            } );

            names.forEach(System.out::println);

        }
    }

    public static class PredicateDemo {
        public static void main(String args[]){
            //boolean value fn of one argument - predicate
            Predicate<Integer> isEven = n-> n%2 ==0;
            System.out.println(isEven.test(10));
              //boolean valued fn of two arguments
            BiPredicate<Integer,Integer> isSumeven = (a, b) -> (a+b)%2 ==0;
            System.out.println(isSumeven.test(10,20));
        }
    }
}
