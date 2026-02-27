package com.sreejithjava.BasicPrograms;

public class ReturnSumOfWeightOfCharactersInString {
    public static void main(String[] args) {
        String input = "abccba";
        int sumOfWeights = calculateSumOfWeights(input);
        System.out.println("The sum of weights of characters in the string \"" + input + "\" is: " + sumOfWeights);
    }

    public static int calculateSumOfWeights(String str) {
        int sum = 0;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str));
        String reversedString = stringBuilder.reverse().toString();
        if (str.compareTo(reversedString) == 0) {
            System.out.println("The string is a palindrome.");
            for (char c : str.toCharArray()) {
                sum += (c - 'a' + 1); // Assuming 'a' has a weight of 1, 'b' has 2, ..., 'z' has 26
            }
        } else {
            System.out.println("The string is not a palindrome.");
        }

        return sum;
    }
}
