package FunctionalInterface.Streams;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DifferentSourcesDemo {
    //from which type of sources a stream can made
    /*
       from Collections: e.g. , collection.stream()
       from Arrays e.g., Arrays.stream(array)
       from Specific Values: e.g., Stream.of("a","b","c")
       from functions: e.g. , Stream.iterate(0,n->n+2)
       from files: e.g., Files.lines(path)
       Empty Stream : e.g., Stream.empty()
     */
    public static void main(String args[]){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Stream<Integer> integerStream = numbers.stream();
        System.out.println(integerStream);
        integerStream.forEach(System.out::println);

        int numberArray[]={1,2,3,4,5};
        IntStream arrayStream= Arrays.stream(numberArray);
        arrayStream.forEach(System.out::println);

        Stream<String> stringStream = Stream.of("a","b","c");
        Stream<Integer> integerStream1 = Stream.iterate(0,n->n+2);
        integerStream1.forEach(System.out::println);
      try {
          Stream<String> fileStream = Files.lines(Path.of("PATH"));
      }catch(IOException e){
          throw new RuntimeException(e);
      }

      Stream<String> emptyStream =Stream.empty();



    }
}
