//Maryam Ali
//Project 4
//Febuary 6
import java.util.*;
import java.io.*;
import javax.swing.JFileChooser;

public class Main {

    // Function to get the bar code for a given zipcode
    public static String getBarCode(String zipcode){
        String chars = "0123456789";
        String[ ] codes = {"||:::", ":::||", "::|:|", "::||:", ":|::|", 
            ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};
        String retVal = "";
        int checkSum = 0;
        for(int i = 0; i < zipcode.length( ); i++) {
            char c = zipcode.charAt(i);
            if(c != '-'){   // Skipping the dash symbol in some of the zipcodes
                int index = chars.indexOf(c);
                checkSum += index;  // Calculating the check sum
                String code = codes[index]; // Adding the bar code of each number in the zipcode
                retVal += code;
            }
        }
        checkSum = checkSum % 10;
        checkSum = 10 - checkSum;
        if(checkSum == 10){
            checkSum = 0;
        }
        retVal += codes[checkSum];  // Appending the check sum to the bar code
        return retVal;
    }

    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("Choose the CSV file to load");  // User Prompt
        JFileChooser chooser = new JFileChooser( );
        chooser.showOpenDialog(null);
        File fileObj = chooser.getSelectedFile( );
        Scanner in = new Scanner(fileObj);  // Reading from the file
        PrintWriter pw = new PrintWriter("output-labels.txt");
        while (in.hasNextLine( )) { // Reading each line and writing it to the output file
            String row[] = in.nextLine().split(",");
            pw.println(row[0]);
            pw.println(row[1]);
            pw.println(row[2] + " " + row[3] + " " + row[4]);
            pw.println("|" + getBarCode(row[4]) + "|");
            pw.println();
        }
        pw.close();
        in.close();
    }
}