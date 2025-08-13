package com.sreejithjava.ClassDemo;

public class PolymorphismDemo {
    // Method overloading example
    public void display(int number) {
        System.out.println("Displaying integer: " + number);
    }

    public void display(String text) {
        System.out.println("Displaying string: " + text);
    }

    public static void main(String[] args) {
        PolymorphismDemo demo = new PolymorphismDemo();
        demo.display(10); // Calls the method with integer parameter
        demo.display("Hello"); // Calls the method with string parameter
    }

}
