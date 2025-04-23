
package labtask.Library;

import java.util.ArrayList;

public abstract class User {
    String name;
    ArrayList<Book> borrowedBooks = new ArrayList<>();
    int maxBooks;

    public User(String name, int maxBooks) {
        this.name = name;
        this.maxBooks = maxBooks;
    }

    public abstract double calculateLateFee(Book book, int daysLate);

    public boolean canBorrow() {
        return borrowedBooks.size() < maxBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        book.isAvailable = false;
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.isAvailable = true;
    }
}