package com.sreejithjava.ClassDemo;

public class StaticVariableDemo {

    // Static variable
    static int staticVariable = 10;

    // Instance variable
    int instanceVariable = 20;

    static void printStaticVariable() {
        System.out.println("Static Variable from static method: " + staticVariable);
    }
    // Instance method
    void printInstanceVariable() {
        System.out.println("Instance Variable from instance method: " + instanceVariable);
    }

    public static void main(String[] args) {
        // Accessing static variable directly
        System.out.println("Static Variable: " + staticVariable);

        // Creating an instance of the class to access instance variable
        StaticVariableDemo demo = new StaticVariableDemo();
        System.out.println("Instance Variable: " + demo.instanceVariable);
        // Modifying static variable
        staticVariable = 30;
        System.out.println("Modified Static Variable: " + staticVariable);
        // Modifying instance variable
        demo.instanceVariable = 40;
        System.out.println("Modified Instance Variable: " + demo.instanceVariable);
        // Accessing static variable through class name
        System.out.println("Accessing Static Variable through class name: " + StaticVariableDemo.staticVariable);
        // Accessing instance variable through object reference
        System.out.println("Accessing Instance Variable through object reference: " + demo.instanceVariable);
        // Static variable can be accessed without creating an instance of the class
        System.out.println("Accessing Static Variable without instance: " + StaticVariableDemo.staticVariable);
        // Instance variable requires an instance of the class to be accessed
        // System.out.println("Accessing Instance Variable without instance: " + StaticVariableDemo.instanceVariable); // This line would cause an error
        // Uncommenting the above line will cause a compilation error because instanceVariable is not static
        // Static variables are shared among all instances of the class
        StaticVariableDemo demo2 = new StaticVariableDemo();
        demo2.staticVariable = 50; // Modifying static variable through another instance
        System.out.println("Static Variable after modification through demo2: " + StaticVariableDemo.staticVariable);
        // Instance variable is unique to each instance
        System.out.println("Instance Variable of demo2: " + demo2.instanceVariable);
        // Static variables can be accessed in static methods
        printStaticVariable();
        // Instance variables cannot be accessed in static methods without an instance
        // System.out.println("Instance Variable in static method: " + instanceVariable); // This line would cause an error
        // Uncommenting the above line will cause a compilation error because instance
    }
}
