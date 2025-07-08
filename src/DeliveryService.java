import java.util.List;

public abstract class DeliveryService {
    public double calculateBookCost(List<Book> shippedBooks){
        double totalCost = 0;
        for(Book book : shippedBooks){
            totalCost += book.getPrice();
        }
        return totalCost;
    }
    public void printReceipt(List<Book> shippedBooks){
        for(Book book : shippedBooks){
            System.out.println(book.getTitle() + ": " + book.getPrice() + "LE");
        }

    }
    public void shipBooks(List<Book> shippedBooks , Customer customer ){
        printReceipt(shippedBooks) ;
    }
    public abstract boolean isDeliverable(List<Book> shippedBooks) ;
}
