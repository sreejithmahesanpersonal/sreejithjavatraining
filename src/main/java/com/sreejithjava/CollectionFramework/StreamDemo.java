package com.sreejithjava.CollectionFramework;

public class StreamDemo {
    public static void main(String[] args) {
        // Creating a list of integers
        java.util.List<Integer> numbers = java.util.Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using streams to filter even numbers and print them
        System.out.println("Even numbers:");
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);

        // Using streams to calculate the sum of all numbers
        int sum = numbers.stream()
                         .mapToInt(Integer::intValue)
                         .sum();
        System.out.println("Sum of all numbers: " + sum);
    }
}
