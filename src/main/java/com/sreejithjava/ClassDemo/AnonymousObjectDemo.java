package com.sreejithjava.ClassDemo;

public class AnonymousObjectDemo {
    public static void main(String[] args) {
        // Creating an anonymous object to call the method directly
        new AnonymousObjectDemo().displayMessage();
    }

    // Method to display a message
    public void displayMessage() {
        System.out.println("This is an example of an anonymous object in Java.");
    }
    // Note: Anonymous objects are typically used when you want to call a method without needing to keep a reference to the object.
    // They are often used in event handling or when passing an object as an argument to a method.


}
