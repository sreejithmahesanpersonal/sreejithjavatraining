package com.sreejithjava.BasicPrograms;

public class StringReversal {
    public String reverseString(String input) {
        StringBuilder reversedString = new StringBuilder(input);
        return reversedString.reverse().toString();
    }

    public static void main(String[] args) {
        StringReversal stringReversal = new StringReversal();
        String originalString = "Hello, World!";
        String reversed = stringReversal.reverseString(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversed);
    }

}
