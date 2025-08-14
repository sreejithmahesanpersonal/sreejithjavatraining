package com.sreejithjava.CollectionFramework;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Creating a TreeSet
        java.util.TreeSet<String> treeSet = new java.util.TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Date");

        // Displaying the TreeSet
        System.out.println("TreeSet: " + treeSet);

        // Checking if an element exists
        boolean containsBanana = treeSet.contains("Banana");
        System.out.println("Contains Banana: " + containsBanana);

        // Removing an element
        treeSet.remove("Cherry");
        System.out.println("After removing Cherry: " + treeSet);

        // Iterating through the TreeSet
        System.out.println("Iterating through the TreeSet:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }
    }
}
