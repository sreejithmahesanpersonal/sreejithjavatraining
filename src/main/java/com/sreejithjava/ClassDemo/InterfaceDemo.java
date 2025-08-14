package com.sreejithjava.ClassDemo;

public class InterfaceDemo {
    // Interface declaration
    interface Animal {
        void sound(); // abstract method
    }

    // Class implementing the interface
    static class Dog implements Animal {
        @Override
        public void sound() {
            System.out.println("Woof Woof");
        }
    }

    static class Cat implements Animal {
        @Override
        public void sound() {
            System.out.println("Meow Meow");
        }
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound(); // Output: Woof Woof

        Animal cat = new Cat();
        cat.sound(); // Output: Meow Meow
    }
}
