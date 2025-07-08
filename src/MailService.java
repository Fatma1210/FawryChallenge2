import java.util.List;

public class MailService extends DeliveryService {

    @Override
    public void printReceipt(List<Book> shippedBooks) {
        super.printReceipt(shippedBooks);
        double  BooksCost = super.calculateBookCost(shippedBooks);
        System.out.println("Total Cost: " + BooksCost);
    }

    @Override
    public void shipBooks(List<Book> shippedBooks, Customer customer) {
        String emailAddress = customer.getEmail();
        // send books to this << emailAddress >>
    }

    @Override
    public boolean isDeliverable(List<Book> shippedBooks) {
        for (Book book : shippedBooks) {
            if (!(book instanceof EBook)) {
                System.out.println("The book " + book.getTitle() + " is not an EBook");
                return false;
            }
        }
        return true;
    }
}
