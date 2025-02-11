package labtask;

import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Enter the index: ");
        int index = sc.nextInt();


        if (index >= 0 && index < input.length()) {
            System.out.println("Character at index " + index + ": " + input.charAt(index));
        } else {
            System.out.println("Error: Index out of bounds. Valid range is 0 to " + (input.length() - 1));
        }
    }
}
