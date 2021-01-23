package application;

import model.Book;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
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
                = new Book("Christ recrucified", "N. Kazantzakis", 200, 8.30, 2018);

        books.add(book3);

        // printing the titles only
        for (int i = 0; i < books.size(); i++)
            System.out.println(books.get(i).getPrice());


        //aggregations


        // print the number of available books
        System.out.println("the available books "+books.size());



        // calculation of the total price
        //1. classic way
        //imperative

        double totalPrice = 0;  // initialization

        for (int i = 0; i < books.size(); i++) {
            totalPrice += books.get(i).getPrice();
        }


        // calculation of the total price
        // 2. modern way
        //functional
        double sum = books.stream()
                .mapToDouble(Book::getPrice)
                .sum();

        System.out.println("Total price " + sum);
        System.out.println("Total price " + totalPrice);



        //find the book with minimum price





    }

}
