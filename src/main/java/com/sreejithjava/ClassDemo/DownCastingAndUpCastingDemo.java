package com.sreejithjava.ClassDemo;
import com.sreejithjava.ClassDemo.InheritanceDemo.*;

public class DownCastingAndUpCastingDemo {
    public static void main(String[] args) {
        // Upcasting
        Animal animal = new Dog(); // Dog is an Animal
        animal.sound(); // Calls the Dog's makeSound method

        // Downcasting
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // Safe downcast
            dog.sound(); // Calls the Dog's makeSound method
        }

        // Attempting downcast to a different type (will cause ClassCastException)
        try {
            //CatforDownCast cat = (CatforDownCast) animal; // This will throw an exception
            //cat.makesound();
            ;
        } catch (ClassCastException e) {
            System.out.println("Cannot downcast to Cat: " + e.getMessage());
        }
    }


}
