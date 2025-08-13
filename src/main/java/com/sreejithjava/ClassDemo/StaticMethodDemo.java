package com.sreejithjava.ClassDemo;

public class StaticMethodDemo {
    int instanceVariable1 = 10; // Instance variable, not accessible in static context
    // Static method to demonstrate static behavior
    public static void displayMessage() {
        System.out.println("This is a static method in StaticMethodDemo class.");
    }
    // Another static method to show that static methods can call other static methods
    public static void anotherStaticMethod() {
        System.out.println("This is another static method calling displayMessage.");
        displayMessage(); // Calling the static method from another static method
    }
    // Static method that performs a utility function
    public static int add(int a, int b) {
        return a + b; // Returns the sum of two integers
    }
    public static void displayInstanceVariables(StaticMethodDemo instance) {
        // Static methods cannot access instance variables directly
        // System.out.println("Instance Variable: " + instanceVariable); // This line would cause an error
        // Uncommenting the above line will cause a compilation error because instance variables are not accessible in static context
        System.out.println("Accessing instance variables requires an instance of the class : " + instance.instanceVariable1);
    }

    public static void main(String[] args) {
        // Calling the static method without creating an instance of the class
        StaticMethodDemo.displayMessage();

        // You can also call it using an instance, but it's not recommended for static methods
        StaticMethodDemo demo = new StaticMethodDemo();
        demo.displayMessage();
        // Static methods can be called directly using the class name
        StaticMethodDemo.displayMessage();
        // Static methods can be called from other static methods
        anotherStaticMethod();
        // Static methods can be called from instance methods, but it's not common practice
        demo.anotherStaticMethod();
        // Static methods can be called from the main method directly
        displayMessage();
        // Static methods can be called from other static methods in the same class
        anotherStaticMethod();
        // Static methods cannot access instance variables or instance methods directly
        // System.out.println(instanceVariable); // This line would cause an error
        // Uncommenting the above line will cause a compilation error because instance variables are not accessible in static context
        // Static methods can access static variables directly
        System.out.println("Static method can access static variables directly.");
        // Static methods can be used to perform utility functions that do not require an instance of the class
        System.out.println("Static methods are often used for utility functions.");
        // Example of a utility function
        int result = add(5, 10);
        System.out.println("Result of addition: " + result);
        // Static methods can be used to perform operations that are not tied to a specific instance
        System.out.println("Static methods can perform operations that are not tied to a specific instance.");
        // Static methods can be used to create factory methods that return instances of the class
        // For example, you can create a static method that returns a new instance of the class
        StaticMethodDemo newInstance = new StaticMethodDemo();
        System.out.println("Created a new instance of StaticMethodDemo: " + newInstance);
        // Static methods can be used to create singleton instances
        // A singleton is a design pattern that restricts the instantiation of a class to one instance
        // In this case, we are not implementing a full singleton pattern, but you can
        // create a static method that returns a single instance of the class
        // For example, you can create a static method that returns a single instance of the class
        // Static methods can be used to perform operations that are not tied to a specific instance
        System.out.println("Static methods can be used to perform operations that are not tied to a specific instance.");
        // Static methods can be used to create utility classes that provide common functionality
        // For example, you can create a utility class with static methods that perform common operations
        // such as string manipulation, mathematical calculations, or data formatting
        // Static methods can be used to create utility classes that provide common functionality
        System.out.println("Static methods can be used to create utility classes that provide common functionality.");
        //Static methods can access the instance variables and methods of the class, but they cannot access them directly
        // They need to create an instance of the class to access instance variables and methods
        // For example, you can create an instance of the class and access instance variables and methods
        StaticMethodDemo instance = new StaticMethodDemo();
        // System.out.println(instance.instanceVariable); // This line would cause an error
        // Uncommenting the above line will cause a compilation error because instance variables are not accessible in static context
        displayInstanceVariables(instance);
    }
}
