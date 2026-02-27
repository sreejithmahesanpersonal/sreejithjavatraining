package com.sreejithjava.BasicPrograms;

public class Palindrome {
    public boolean isPalindrome(String input) {
        StringBuilder reversedString = new StringBuilder(input);
        return input.equals(reversedString.reverse().toString());
    }

    public static void main(String[] args) {
        Palindrome palindromeObj = new Palindrome();
        String testString1 = "madam";
        String testString2 = "hello";

        System.out.println(testString1 + " is a palindrome: " + palindromeObj.isPalindrome(testString1));
        System.out.println(testString2 + " is a palindrome: " + palindromeObj.isPalindrome(testString2));
    }

}
