package com.sreejithjava.ClassDemo;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = 10 / 0; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } finally {
            // This block always executes
            System.out.println("Finally block executed.");
        }
    }
}
