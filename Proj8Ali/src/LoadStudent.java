//Maryam Ali
//Project 8
//March 19

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class LoadStudent {
    public static void main(String[] args) {
        // Define local variables.
        Connection c = null;
        Statement s = null;
        Scanner fromFile = null;
        String sql1 = null, sql2 = null;
        String line = null, firstName = null, lastName = null,
                Gender = null;
        String[ ] fields;
        int Year;

        try {
            // Define Connection and Statement objects.
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:transactions.db");
            s = c.createStatement();

            // Instantiate scanner to read from file.
            fromFile = new Scanner(new File ("students.txt"));

            // Create table
            sql1 = "create table if not exists " +
                    "students(id integer, " +
                    "firstName varchar(20), " +
                    "lastName varchar(20), " +
                    "Gender varchar(1), " +
                    "Year integer);";
            System.out.println("sql1: " + sql1);
            s.executeUpdate(sql1);

            // Read and throw away header line.
            fromFile.nextLine( );

            // Populate students table.
            for (int id = 1001; fromFile.hasNextLine( ); id++) {
                line = fromFile.nextLine( );
                fields = line.split(",");
                firstName = fields[0].trim( );
                lastName = fields[1].trim( );
                Gender = fields[2].trim( );
                Year = Integer.parseInt(fields[3].trim( ));
                sql2 = String.format(
                        "insert into students " +
                                "(id, firstName, lastName, Gender, Year) " +
                                "values (%d, '%s', '%s', '%s', %i);",
                        id, firstName, lastName, Gender, Year);
                System.out.println(sql2);
                s.executeUpdate(sql2);
            }

            // Close Connection
            c.close( );
        }
        catch (FileNotFoundException e) {
            System.out.println("File queries.sql not found.");
            System.err.println( e.getClass( ).getName( ) +
                    ": " + e.getMessage( ) );
        }
        catch(SQLException e) {
            System.out.println("SQLException.");
            System.err.println( e.getClass( ).getName( ) +
                    ": " + e.getMessage( ) );
        }
        catch (ClassNotFoundException e ) {
            System.err.println( e.getClass().getName( ) +
                    ": " + e.getMessage( ));
        }
        finally {
            fromFile.close( );
        }
    }
}

