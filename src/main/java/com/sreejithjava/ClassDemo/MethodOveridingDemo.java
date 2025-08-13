package com.sreejithjava.ClassDemo;

public class MethodOveridingDemo {
    public void display() {
        System.out.println("This is the parent class method");
    }

    public static void main(String[] args) {
        MethodOveridingDemo parent = new MethodOveridingDemo();
        parent.display();

        ChildClass child = new ChildClass();
        child.display();

    }
    }
class ChildClass extends MethodOveridingDemo {
    @Override
    public void display() {
        System.out.println("This is the child class method, overriding the parent class method");
    }

}
