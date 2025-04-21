package labtask;


import java.util.Scanner;

public class task28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);
        System.out.println("First occurrence: " + input.indexOf(ch));
        System.out.println("Last occurrence: " + input.lastIndexOf(ch));
    }
}
