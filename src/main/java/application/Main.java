package application;

import model.Book;

public class Main {


    public static void main(String[] args) {
        //variable type, variable name, variable value
        // book is the reference of the object Book
        Book book
                = new Book("The old Man in the sea", "E. Hemingway", 127, 10.20, 2018 );

        System.out.println(book);



    }

}
