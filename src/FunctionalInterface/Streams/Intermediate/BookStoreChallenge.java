package FunctionalInterface.Streams.Intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class BookStoreChallenge {
    public static void main(String[] args) {
        /*
        -Discounted Books : the bookstore is planning a sale.
           Identify all books that are price over$30.Display these books.
         -Classics Collection: the bookstore is launching a classics collection.
           Identify and display books that were publicshed before the year 2000.
         -Upcoming Titles:Generate a list of future book titles for the next year
              by adding the suffix "(comming soon)" to all the current titles.
         -Sort by price: the bookstore wants to print price tags for all the book
            Display the books sorted by their prices in ascending order.
          -Rare Books: the bookstore believes there might be rare books in the collection.
          A rare book is one where the title has more than 20 characters.
          Identify and display these books.
         */
        List<Book> books= Arrays.asList(
                new Book("the fiction", 2018, 25.99, "fiction"),
                new Book("The Science", 2019, 34.89, "Science"),
                new Book("The biography", 1998, 36.57, "Biograohy"),
                new Book("The Math", 2018, 36.57, "Math"),
                new Book("The English", 2017, 34.57, "English"),
                new Book("The Hindi", 1995, 32.17, "Hindi"),
                new Book("The Social Science", 2019, 31.17, "Science")
        );
        //1 answer
        Stream<Book> Discountedbooks=books.stream()
                .filter(book-> book.price >30);
        Discountedbooks.forEach(System.out::println);

        //classics collection
        Stream<Book> classicsCollection = books.stream()
                .filter(book ->book.publication_year<2000);
        classicsCollection.forEach(System.out::println);

        //Upcoming titles
        System.out.println("adding suffix to titlr");
        books.stream().map(book-> book.title +"comming soon").forEach(System.out::println);

        //Sort by price
        System.out.println("Sorted Books by price");
        Stream<Book> sortedbook=books.stream()
                .sorted(Comparator.comparing(book -> book.price));
        sortedbook.forEach(System.out::println);

        //Rare Books
                System.out.println("Rare Books");
                Stream<Book> Rarebook =books.stream()
                .filter(book-> book.title.length() >20);
                Rarebook.forEach(System.out::println);



    }
}
