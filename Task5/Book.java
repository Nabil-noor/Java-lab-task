package labtask.Library;

public class Book {
    String title;
    String author;
    boolean isAvailable;
    String type; // "Printed" or "E-Book"

    public Book(String title, String author, boolean isAvailable, String type) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
        this.type = type;
    }
}

