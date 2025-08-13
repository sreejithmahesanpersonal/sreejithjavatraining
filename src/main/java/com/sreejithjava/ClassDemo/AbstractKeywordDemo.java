package com.sreejithjava.ClassDemo;

public class AbstractKeywordDemo {
    // Abstract class
    abstract static class Animal {
        // Abstract method
        abstract void sound();

        // Regular method
        void sleep() {
            System.out.println("Sleeping...");
        }
    }

    // Concrete class extending the abstract class
    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Bark");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the concrete class
        Animal myDog = new Dog();

        // Calling methods
        myDog.sound();  // Output: Bark
        myDog.sleep();  // Output: Sleeping...
    }
    // Note: Abstract classes cannot be instantiated directly.
    // They are meant to be subclassed, and their abstract methods must be implemented in the
    // subclasses to create concrete objects.
    // This example demonstrates the use of the abstract keyword to define an abstract class
    // and an abstract method, which must be implemented by any concrete subclass.

    // The abstract class can also contain regular methods with implementations.
    // In this case, the `sleep` method is a regular method that can be used
    // by any subclass of `Animal`, including `Dog`.
    // The `Dog` class provides a concrete implementation of the `sound` method,
    // which is required because `Animal` has declared it as an abstract method.
    // When you run the `main` method, it creates an instance of `Dog`
    // and calls both the `sound` and `sleep` methods, demonstrating polymorphism
    // and the use of abstract classes in Java.
    // This code is a simple demonstration of how to use the abstract keyword in Java.
    // It shows how to define an abstract class with an abstract method,
    // how to extend that class in a concrete subclass, and how to implement the abstract method
    // in the subclass. It also illustrates how to create an instance of the subclass
    // and call both the abstract method and a regular method defined in the abstract class.


}
