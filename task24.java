package labtask;


import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("Are strings equal (case-sensitive)? " + str1.equals(str2));
        System.out.println("Are strings equal (case-insensitive)? " + str1.equalsIgnoreCase(str2));
    }
}
