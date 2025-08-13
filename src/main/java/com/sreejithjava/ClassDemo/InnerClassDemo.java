package com.sreejithjava.ClassDemo;

public class InnerClassDemo {
    // Outer class
    static class OuterClass {
        // Inner class
        static class InnerClass {
            void display() {
                System.out.println("This is an inner class.");
            }
        }

        void createInnerInstance() {
            InnerClass inner = new InnerClass();
            inner.display();
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the outer class
        InnerClassDemo.OuterClass outer = new InnerClassDemo.OuterClass();

        // Calling method to create and display inner class instance
        outer.createInnerInstance();  // Output: This is an inner class.
        // Note: Inner classes can access the members of the outer class,
        // including private members. They are associated with an instance of the outer class,
        // and you need an instance of the outer class to create an instance of the inner class
        // in this case, the `createInnerInstance` method is used to create an instance
        // of the inner class and call its `display` method.

        // This code demonstrates the use of inner classes in Java.
        // It defines an outer class `OuterClass` that contains an inner class `InnerClass
        // The inner class has a method `display` that prints a message.
        // The outer class has a method `createInnerInstance` that creates an instance of the
        // inner class and calls its `display` method.
        // In the `main` method, an instance of the outer class is created,
        // and the `createInnerInstance` method is called to demonstrate the functionality of the inner
        // class. Inner classes are useful for logically grouping classes that are only used in one place
        // and for accessing the members of the outer class directly, including private members.
        // This example illustrates how to define and use inner classes in Java,
        // showing how they can be used to encapsulate functionality that is closely related to the outer
        // class while still allowing access to the outer class's members.

        // Inner classes can also be static, which means they do not require an instance of the outer class
        // to be created. In this case, the inner class can only access static members of the outer class.
        // However, in this example, the inner class is non-static, meaning
        // it is associated with an instance of the outer class and can access both static and non-static
        // members of the outer class.
        // This code is a simple demonstration of how to use inner classes in Java.
        // It shows how to define an inner class within an outer class,
        // how to create an instance of the inner class, and how to call its methods.
        // Inner classes can be useful for encapsulating functionality that is closely related to the outer
        // class, allowing for better organization and readability of the code.
        // Additionally, inner classes can access the members of the outer class directly,
        // including private members, which can be useful for implementing certain design patterns
        // or for creating more cohesive and maintainable code structures.
        // This code demonstrates the use of inner classes in Java.
        // It defines an outer class `OuterClass` that contains an inner class `InnerClass
        // The inner class has a method `display` that prints a message.
        // The outer class has a method `createInnerInstance` that creates an instance of the
        // inner class and calls its `display` method.
        // In the `main` method, an instance of the outer class is created,
        // and the `createInnerInstance` method is called to demonstrate the functionality of the inner

InnerClassDemo.OuterClass.InnerClass inner = new InnerClassDemo.OuterClass.InnerClass();
        inner.display();  // Output: This is an inner class.
        // Note: Inner classes can access the members of the outer class,
        // including private members. They are associated with an instance of the outer class,
        // and you need an instance of the outer class to create an instance of the inner class
        // in this case, the `createInnerInstance` method is used to create an instance
        // of the inner class and call its `display` method.

    }
}