package com.sreejithjava.ClassDemo;

public class WrapperClassDemo {
    public static void main(String[] args) {
        // Creating wrapper objects
        Integer intObj = Integer.valueOf(10);
        Double doubleObj = Double.valueOf(20.5);
        Character charObj = Character.valueOf('A');

        // Unboxing
        int intValue = intObj.intValue();
        double doubleValue = doubleObj.doubleValue();
        char charValue = charObj.charValue();

        // Displaying values
        System.out.println("Integer Value: " + intValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Character Value: " + charValue);
    }
}
