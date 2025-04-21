package labtask;


import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title, author;
    int cost, stock;

    public Book(String title, String author, int stock, int cost) {
        this.title = title;
        this.author = author;
        this.stock = stock;
        this.cost = cost;
    }

    public void showStat() {
        System.out.println(title + " by " + author + " | Stock: " + stock + " | Price: " + cost);
    }
}

public class LibraryManagementSystem {

    static ArrayList<Book> bookList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static int findBook(String title, String author) {
        for (int i = 0; i < bookList.size(); i++) {
            Book b = bookList.get(i);
            if (b.title.equalsIgnoreCase(title) && b.author.equalsIgnoreCase(author)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean sales(int quantity, int pos) {
        Book b = bookList.get(pos);
        if (b.stock >= quantity) {
            System.out.println("Total Cost: " + b.cost * quantity);
            System.out.println("1: Confirm\n0: Cancel");
            int confirm = scanner.nextInt();
            if (confirm == 1) {
                System.out.println(b.title + " sold " + quantity + " copies.");
                b.stock -= quantity;
                return true;
            } else {
                System.out.println("Sale canceled.");
            }
        } else {
            System.out.println("Insufficient stock.");
        }
        return false;
    }

    public static void addBook(String title, String author, int stock, int cost) {
        int found = findBook(title, author);
        if (found == -1) {
            bookList.add(new Book(title, author, stock, cost));
            System.out.println("Successfully added book.");
        } else {
            Book b = bookList.get(found);
            b.stock += stock;
            b.cost = cost;
            System.out.println("Successfully updated book.");
        }
    }

    public static void menu() {
        System.out.println("\n=== Library Menu ===");
        System.out.println("1: Sales");
        System.out.println("2: Add Book");
        System.out.println("3: Find Book");
        System.out.println("0: Close");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        int input;
        menu();
        input = scanner.nextInt();
        scanner.nextLine(); // consume newline

        while (input != 0) {
            String title, author;
            int quantity, cost;

            switch (input) {
                case 1:
                    System.out.println("Enter title & author:");
                    title = scanner.nextLine();
                    author = scanner.nextLine();
                    int found = findBook(title, author);
                    if (found == -1) {
                        System.out.println("Book not found.");
                    } else {
                        System.out.println("Book found. Enter quantity:");
                        quantity = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        sales(quantity, found);
                    }
                    break;

                case 2:
                    System.out.println("Enter title, author, quantity & cost:");
                    title = scanner.nextLine();
                    author = scanner.nextLine();
                    quantity = scanner.nextInt();
                    cost = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    addBook(title, author, quantity, cost);
                    break;

                case 3:
                    System.out.println("Enter title & author:");
                    title = scanner.nextLine();
                    author = scanner.nextLine();
                    found = findBook(title, author);
                    if (found == -1) {
                        System.out.println("Book not found.");
                    } else {
                        bookList.get(found).showStat();
                    }
                    break;

                default:
                    System.out.println("Invalid input. Try again.");
            }

            menu();
            input = scanner.nextInt();
            scanner.nextLine(); // consume newline
        }

        System.out.println("Library closed.");
    }
}
