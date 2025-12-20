package FunctionalInterface.Streams.TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Nodes.collect;

public class TerminalOperationsDemo {
    public static void main(String args[]){
        //reduce()
        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
        Stream<Integer> integerStream=numbers.stream();
        //int sum=integerStream.reduce(0,(acc,num)-> acc+num);
        int sum=integerStream.reduce(0,Integer::sum);
        System.out.println("sum"+sum);


        int total=numbers.stream()
                .reduce(0,Integer::sum);
        System.out.println("Total: "+total);

        //collect()
        List<Integer> evenNumber=numbers.stream()
                .filter(n->n%2 ==0)
            .collect(Collectors.toList());
        System.out.println("Even numbers:"+ evenNumber);

        Set<Integer> evenNumberSet=numbers.stream()
                .filter(n->n%2 ==0)
                .collect(Collectors.toSet());
        System.out.println("Even numbers:"+ evenNumberSet);

        //find & match
        System.out.println( numbers.stream().findFirst().get());
        System.out.println( numbers.stream().findAny().get());
       //anyMatch noneMatch allMatch
        boolean hasfoutry=numbers.stream()
                .anyMatch(n-> n==40);
        System.out.println("has fourty"+ hasfoutry);
        //iteration

        numbers.stream()
                .forEach(System.out::println);

    }
}
