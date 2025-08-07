package com.sreejithjava.DecisionMaking;

public class ForLoopDemo {
    public static void main(String[] args) {
        // For loop to print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
        }

        // For loop to calculate the sum of first 10 natural numbers
        int sum = 0;
        for (int j = 1; j <= 10; j++) {
            sum += j;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

        // For loop with an array
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
