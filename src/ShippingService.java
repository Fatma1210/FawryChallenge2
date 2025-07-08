import java.util.List;

public class ShippingService extends DeliveryService {

    @Override
    public void shipBooks(List<Book> shippedBooks, Customer customer) {
        String address = customer.getAddress();
        // send books to this << address >>
    }
    @Override
    public void printReceipt(List<Book> shippedBooks) {
        super.printReceipt(shippedBooks);
        double  BooksCost = super.calculateBookCost(shippedBooks);
        double ShippingCost = 65.0 ; // Assumption for simplicity
        System.out.println("Books Cost: " + BooksCost);
        System.out.println("Shipping Cost: " + ShippingCost);
        System.out.println("Total Cost: " + BooksCost + ShippingCost);
    }
    @Override
    public boolean isDeliverable(List<Book> shippedBooks) {
        for (Book book : shippedBooks) {
            if (!(book instanceof PaperBook)) {
                System.out.println("The book " + book.getTitle() + " is not paper book");
                return false;
            }
        }
        return true;
    }
}
