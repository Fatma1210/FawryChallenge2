import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookInventory {
    Map<String , Integer>  books = new HashMap<>();;
    List<Book> bookList = new ArrayList<Book>();
    public void add(Book book){
        String ISBN = book.getISBN() ;
        books.put(ISBN , books.getOrDefault(ISBN , 0) + 1);
       if(!(bookList.stream().anyMatch(Book -> book.getISBN().equals(ISBN)))){
           bookList.add(book);
        }
    }
    public void removeOutDatedBooks(){
       for(Book book : bookList){
           int curYear = Year.now().getValue();
           if(curYear - book.getYear() > 10){
               books.remove(book.getISBN());
               bookList.remove(book);
           }
       }
    }
}
