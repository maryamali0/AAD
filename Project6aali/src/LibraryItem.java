//Maryam Ali
//Project 6a
//Due: 02/28/20
//Submitted: 02/28/20

public class LibraryItem implements Comparable<LibraryItem>{//Declare base class as implementing comparable interface
   //private instance fields
    private String catalogNum;
    private String title;
    private int year;
    private boolean checkedOut;

    //Empty default constructor
    public LibraryItem(){}

    //constructor with parameter
    public LibraryItem(String catalogNum, String title, int year, boolean checkedOut){
        //Sets each instance field to the respective argument passed to the constructor
        this.catalogNum = catalogNum;
        this.title= title;
        this.year = year;
        this.checkedOut = checkedOut;
    }

    //Accessor or "getter" methods for each private instance fields, allows the public to read these values
    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getCatalogNum() {
        return catalogNum;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }


    //Check in and out methods, allows us to toggle the checkedOut value to true or false
    public void checkIn(){
        checkedOut = false;
    }

    public void checkOut(){
        checkedOut = true;
    }

    //Override of toString method to allow us to customize how our objects are displayed
    @Override
    public String toString(){
        return String.format("Catalog Number: %s\nTitle: %s\nYear: %d\nChecked out: %s", catalogNum, title, year, checkedOut ? "yes" : "no");
    }

    //Comparable interface demands a single method, compareTo
    @Override
    public int compareTo(LibraryItem o) {
        return title.compareTo(o.title);//We can leverage the compareTo method on the String class here
    }
}
