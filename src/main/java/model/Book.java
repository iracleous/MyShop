package model;

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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }


    //getters


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public double getPrice() {
        return price;
    }

    public int getPublicationYear() {
        return publicationYear;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pageNumber=" + pageNumber +
                ", price=" + price +
                ", publicationYear=" + publicationYear +
                '}';
    }


    // constructor


    public Book(String title, String author, int pageNumber, double price, int publicationYear) {
        this.title = title;
        this.author = author;
        this.pageNumber = pageNumber;
        this.price = price;
        this.publicationYear = publicationYear;
    }
}
