package labtask;


import java.util.Scanner;

public class task35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        System.out.println("Enter replacement character:");
        char replacement = scanner.next().charAt(0);

        String result = sentence.replace(' ', replacement);
        System.out.println("Modified Sentence: " + result);
        scanner.close();
    }
}
