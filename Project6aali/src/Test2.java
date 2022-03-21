//Maryam Ali
//Project 6a
//Due: 02/28/20
//Submitted: 02/28/20

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Unit tests for the all of the classes
public class Test2 {

    @Test//Each unit test needs to be a void method and be marked with the @Test annotation
    public void TestLibraryItem(){

        //In the method we can create some Library Item objects and test the methods on them
        LibraryItem itemOne = new LibraryItem("a1b2", "A", 1999, false);
        LibraryItem itemTwo = new LibraryItem("a1b3", "B", 2010, true);

        //Here we test all the accessors, the check out method, the toString method, and the compareTo method
        assertEquals(itemOne.getCatalogNum(), "a1b2");
        assertEquals(itemOne.getTitle(),"A");
        assertEquals(itemTwo.getYear(), 2010);
        assertTrue(itemTwo.isCheckedOut());
        assertEquals("Catalog Number: a1b2\nTitle: A\nYear: 1999\nChecked out: no", itemOne.toString());
        itemOne.checkOut();
        assertTrue(itemOne.isCheckedOut());
        itemTwo.checkIn();
        assertFalse(itemTwo.isCheckedOut());
        assertTrue(itemOne.compareTo(itemTwo) < 0);

    }

    //testing for the subclasses, but less to test since we tested the base class
    @Test
    public void TestMusicCD(){
        MusicCD cd = new MusicCD("a1b2", "A", 1999, false, "Test1", "Test2", "Test3");
        assertEquals("Catalog Number: a1b2\nTitle: A\nYear: 1999\nChecked out: no\nArtist: Test1\nComposer: Test2\nRecord Label: Test3", cd.toString());
        assertEquals(cd.getArtist(), "Test1");
        assertEquals(cd.getComposer(), "Test2");
        assertEquals(cd.getLabel(), "Test3");
    }

    @Test
    public void TestBook(){
        Book book = new Book("a1b2", "A", 1999, false, "Test1", "Test2");
        assertEquals("Catalog Number: a1b2\nTitle: A\nYear: 1999\nChecked out: no\nAuthor: Test1\nPublisher: Test2", book.toString());
        assertEquals(book.getAuthor(), "Test1");
        assertEquals(book.getPublisher(), "Test2");
    }
}
