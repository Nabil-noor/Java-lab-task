package labtask;


import java.util.Arrays;
import java.util.Scanner;

public class task36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        char[] chars = input.toCharArray();
        Arrays.sort(chars);

        System.out.println("Sorted String: " + new String(chars));
        scanner.close();
    }
}
