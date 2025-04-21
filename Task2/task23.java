package labtask;


import java.util.Scanner;

public class task23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        System.out.println("Enter character to replace and replacement character:");
        char oldChar = sc.next().charAt(0);
        char newChar = sc.next().charAt(0);
        System.out.println("Modified string: " + input.replace(oldChar, newChar));
    }
}
