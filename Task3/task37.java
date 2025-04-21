package labtask;

import java.util.Arrays;
import java.util.Scanner;

public class task37{
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter second string:");
        String str2 = scanner.nextLine();

        if (isAnagram(str1, str2))
            System.out.println("The strings are anagrams.");
        else
            System.out.println("The strings are not anagrams.");

        scanner.close();
    }
}
