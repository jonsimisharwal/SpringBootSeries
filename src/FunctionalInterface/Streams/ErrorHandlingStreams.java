package FunctionalInterface.Streams;

import java.util.List;

public class ErrorHandlingStreams {
    public static void main(String args[]){
        List<String> books = List.of("java", "Python", "c");
        books.stream()
                .forEach(b ->{
        try {
            if(b.equals("Python")){
                throw new RuntimeException("INVALID BOOK");
            }
            System.out.println(b);
        }catch(Exception e){
            e.printStackTrace();

        }
                });

    }
}
