package Exceptionhandling;
import java.lang.Exception;
//throw and throws

class BookunavialableException extends Exception{
    public BookunavialableException(String message){
        super(message);
    }
}
class library{
    int available_books=3;
    public void borrowBook(int booksrequestedCount) throws Exception{
       try{
           if( booksrequestedCount > available_books){
               throw new BookunavialableException("Not enough books available");
           }
           if(booksrequestedCount<0){
               throw new BookunavialableException("you must request at least one book");
           }

    }finally{
           System.out.println("finally ");
       }
    }
}
public class LibraryManagement {
    public static void main(String args[]){
        library lb1=new library();
        try{
            lb1.borrowBook(-4);
        }catch(Exception e){
            System.out.println(e.getMessage());

        }


    }
}
