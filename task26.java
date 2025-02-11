package labtask;


import java.util.Scanner;

public class task26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("Concatenated (using concat): " + str1.concat(str2));
        System.out.println("Concatenated (using + operator): " + str1 + str2);
    }
}
