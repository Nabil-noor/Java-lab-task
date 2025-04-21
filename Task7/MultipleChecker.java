package labtask;


import java.util.Scanner;

public class MultipleChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();


            if (num1 < 0 || num2 < 0) {
                throw new NegativeNumberException("One or both numbers are negative.");
            }


            if (num1 < num2) {
                throw new FirstSmallerException("First number is smaller than the second number.");
            }


            if (num2 == 0) {
                throw new DivisionByZeroException("Cannot divide by zero.");
            }

            
            if (num1 % num2 == 0) {
                System.out.println(num1 + " is a multiple of " + num2);
            } else {
                System.out.println(num1 + " is NOT a multiple of " + num2);
            }

        } catch (NegativeNumberException | FirstSmallerException | DivisionByZeroException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }

        sc.close();
    }
}
