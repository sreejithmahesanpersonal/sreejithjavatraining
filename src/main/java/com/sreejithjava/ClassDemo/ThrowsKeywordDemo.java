package com.sreejithjava.ClassDemo;

public class ThrowsKeywordDemo {
    // Method that throws an exception
    public static void riskyMethod() throws Exception {
        // Simulating an error condition
        throw new Exception("An error occurred in riskyMethod.");
    }

    public static void main(String[] args) {
        try {
            // Calling the method that may throw an exception
            riskyMethod();
        } catch (Exception e) {
            // Handling the exception
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            // This block always executes
            System.out.println("Finally block executed.");
        }
    }
}
