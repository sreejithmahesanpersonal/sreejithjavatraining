package com.sreejithjava.ClassDemo;

import java.io.BufferedReader;

public class BufferReaderAndScannerDemo {
    public static void main(String[] args) {
        // This class is a placeholder for demonstrating the use of BufferedReader and Scanner
        // You can implement methods to read input from the console or files using these classes
        System.out.println("BufferReader and Scanner Demo");

        // Example usage can be added here
        // BufferedReader and Scanner are typically used for reading input in Java applications
        // BufferedReader is used for reading text from a character-input stream
        // Scanner is used for parsing primitive types and strings using regular expressions
        // You can create instances of BufferedReader and Scanner to read input from the console or files

        BufferedReader bf = new BufferedReader(new java.io.InputStreamReader(System.in));
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        try {
            System.out.print("Enter a line of text: ");
            String line = bf.readLine();
            System.out.println("You entered: " + line);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println("You entered the number: " + number);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                bf.close();
                scanner.close();
            } catch (Exception e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
        System.out.println("Demo completed.");
    }
}
