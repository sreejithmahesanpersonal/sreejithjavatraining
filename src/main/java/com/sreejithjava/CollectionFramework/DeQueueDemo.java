package com.sreejithjava.CollectionFramework;

import java.util.Iterator;

public class DeQueueDemo {
    public static void main(String[] args) {
        // Creating a Deque
        java.util.Deque<String> deque = new java.util.ArrayDeque<>();

        // Adding elements to the Deque
        deque.add("Apple");
        deque.add("Banana");
        deque.add("Cherry");
        deque.addFirst("Mango"); // Adding at the front
        deque.addLast("Date"); // Adding at the end

        // Displaying the Deque
        System.out.println("Deque: " + deque);

        // Accessing elements
        String firstElement = deque.getFirst();
        String lastElement = deque.getLast();
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // Removing elements
        deque.removeFirst(); // Removes "Mango"
        deque.removeLast(); // Removes "Date"
        System.out.println("After removing first and last: " + deque);

        // Iterating through the Deque
        System.out.println("Iterating through the Deque:");
        for (String fruit : deque) {
            System.out.println(fruit);
        }

        Iterator <String> iterator = deque.iterator();
        System.out.println("Using Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
