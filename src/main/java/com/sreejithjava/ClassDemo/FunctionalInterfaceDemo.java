package com.sreejithjava.ClassDemo;

public class FunctionalInterfaceDemo {
    // Functional interface with a single abstract method
    @FunctionalInterface
    interface MyFunctionalInterface {
        void displayMessage(String message);
    }

    public static void main(String[] args) {
        // Using a lambda expression to implement the functional interface
        MyFunctionalInterface myFunc = (message) -> System.out.println("Message: " + message);

        // Calling the method of the functional interface
        myFunc.displayMessage("Hello, Functional Interface!");
    }
}
