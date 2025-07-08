import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String address;
    private String email;
    private List<Book> bookCart = new ArrayList<Book>();
    public Customer(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getEmail() {
        return email;
    }
    public void addBookToCart(Book book) {
        bookCart.add(book);
    }
    public void removeBookFromCart(String bookName) {
        bookCart.removeIf(book -> book.getTitle().equalsIgnoreCase(bookName));
    }

    public List<Book> getBookCart() {
        return bookCart;
    }
    public void clearCart(){
        bookCart.clear() ;
    }
}
