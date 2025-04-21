
package com.example.task8;
class PayPal implements PaymentMethod {
    private String email;
    private String password;

    private static final String ADMIN_EMAIL = "Rahim@gmail.com";
    private static final String ADMIN_PASSWORD = "@#xyz@#";

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public boolean authorizePayment(double amount) {
        System.out.println("Authorizing PayPal account for: " + email);
        if (email != null && !email.isEmpty() &&
                password != null && !password.isEmpty() &&
                email.equals(ADMIN_EMAIL) &&
                password.equals(ADMIN_PASSWORD)) {
            System.out.println("PayPal authorized.");
            return true;
        } else {
            System.out.println("PayPal authorization failed.");
            return false;
        }
    }

    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of Tk. " + amount);
    }

    public void refundPayment(double amount) {
        System.out.println("Refunding Tk. " + amount + " to PayPal account.");
    }
}
