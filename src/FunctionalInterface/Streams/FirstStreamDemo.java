package FunctionalInterface.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstStreamDemo {
    public static void main(String args[]){
        List<Integer> numbers= Arrays.asList(1,2,4,5,6,8,6,7);

        //list:Even number from "numbers"list
       List<Integer> evenList= numbers.stream().filter((n)->n%2==0).collect(Collectors.toList());
       for(int list:evenList){
           System.out.println(list);
       }

    }
}
