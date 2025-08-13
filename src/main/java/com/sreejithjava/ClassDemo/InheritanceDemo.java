package com.sreejithjava.ClassDemo;

public class InheritanceDemo {
    // Base class
    public static class Animal {
        public void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    // Derived class
    public static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Dog barks");
        }
    }

    // Another derived class
    public static class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("Cat meows");
        }
    }

    // Main method to demonstrate inheritance
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Upcasting
        Animal myCat = new Cat(); // Upcasting
        myDog.sound(); // Calls Dog's sound method
        myCat.sound(); // Calls Cat's sound method
    }
}