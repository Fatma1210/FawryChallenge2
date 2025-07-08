import java.time.Year;

public class EBook extends Book {
    private String fileType ;
    public EBook(String ISBN, String title, int year, double price , String fileType) {
        super(ISBN, title, year, price);
        this.fileType = fileType;
    }
}
