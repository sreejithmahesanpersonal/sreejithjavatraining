package com.sreejithjava.ClassDemo;

public class AnonymousClassDemo {
    // Abstract class
    abstract static class Animal {
        abstract void sound();
    }

    public static void main(String[] args) {
        // Creating an anonymous class that extends the abstract class
        Animal myDog = new Animal() {
            @Override
            void sound() {
                System.out.println("Bark");
            }
        };

        // Calling the method of the anonymous class
        myDog.sound();  // Output: Bark
    }
    // Note: Anonymous classes are used to create a one-time use class that extends or implements another class or interface.
    // They are often used for event handling or when you need a simple implementation without creating a separate named class.
    // In this example, we define an abstract class `Animal` with an abstract method `sound`.
    // We then create an anonymous class that extends `Animal` and provides an implementation for
    // the `sound` method. This allows us to create an instance of `Animal`
    // without needing to define a separate named class for it.
    // Anonymous classes can be useful for creating quick implementations of interfaces or abstract classes,
    // especially when the implementation is simple and does not require a full class definition.
    // They can also be used to override methods of existing classes or interfaces
    // without the need to create a new named class, making the code more concise and easier to read.
    // This code demonstrates the use of anonymous classes in Java.


}
