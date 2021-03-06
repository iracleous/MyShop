package application;

import model.Book;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Searchform {
    private JTextField searchField;
    private JPanel searchPanel;
    private JButton searchButton;
    private ArrayList<Book> books;

    public Searchform(ArrayList<Book> books) {
        this.books = books;
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, books.toString()) ;

            }
        });
    }

    public JPanel getSearchPanel() {
        return searchPanel;
    }
}
