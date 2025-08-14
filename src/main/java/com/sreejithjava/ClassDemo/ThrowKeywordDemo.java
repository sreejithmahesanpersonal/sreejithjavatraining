package com.sreejithjava.ClassDemo;

public class ThrowKeywordDemo {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            throw new IllegalArgumentException("This is a custom exception message.");
        } catch (IllegalArgumentException e) {
            // Handling the exception
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        } finally {
            // This block always executes
            System.out.println("Finally block executed.");
        }
    }
}
