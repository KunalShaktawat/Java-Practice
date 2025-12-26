package com.exceptionalhandling;
import java.util.Scanner;
@SuppressWarnings("serial")

// Custom Exception
class InvalidAgeException extends Exception {

	public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionHandlingDemo {

    // Method using throws keyword
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Age is valid. Access granted.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Unchecked Exception (ArithmeticException)
        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b; // may cause ArithmeticException
            System.out.println("Division Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }

        // 2. Multiple catch blocks (InputMismatchException)
        try {
            System.out.print("\nEnter your name: ");
            sc.nextLine(); // consume leftover newline
            String name = sc.nextLine();

            System.out.println("Name length: " + name.length());

        } catch (NullPointerException e) {
            System.out.println("Null value encountered");
        } catch (Exception e) {
            System.out.println("Some exception occurred");
        }

        // 3. Custom Exception using throw & throws
        try {
            System.out.print("\nEnter your age: ");
            int age = sc.nextInt();

            validateAge(age);

        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        // 4. finally block
        try {
            System.out.println("\nInside try block");
        } finally {
            System.out.println("Finally block always executes");
        }

        System.out.println("\nProgram executed successfully.");
        sc.close();
    }
}
