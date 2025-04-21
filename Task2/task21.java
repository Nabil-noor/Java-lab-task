package labtask;


import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        System.out.println("Enter start and end indices:");
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println("Substring: " + input.substring(start, end));
    }
}
