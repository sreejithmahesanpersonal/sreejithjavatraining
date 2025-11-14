package com.sreejithjava;

import java.util.ArrayList;

public class TestFIS {
    public static void main(String[] args) {
//reverse a string
        String str = "Hello World";
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversedStr);

        //reverse string using chararray
        char[] charArray = str.toCharArray();
        String reversedStr2 = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedStr2 += charArray[i];

        }

//reverse string using arraylist
        ArrayList<Character> charList = new ArrayList<>();
        for (char c : charArray) {
            charList.add(c);
        }
        String reversedStr3 = "";
        for (int i = charList.size() - 1; i >= 0; i--) {
            reversedStr3 += charList.get(i);
        }
        System.out.println("Reversed string using char array: " + reversedStr2);
        System.out.println("Reversed string using array list: " + reversedStr3);
    }
}



