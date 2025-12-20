package FunctionalInterface.Streams.Intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

//how to apply streams on custom classes
public class IntermediateDemo {


    public static void main(String args[]){
        List<Book> books= Arrays.asList(
                new Book("the fiction", 2018, 25.99, "fiction"),
                new Book("The Science", 2019, 34.89, "Science"),
                new Book("The biography", 2018, 36.57, "Biograohy")
        );

        //1. Filtering:Books cheaper than $20
             Stream<Book> steam1=books.stream().filter(predicate);
             steam1.forEach(System.out::println);

        //2. Mapping:Convert book titles to uppercase
         Stream<String> upperCaseTitles = books.stream()
                 .map(book -> book.title.toUpperCase());
         upperCaseTitles.forEach(System.out::println);
        //3. Sorting:Books by publication date
        Stream<Book> sortedbooks =books.stream()
                .sorted(Comparator.comparingInt(book ->book.publication_year));
        sortedbooks.forEach(System.out::println);
        //4. Distinct:Remove duplicate titles
        Stream<Book> distincttitle=books.stream()
                .distinct();
        distincttitle.forEach(System.out::println);
        //5. Limit: Display only the first 3 books
        Stream<Book> limitdisplay=books.stream()
                .limit(3);
        limitdisplay.forEach(System.out::println);
        //6. Skip:skip the first 2 books
        Stream<Book> skipbook=books.stream()
                .skip(1);
        skipbook.forEach(System.out::println);



    }
    static  Predicate<Book> predicate = new Predicate<Book>() {


        @Override
        public boolean test(Book book) {
            return  book.price <30 ;

        }
    };
}
