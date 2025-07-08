import java.time.Year;

public abstract class Book {
    private String ISBN;
    private String title;
    private int year;
    private double price;
    private boolean isAvailableOnline;
    private boolean isAvailableForSale;
    public Book(String ISBN, String title, int year, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public void setAvailability(boolean isAvailableOnline, boolean isAvailableForSale) {
        this.isAvailableOnline = isAvailableOnline;
        this.isAvailableForSale = isAvailableForSale;
    }
    public boolean isAvailableOnline() {
        return isAvailableOnline;
    }
    public boolean isAvailableForSale() {
        return isAvailableForSale;
    }


}
