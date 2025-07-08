import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 5 DemoBook
        Book demo1 = new DemoBook("D001", "Demo Java Basics", 2020, 0.0);


        Book demo2 = new DemoBook("D002", "Demo Python Guide", 2021, 0.0);

        Book demo3 = new DemoBook("D003", "Demo Web Dev", 2019, 0.0);


        Book demo4 = new DemoBook("D004", "Demo Data Science", 2022, 0.0);

        Book demo5 = new DemoBook("D005", "Demo Algorithms", 2018, 0.0);


// 5 EBook
        Book ebook1 = new EBook("E001", "EBook Java Advanced", 2022, 150.0, "pdf");


        Book ebook2 = new EBook("E002", "EBook Machine Learning", 2023, 180.0, "epub");

        Book ebook3 = new EBook("E003", "EBook Cloud Computing", 2021, 140.0, "pdf");


        Book ebook4 = new EBook("E004", "EBook Mobile Development", 2022, 170.0, "mobi");


        Book ebook5 = new EBook("E005", "EBook Databases", 2023, 160.0, "epub");


// 10 PaperBook
        Book paper1 = new PaperBook("P001", "Paper Java Projects", 220.0, 2017);


        Book paper2 = new PaperBook("P002", "Paper Data Structures", 250.0, 2018);

        Book paper3 = new PaperBook("P003", "Paper Operating Systems", 240.0, 2019);


        Book paper4 = new PaperBook("P004", "Paper Networking", 260.0, 2016);


        Book paper5 = new PaperBook("P005", "Paper Cybersecurity", 230.0, 2020);
        BookInventory bookInventory = new BookInventory();
        bookInventory.removeOutDatedBooks() ;
        bookInventory.add(demo1);
        bookInventory.add(demo2);
        bookInventory.add(demo3);
        bookInventory.add(demo4);
        bookInventory.add(demo5);
        bookInventory.add(ebook1);
        bookInventory.add(ebook2);
        bookInventory.add(ebook3);
        bookInventory.add(ebook4);
        bookInventory.add(ebook5);
        bookInventory.add(paper1);
        bookInventory.add(paper2);
        bookInventory.add(paper3);
        bookInventory.add(paper4);
        bookInventory.add(paper5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Our Work Store , Please Enter Your Personal data : ");
        System.out.print("Your Name: ");
        String name = sc.nextLine();
        System.out.print("Your Email: ");
        String email = sc.nextLine();
        System.out.print("Your Address: ");
        String address = sc.nextLine();
        Customer customer = new Customer(name, email, address);
        customer.addBookToCart(demo1);
        customer.addBookToCart(ebook1);
        customer.addBookToCart(paper2);
        customer.addBookToCart(paper3);

        DeliveryService shippingService = new ShippingService();
        while (!(shippingService.isDeliverable(customer.getBookCart()))) {
            System.out.println("Please Remove Demo or EBooks , they aren't Deliverable! , Enter The Book Name To Be Removed : ");
            String BookName = sc.nextLine();
            customer.removeBookFromCart(BookName);
        }
        shippingService.shipBooks(customer.getBookCart(), customer);
        shippingService.printReceipt(customer.getBookCart()) ;


        System.out.println("---------------------------------------------------------");

        customer.clearCart();
        customer.addBookToCart(paper4);
        customer.addBookToCart(ebook1);
        customer.addBookToCart(ebook2);
        customer.addBookToCart(ebook3);

        DeliveryService mailService = new MailService();
        while (!(mailService.isDeliverable(customer.getBookCart()))) {
            System.out.println("Please Remove Demo or Paper Books , they aren't Deliverable! , Enter The Book Name To Be Removed : ");
            String BookName = sc.nextLine();
            customer.removeBookFromCart(BookName);
        }
        mailService.shipBooks(customer.getBookCart(), customer);
        mailService.printReceipt(customer.getBookCart()) ;
    }
}
