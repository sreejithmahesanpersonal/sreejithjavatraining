package com.sreejithjava.BasicPrograms;

public class BinaryToDecimalConversion {
    public static void main(String[] args) {
        String binaryString = "1010"; // Example binary string
        int decimalNumber = convertBinaryToDecimal(binaryString);
        System.out.println("Binary: " + binaryString + " -> Decimal: " + decimalNumber);
    }

    public static int convertBinaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();
        for (int i = 0; i < length; i++) {
            char bit = binary.charAt(length - 1 - i);
            if (bit == '1') {
                decimal += Math.pow(2, i);
            }
        }
        return decimal;
    }
}
