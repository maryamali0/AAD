//Maryam Ali
//Project 6a
//Due: 02/28/20
//Submitted: 02/28/20

public class Book extends LibraryItem {
    //More instance fields (private) for the subclass
    private String author;
    private String publisher;

    //constructor with parameter, receives all parameters for super class and this class
    public Book(String catalogNum, String title, int year, boolean checkedOut, String author, String publisher){
        super(catalogNum, title, year, checkedOut);//Invoke super class constructor here
        //Set additional instance fields here
        this.author = author;
        this.publisher = publisher;
    }

    //Additional accessors
    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    //We still over toString here to include our additional information, but we can leverage to the super class override in our override
    @Override
    public String toString() {
        return String.format("%s\nAuthor: %s\nPublisher: %s", super.toString(), author, publisher);
    }
}
