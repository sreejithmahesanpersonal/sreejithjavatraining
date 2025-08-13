package com.sreejithjava.ClassDemo;

public class AccessModifiersDemo {
    // Public method
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Private method
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    // Default (package-private) method
    void defaultMethod() {
        System.out.println("This is a default (package-private) method.");
    }

    public static void main(String[] args) {
        AccessModifiersDemo demo = new AccessModifiersDemo();
        demo.publicMethod();
        demo.privateMethod();
        demo.protectedMethod();
        demo.defaultMethod();
    }
}
