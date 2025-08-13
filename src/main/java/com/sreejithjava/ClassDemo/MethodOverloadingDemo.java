package com.sreejithjava.ClassDemo;

public class MethodOverloadingDemo {

    void overloadedMethod(int a) {
        System.out.println("Method with one int parameter: " + a);
    }

    void overloadedMethod(int a, int b) {
        System.out.println("Method with two int parameters: " + a + ", " + b);
    }

    void overloadedMethod(double a) {
        System.out.println("Method with one double parameter: " + a);
    }

    void overloadedMethod(int a, double b) {
        System.out.println("Method with one int and one double parameter: " + a + ", " + b);
    }

    void overloadedMethod(double a, int b) {
        System.out.println("Method with one double and one int parameter: " + a + ", " + b);
    }
}