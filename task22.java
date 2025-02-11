package labtask;


import java.util.Scanner;

public class task22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with leading or trailing spaces:");
        String input = sc.nextLine();
        System.out.println("Trimmed string: \"" + input.trim() + "\"");
    }
}
