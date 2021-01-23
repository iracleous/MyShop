package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//Lombok annotation

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
//fields of the class
    private String title;
    private String author;
    private int pageNumber;
    private double price;
    private int publicationYear;

    //setters, mutators
    // setter sets a new value to a field
    // access specifier, return type, method name, argument list
        //argument type, argument name
    // argument or parameter

    //getters


    // constructor
   // within parenthesis  parameters or arguments
    //type name


    public void save(String filename) throws FileNotFoundException {
        File file = new File(filename);
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println(this.title );
        printWriter.close();
    }

    //method signature
    public void load(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        String title = scanner.nextLine();
        this.title=title;

    }



}
