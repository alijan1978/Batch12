package Class19;

public class Task5 {
    /*
    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    -Instance variables are being initialized
    - Both Constructors are being executed
     */

    String bookName;
    double price;

    public Task5() {
        System.out.println("No argument construction");
    }

    public Task5(String bookName, double price) {
        this();
        this.bookName = bookName;
        this.price = price;
        System.out.println("Two argument constructor");
    }
}