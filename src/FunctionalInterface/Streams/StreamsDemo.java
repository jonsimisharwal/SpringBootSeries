package FunctionalInterface.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String args[]){
        //Streams --> Assembly line / pipeline
        List<String> items = Arrays.asList("Apple","Banana","orange");
        for(String fruit :items){
            System.out.println(fruit);
        }

        //using streams
        Stream<String> stream = items.stream();
        stream.forEach(System.out::println);

        Stream<String> filteredStream=stream.filter(name -> name.startsWith("B"));
        filteredStream.forEach(System.out::println);

        //concise way
        items.stream().filter(name -> name.startsWith("B"))
                .forEach(System.out::println);
        //Use cases
        /*
        1 filtering
        2 mapping
        3 aggregation
        4 searching
        5 iteration
         */
    }
}
