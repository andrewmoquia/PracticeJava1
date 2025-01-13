package com.test;

abstract class Payment {
    abstract void processPayment(double amount);

    void displayInfo() {
        System.out.println("Processing payment...");
    }
}

class CreditCardPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

class PayPalPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}
