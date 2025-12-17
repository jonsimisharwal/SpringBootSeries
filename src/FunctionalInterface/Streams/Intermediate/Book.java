package FunctionalInterface.Streams.Intermediate;
//how
public class Book {
    String title;
    int publication_year;
    double price;
    String category;
    public Book(String title,int publication_year,double price,String category){
        this.title=title;
        this.publication_year=publication_year;
        this.price=price;
        this.category=category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publication_year=" + publication_year +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
