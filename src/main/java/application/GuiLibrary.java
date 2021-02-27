package application;



import model.Book;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GuiLibrary {
    private JPanel LibraryPanel;

    private JTextField titleField;
    private JTextField authorField;
    private JTextField pagesNumberField;
    private JTextField publicationYearField;
    private JTextField priceField;

    private JButton insertBookButton;

    private ArrayList<Book> books;


    public GuiLibrary(ArrayList<Book> books) {
        this.books = books;

        insertBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Book book = new Book(titleField.getText(),
                        authorField.getText(),
                        Integer.parseInt(pagesNumberField.getText()),
                        Double.parseDouble(priceField.getText()),
                        Integer.parseInt(publicationYearField.getText())
                        );

                JOptionPane.showMessageDialog(null,book.toString());
                books.add(book);


//                JOptionPane.showMessageDialog(null,
//                        "The book title is " + titleField.getText()
//                                + "\nThe book author is " + authorField.getText()
//                                + "\nThe book pagesNumberField is " + pagesNumberField.getText()
//                                + "\nThe book publicationYearField is " + publicationYearField.getText()
//                                + "\nThe book priceField is " + priceField.getText()
//                );
            }
        });
    }


    public JPanel getLibraryPanel() {
        return LibraryPanel;
    }
}
