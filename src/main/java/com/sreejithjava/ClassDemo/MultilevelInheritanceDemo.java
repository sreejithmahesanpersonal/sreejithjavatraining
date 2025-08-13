package com.sreejithjava.ClassDemo;

public class MultilevelInheritanceDemo {
    // Base class
    static class Animal {
        void eat() {
            System.out.println("Animal is eating");
        }
    }

    // Derived class
    static class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking");
        }
    }

    // Further derived class
    static class Puppy extends Dog {
        void weep() {
            System.out.println("Puppy is weeping");
        }
    }

    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();  // Inherited from Animal
        puppy.bark(); // Inherited from Dog
        puppy.weep(); // Defined in Puppy
        System.out.println("Multilevel Inheritance Demo Completed");


    }
}
