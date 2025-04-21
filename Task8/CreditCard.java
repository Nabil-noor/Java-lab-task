package com.example.task8;
class CreditCard implements PaymentMethod {
    private String cardNumber;
    private String cardHolderName;

    private static final String ADMIN_HOLDER_NUMBER = "2025456780000000";
    private static final String ADMIN_HOLDER_NAME = "Rahim";

    public CreditCard(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    public boolean authorizePayment(double amount) {
        System.out.println("Authorizing Credit Card for " + cardHolderName);
        if (cardNumber != null && cardNumber.length() == 16 &&
                cardNumber.equals(ADMIN_HOLDER_NUMBER) &&
                cardHolderName.equals(ADMIN_HOLDER_NAME)) {
            System.out.println("Credit Card authorized.");
            return true;
        } else {
            System.out.println("Credit Card authorization failed.");
            return false;
        }
    }

    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of Tk. " + amount);
    }

    public void refundPayment(double amount) {
        System.out.println("Refunding Tk. " + amount + " to Credit Card.");
    }
}
