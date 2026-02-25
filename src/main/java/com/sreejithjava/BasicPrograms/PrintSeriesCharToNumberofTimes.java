package com.sreejithjava.BasicPrograms;

public class PrintSeriesCharToNumberofTimes {
    String a = "a2b3c4d6a2";

        public static void main(String[] args) {
            String input = "a2b3c4d6a7";
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                // If the current character is a letter
                if (Character.isLetter(ch)) {
                    StringBuilder numStr = new StringBuilder();
                    int j = i + 1;

                    // Collect all subsequent digits (handles multi-digit numbers like a12)
                    while (j < input.length() && Character.isDigit(input.charAt(j))) {
                        numStr.append(input.charAt(j));
                        j++;
                    }

                    // Convert the collected digits to an integer
                    if (numStr.length() > 0) {
                        int count = Integer.parseInt(numStr.toString());
                        // Append the character 'count' times
                        for (int k = 0; k < count; k++) {
                            result.append(ch);
                        }
                    }

                    // Move the outer loop index to the end of the number we just processed
                    i = j - 1;
                }
            }

            System.out.println("Input: " + input);
            System.out.println("Output: " + result.toString());
        }
    }



