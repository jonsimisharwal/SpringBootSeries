package FunctionalInterface.Streams.TerminalOperations;

import FunctionalInterface.Streams.TerminalOperations.Book;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationChallenegeDemo {
    public static void main(String args[]){
        List<Book> books= Arrays.asList(
                new Book("the fiction", 2018, 25.99, "fiction"),
                new Book("The Science", 2019, 34.89, "Science"),
                new Book("The biography", 1998, 36.57, "Biograohy"),
                new Book("The Math", 2018, 36.57, "Math"),
                new Book("The English", 2017, 34.57, "English"),
                new Book("The Hindi", 1995, 32.17, "Hindi"),
                new Book("The Social Science", 2019, 31.17, "Science")
        );
        //total cost of all books in bookstore
        Double totalcost=books.stream()
                .mapToDouble(book->book.price)
                .reduce(0,Double::sum);
        System.out.println("total cost"+ totalcost);
        //collecting books into a list of title
        List<String> titlelist=books.stream()
                .map(book->book.title)
                .collect(Collectors.toList());
        System.out.println(titlelist);
        // grouping books by category
       Map<String,List<Book>> byCategory= books.stream()
                .collect(Collectors.groupingBy(bookStringFunction));
       byCategory.forEach((category,bookList)->{
           bookList.forEach(System.out::println);
       });

    }

 static Function<Book,String> bookStringFunction=new Function<Book, String>() {
      @Override
      public String apply(Book book) {
          return book.getCategory();
      }
  };
}
