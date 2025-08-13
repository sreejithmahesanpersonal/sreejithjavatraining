package com.sreejithjava.ClassDemo;

public class FinalKeywordDemo {
    // Final variable
    final int finalVariable = 10;

    // Final method
    public final void finalMethod() {
        System.out.println("This is a final method.");
    }

    // Final class
    public static final class FinalClass {
        public void display() {
            System.out.println("This is a final class.");
        }
    }

    public static void main(String[] args) {
        FinalKeywordDemo demo = new FinalKeywordDemo();
        System.out.println("Final Variable: " + demo.finalVariable);
        demo.finalMethod();

        FinalClass finalClass = new FinalClass();
        finalClass.display();
    }
}
