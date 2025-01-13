package com.test.components;

public class BankAccount {
    private double balance = 0.0;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    double getBalance() {
        return balance;
    }

    // Inner class for transaction history
    public class Transaction {
        private final String type;
        private final double amount;

        Transaction(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }

        public void printTransaction() {
            System.out.println(type + ": $" + amount + " Remaining Balance: " + balance);
        }
    }

    public Transaction createTransaction(String type, double amount) {
        return new Transaction(type, amount);
    }
}
