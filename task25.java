package labtask;

import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("Enter a substring:");
        String substr = sc.nextLine();
        System.out.println("Substring present? " + str.contains(substr));
    }
}

