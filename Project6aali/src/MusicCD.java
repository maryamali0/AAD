//Maryam Ali
//Project 6a
//Due: 02/28/20
//Submitted: 02/28/20

public class MusicCD extends LibraryItem {
    //More instance fields for this subclass
    private String artist;
    private String composer;
    private String label;

    //constructor with parameter, receives all parameters for super class and this class
    public MusicCD(String catalogNum, String title, int year, boolean checkedOut, String artist, String composer, String label){
        super(catalogNum, title, year, checkedOut);//Invoke super class constructor here
        //Set additional instance fields
        this.artist = artist;
        this.composer = composer;
        this.label = label;
    }

    //Additional accessors for extra fields
    public String getArtist() {
        return artist;
    }

    public String getComposer() {
        return composer;
    }

    public String getLabel() {
        return label;
    }

    //We still over toString here to include our additional information, but we can leverage to the super class override in our override
    @Override
    public String toString() {
        return String.format("%s\nArtist: %s\nComposer: %s\nRecord Label: %s", super.toString(), artist, composer, label);//hence the reference to super.toString
    }
}
