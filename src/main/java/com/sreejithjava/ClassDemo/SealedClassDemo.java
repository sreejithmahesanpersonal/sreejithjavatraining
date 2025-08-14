package com.sreejithjava.ClassDemo;

public class SealedClassDemo {
    // Sealed class declaration
    public sealed class Shape permits Circle, Rectangle {
        public void draw() {
            System.out.println("Drawing a shape");
        }
    }

    // Permitted subclass Circle
    public final class Circle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a circle");
        }
    }

    // Permitted subclass Rectangle
    public final class Rectangle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a rectangle");
        }
    }

    public static void main(String[] args) {
        SealedClassDemo demo = new SealedClassDemo();
        Shape circle = demo.new Circle();
        Shape rectangle = demo.new Rectangle();

        circle.draw();      // Output: Drawing a circle
        rectangle.draw();   // Output: Drawing a rectangle
    }
}
