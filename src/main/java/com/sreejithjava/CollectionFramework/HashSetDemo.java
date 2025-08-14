package com.sreejithjava.CollectionFramework;

public class HashSetDemo {
    public static void main(String[] args) {
        // Creating a HashSet
        java.util.HashSet<String> hashSet = new java.util.HashSet<>();

        // Adding elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple"); // Duplicate element, will not be added

        // Displaying the HashSet
        System.out.println("HashSet: " + hashSet);

        // Checking if an element exists
        boolean containsBanana = hashSet.contains("Banana");
        System.out.println("Contains Banana: " + containsBanana);

        // Removing an element
        hashSet.remove("Cherry");
        System.out.println("After removing Cherry: " + hashSet);

        // Iterating through the HashSet
        System.out.println("Iterating through the HashSet:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }
    }
}
