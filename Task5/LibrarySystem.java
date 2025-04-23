
package labtask.Library;


import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
    static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        books.add(new Book("Java Basics", "James", true, "Printed"));
        books.add(new Book("AI Future", "Turing", true, "E-Book"));
        books.add(new Book("Data Science", "Ada", true, "Printed"));

        Scanner sc = new Scanner(System.in);

        System.out.println("Are you a Student or Teacher?");
        String role = sc.nextLine();
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        User user = role.equalsIgnoreCase("student") ? new Student(name) : new Teacher(name);

        while (true) {
            System.out.println("\n1. Borrow Book\n2. Return Book\n3. Search Book\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    if (!user.canBorrow()) {
                        System.out.println("Borrow limit reached.");
                        break;
                    }
                    System.out.print("Enter book title to borrow: ");
                    String borrowTitle = sc.nextLine();
                    Book bookToBorrow = searchBook(borrowTitle);
                    if (bookToBorrow != null && bookToBorrow.isAvailable) {
                        user.borrowBook(bookToBorrow);
                        System.out.println("Book borrowed successfully.");
                    } else {
                        System.out.println("Book not available.");
                    }
                    break;

                case 2:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = sc.nextLine();
                    Book bookToReturn = searchBook(returnTitle);
                    if (bookToReturn != null && user.borrowedBooks.contains(bookToReturn)) {
                        System.out.print("Enter number of days late: ");
                        int daysLate = sc.nextInt();
                        double fee = user.calculateLateFee(bookToReturn, daysLate);
                        user.returnBook(bookToReturn);
                        System.out.println("Book returned. Late fee: " + fee);
                    } else {
                        System.out.println("Book not borrowed by you.");
                    }
                    break;

                case 3:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = sc.nextLine();
                    Book book = searchBook(searchTitle);
                    if (book != null) {
                        System.out.println("Title: " + book.title);
                        System.out.println("Author: " + book.author);
                        System.out.println("Available: " + (book.isAvailable ? "Yes" : "No"));
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static Book searchBook(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }
}