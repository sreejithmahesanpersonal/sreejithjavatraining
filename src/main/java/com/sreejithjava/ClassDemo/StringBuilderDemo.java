package com.sreejithjava.ClassDemo;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // Demonstrating StringBuilder in Java
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Initial StringBuilder: " + sb);

        // Appending to the StringBuilder
        sb.append(" World");
        System.out.println("After appending: " + sb);

        // Inserting into the StringBuilder
        sb.insert(5, ",");
        System.out.println("After inserting: " + sb);

        // Reversing the StringBuilder
        sb.reverse();
        System.out.println("After reversing: " + sb);

        // Deleting a part of the StringBuilder
        sb.delete(0, 6);
        System.out.println("After deleting: " + sb);
    }
}
