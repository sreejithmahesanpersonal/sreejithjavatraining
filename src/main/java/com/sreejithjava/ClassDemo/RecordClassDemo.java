package com.sreejithjava.ClassDemo;

public class RecordClassDemo {
    // Record class declaration
    // A record class is a special kind of class in Java that is used to model immutable data.
    // It automatically provides implementations for equals(), hashCode(), and toString() methods.
    public record Person(String name, int age) {
        // Custom method in the record class
        public String greeting() {
            return "Hello, my name is " + name + " and I am " + age + " years old.";
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the record class
        Person person = new Person("John Doe", 30);

        // Accessing the fields of the record class
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());

        // Calling the custom method
        System.out.println(person.greeting());
    }
}
