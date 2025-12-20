package FunctionalInterface.Streams.TerminalOperations;
//how
public class Book {
    String title;
    int publication_year;
    double price;
    String category;
    public Book(String title, int publication_year, double price, String category){
        this.title=title;
        this.publication_year=publication_year;
        this.price=price;
        this.category=category;
    }
    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
