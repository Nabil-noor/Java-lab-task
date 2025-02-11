package labtask;


import java.util.Scanner;

public class task33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\s+");
        StringBuilder capitalizedSentence = new StringBuilder();

        for (String word : words) {
            capitalizedSentence.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }

        System.out.println("Capitalized Sentence: " + capitalizedSentence.toString().trim());
        scanner.close();
    }
}
