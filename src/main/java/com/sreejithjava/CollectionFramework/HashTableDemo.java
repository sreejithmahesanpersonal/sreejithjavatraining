package com.sreejithjava.CollectionFramework;

public class HashTableDemo {
    public static void main(String[] args) {
        // Creating a Hashtable
        java.util.Hashtable<String, Integer> hashtable = new java.util.Hashtable<>();

        // Adding key-value pairs to the Hashtable
        hashtable.put("Apple", 1);
        hashtable.put("Banana", 2);
        hashtable.put("Cherry", 3);
        hashtable.put("Date", 4);

        // Displaying the Hashtable
        System.out.println("Hashtable: " + hashtable);

        // Checking if a key exists
        boolean containsBanana = hashtable.containsKey("Banana");
        System.out.println("Contains Banana: " + containsBanana);

        // Retrieving a value by key
        int cherryValue = hashtable.get("Cherry");
        System.out.println("Value for Cherry: " + cherryValue);

        // Removing a key-value pair
        hashtable.remove("Date");
        System.out.println("After removing Date: " + hashtable);

        // Iterating through the Hashtable
        System.out.println("Iterating through the Hashtable:");
        for (java.util.Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
