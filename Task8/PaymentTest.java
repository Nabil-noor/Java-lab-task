
package com.example.task8;

public class PaymentTest {
    public static void main(String[] args) {
        PaymentMethod creditCardAuth = new CreditCard("2025456780000000", "Rahim");
        PaymentMethod paypalAuth = new PayPal("Rahim@gmail.com", "@#xyz@#");

        PaymentMethod creditCardFail = new CreditCard("1111222233334444", "Karim");
        PaymentMethod paypalFail = new PayPal("Rahim@gmail.com", "@#xyz@# ");

        System.out.println("\n--- Authorized Credit Card Payment ---");
        if (creditCardAuth.authorizePayment(500)) {
            creditCardAuth.processPayment(400);
            creditCardAuth.refundPayment(350);
        } else {
            System.out.println("Authorization failed. Payment not processed.");
        }

        System.out.println("\n--- Unauthorized Credit Card Payment ---");
        if (creditCardFail.authorizePayment(400)) {
            creditCardFail.processPayment(300);
            creditCardFail.refundPayment(150);
        } else {
            System.out.println("Authorization failed. Payment not processed.");
        }

        System.out.println("\n--- Authorized PayPal Payment ---");
        if (paypalAuth.authorizePayment(900)) {
            paypalAuth.processPayment(800);
            paypalAuth.refundPayment(200);
        } else {
            System.out.println("Authorization failed. Payment not processed.");
        }

        System.out.println("\n--- Unauthorized PayPal Payment ---");
        if (paypalFail.authorizePayment(500)) {
            paypalFail.processPayment(600);
            paypalFail.refundPayment(250);
        } else {
            System.out.println("Authorization failed. Payment not processed.");
        }
    }
}
