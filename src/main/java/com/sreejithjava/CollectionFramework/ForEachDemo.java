package com.sreejithjava.CollectionFramework;

public class ForEachDemo {
    public static void main(String[] args) {
        // Creating an array of integers
        Integer[] numbers = {1, 2, 3, 4, 5};

        // Using forEach to iterate through the array and print each element
        System.out.println("Using forEach to iterate through the array:");
        java.util.Arrays.stream(numbers).forEach(number -> System.out.print(number + " "));

        // Using forEach with a lambda expression to modify each element
        System.out.println("\nUsing forEach with a lambda expression to modify each element:");
        java.util.Arrays.stream(numbers).map(number -> number * 2).forEach(number -> System.out.print(number + " "));
    }
}
