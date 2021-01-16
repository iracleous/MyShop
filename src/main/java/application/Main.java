package application;

import model.Book;

import java.io.FileNotFoundException;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        //variable type, variable name, variable value
        // book is the reference of the object Book

      //constructor

        Book book
                = new Book("The old Man in the sea", "E. Hemingway", 127, 10.20, 2018 );

        System.out.println( book.toString() );
      //  book.save("book.txt");
        book.load("book.txt");
        System.out.println( book.toString() );

    }

}
