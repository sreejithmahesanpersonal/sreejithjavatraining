package com.sreejithjava.CollectionFramework;

public class HashMapDemo {
    public static void main(String[] args) {
        // Creating a HashMap
        java.util.HashMap<String, Integer> hashMap = new java.util.HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 3);
        hashMap.put("Date", 4);

        // Displaying the HashMap
        System.out.println("HashMap: " + hashMap);

        // Accessing a value by key
        int appleValue = hashMap.get("Apple");
        System.out.println("Value for Apple: " + appleValue);

        // Checking if a key exists
        boolean containsBanana = hashMap.containsKey("Banana");
        System.out.println("Contains Banana: " + containsBanana);

        // Removing a key-value pair
        hashMap.remove("Cherry");
        System.out.println("After removing Cherry: " + hashMap);

        // Iterating through the HashMap
        System.out.println("Iterating through the HashMap:");
        for (java.util.Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
