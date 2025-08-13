package com.sreejithjava.ClassDemo;

public class StringBufferDemo {
    public static void main(String[] args) {
        // Demonstrating StringBuffer in Java
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Initial StringBuffer: " + sb);

        // Appending to the StringBuffer
        sb.append(" World");
        System.out.println("After appending: " + sb);

        // Inserting into the StringBuffer
        sb.insert(5, ",");
        System.out.println("After inserting: " + sb);

        // Reversing the StringBuffer
        sb.reverse();
        System.out.println("After reversing: " + sb);

        // Deleting a part of the StringBuffer
        sb.delete(0, 6);
        System.out.println("After deleting: " + sb);
    }


}
