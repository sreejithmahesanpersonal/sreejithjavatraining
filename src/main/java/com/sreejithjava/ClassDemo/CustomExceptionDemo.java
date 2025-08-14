package com.sreejithjava.ClassDemo;

public class CustomExceptionDemo {
    // Custom exception class
    static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        try {
            // Code that may throw a custom exception
            throw new CustomException("This is a custom exception message.");
        } catch (CustomException e) {
            // Handling the custom exception
            System.out.println("Caught a CustomException: " + e.getMessage());
        } finally {
            // This block always executes
            System.out.println("Finally block executed.");
        }
    }
}
