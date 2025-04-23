package com.example.task8;


public class CreditCard implements PaymentMethod {
    private String cardNumber;
    private String cardHolderName;

    public CreditCard(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public boolean authorizePayment(double amount) {
        System.out.println("Authorizing Credit Card for: " + cardHolderName);

        // Check if card number is not null, has 16 digits, and starts with '4'
        if (cardNumber != null && cardNumber.length() == 16 && cardNumber.startsWith("4")) {
            System.out.println("Authorization successful.");
            return true;
        } else {
            System.out.println("Authorization failed. Card number must be 16 digits and start with '4'.");
            return false;
        }
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount + " for " + cardHolderName);
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding $" + amount + " to Credit Card of " + cardHolderName);
    }
}
