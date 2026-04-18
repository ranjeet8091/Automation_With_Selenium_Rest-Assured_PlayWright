package question8Library;

public class Book {
    String title;
    String author;
    String ISBN;
    boolean isBorrowed;

    public Book() {
    }

    public Book(String title, String author, String ISBN, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isBorrowed = isBorrowed;
    }

    public void makeBorrowed(boolean value) {
        this.isBorrowed = value;
    }
}
