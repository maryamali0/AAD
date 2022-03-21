//Maryam Ali
//Project 8
//March 19

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class DisplayStudent {
    public static void main(String[] args) {
        // Declare local variables.
        Connection c = null;
        Statement s = null;
        ResultSet rs = null;
        int id = 0, Year = 0;
        String sql = null, firstName = null, lastName = null,
                Gender = null;
        Scanner fromKeyboard = new Scanner(System.in);
        try {
            // Define Connection and Statement objects.
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection(
                    "jdbc:sqlite:students.db");
            s = c.createStatement();

            while (id != -1) {
                // Read id and display corresponding table row.
                System.out.print("Enter desired id: ");
                id = fromKeyboard.nextInt( );
                sql = "select firstName, lastName, Gender, Year " +
                        "from students " +
                        "where id = " + id + ";";
                System.out.println(sql);
                rs = s.executeQuery(sql);
                while (rs.next( )) {
                    firstName = rs.getString("firstName");
                    lastName = rs.getString("lastName");
                    Gender = rs.getString("Gender");
                    Year = rs.getInt("Year");
                    System.out.println("firstName: " + firstName);
                    System.out.println("lastName: " + lastName);
                    System.out.println("Gender: " + Gender);
                    System.out.println("Year: " + Year);
                }
            }
        }
        catch(SQLException e) {
            System.out.println("SQLException.");
            System.err.println( e.getClass().getName() +
                    ": " + e.getMessage() );
        }
        catch (ClassNotFoundException e ) {
            System.err.println( e.getClass().getName() +
                    ": " + e.getMessage() );
        }
        finally {
            fromKeyboard.close( );
        }
    }
}
