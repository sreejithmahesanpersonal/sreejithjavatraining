package com.sreejithjava.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        // Creating an array of integers
        Integer[] numbers = {5, 2, 8, 1, 3};

        // Using a custom comparator to sort the array in descending order
        java.util.Arrays.sort(numbers, new java.util.Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1); // Descending order
            }
        });

        // Displaying the sorted array
        System.out.println("Sorted Array in Descending Order: ");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // Ascending order
            }
        };
        // Using the custom comparator to sort the array in ascending order
        java.util.Arrays.sort(numbers, com);
        // Displaying the sorted array
        System.out.println("\nSorted Array in Ascending Order: ");
        for (Integer number : numbers) {
            System.out.print(number + " ");



        }
        ArrayList<Integer>  arrList = new ArrayList<Integer>();
        arrList.add(10);
        arrList.add(7);
        arrList.add(9);
        arrList.add(6);
        arrList.add(1);

        arrList.sort(com);
        System.out.println("\nSorted ArrayList in Ascending Order: ");
        for (Integer number : arrList) {
            System.out.print(number + " ");
        }

    }

}
