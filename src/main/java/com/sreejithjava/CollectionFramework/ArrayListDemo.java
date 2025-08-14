package com.sreejithjava.CollectionFramework;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Creating an ArrayList
        java.util.ArrayList<String> list = new java.util.ArrayList<>();

        // Adding elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Displaying the ArrayList
        System.out.println("ArrayList: " + list);

        // Accessing elements
        String firstElement = list.get(0);
        System.out.println("First Element: " + firstElement);

        // Removing an element
        list.remove("Banana");
        System.out.println("After removing Banana: " + list);

        // Iterating through the ArrayList
        System.out.println("Iterating through the ArrayList:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
