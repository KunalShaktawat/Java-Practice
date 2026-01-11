package com.exceptionalhandling;
class NegativeBalanceException extends RuntimeException {
    public NegativeBalanceException(String message) {
        super(message);
    }
}

public class CustomUncheckedException {
    private double balance = 100;

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new NegativeBalanceException("Insufficient funds!");
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        CustomUncheckedException account = new CustomUncheckedException();
        account.withdraw(200); // Runtime exception propagates
    }
}
