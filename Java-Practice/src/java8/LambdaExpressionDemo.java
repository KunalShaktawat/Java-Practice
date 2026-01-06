package java8;
@FunctionalInterface
interface Payment {

    // Single abstract method
    void pay(double amount);

    // Default method is allowed
    default void paymentStatus() {
        System.out.println("Payment processing...");
    }
}

public class LambdaExpressionDemo {

    public static void main(String[] args) {

        Payment cashPayment = amount ->
                System.out.println("Cash payment of " + amount + " completed");

        Payment cardPayment = amount ->
                System.out.println("Card payment of " + amount + " completed");

        Payment upiPayment = amount ->
                System.out.println("UPI payment of " + amount + " completed");

        cashPayment.paymentStatus();
        cashPayment.pay(500);

        cardPayment.pay(1200);

        upiPayment.pay(750);
    }
}
