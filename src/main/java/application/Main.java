package application;

import model.Book;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;


public class Main {


    public static void main(String[] args) {
        JFrame jFrame = new JFrame("My graphic application");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GuiLibrary guiLibrary = new GuiLibrary();
        jFrame.setContentPane(guiLibrary.getLibraryPanel());

        jFrame.setSize(500,500);

        jFrame.setVisible(true);

    }









    public static void main2(String[] args) throws FileNotFoundException {
        //variable type, variable name, variable value
        // book is the reference of the object Book

        //constructor

        Book book
                = new Book("The old Man in the sea", "E. Hemingway", 127, 10.20, 2018);
/*
        () [] {} <> "" ''
        parenthesis     παρένθεση       used in methods
        brackets   αγκύλες          used in arrays
        curly brackets  άγκιστρα        used to define values of arrays
        angled brackets  γωνιακές αγκύλες       used in strong types, generics
          double quotes  εισαγωγικά     used in strings
          single quotes   μονά εισαγωγικά  used in character
 */
        //new defines a new Object and a suitable constructor follows
        //ArrayList = ordered Collection
        ArrayList<Book> books = new ArrayList<>();

        books.add(book);


        Book book2
                = new Book("20000 Leagues under the sea", "J. Verne", 200, 8.30, 2018);

        books.add(book2);

        Book book3
                = new Book("Christ recrucified", "N. Kazantzakis", 200, 9.30, 2018);

        books.add(book3);

        // printing the titles only
        for (int i = 0; i < books.size(); i++)
            System.out.println(books.get(i) );


        //aggregations


        // print the number of available books
        System.out.println("the available books "+books.size());



        // calculation of the total price
        //1. classic way  3rd G
        //imperative

        double totalPrice = 0;  // initialization
        for (int i = 0; i < books.size(); i++) {
            totalPrice += books.get(i).getPrice();
        }

        // calculation of the total price
        // 2. modern way 4th G
        //functional
        // fluent API
        // Application Programming Interface
        double sum = books.stream()
                .mapToDouble(Book::getPrice)
                .sum();

        System.out.println("Total price " + sum);
        System.out.println("Total price " + totalPrice);


        System.out.println("Books before sorting");
        System.out.println(books);
        // sorting the books by price
        books.sort( (b1, b2) -> (int) (b1.getPrice()-b2.getPrice()) );
        System.out.println("Books after sorting");
        System.out.println(books);

        books.sort(Comparator.comparingDouble(Book::getPrice) );


        // find maximum price
        double maxPriceBook = books.stream()
                .mapToDouble(Book::getPrice)
                .max()
                .orElseThrow(NoSuchElementException::new);


        // find the book with the maximum price
        Book bookMaximumPrice = books.stream()
                .max(Comparator.comparingDouble(Book::getPrice) )
                .orElseThrow(NoSuchElementException::new);


        // find minimum
        double minPriceBook  = books.stream()
                .mapToDouble(Book::getPrice)
                .min()
                .orElseThrow(NoSuchElementException::new);


        System.out.println("The maximum price is "+maxPriceBook);
        System.out.println("The minimum price is "+minPriceBook);


    }

}
