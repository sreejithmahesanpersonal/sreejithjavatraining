package com.sreejithjava.BasicPrograms;

public class DecimalToBinaryConversion {
    public static void main(String[] args) {
        int decimalNumber = 10; // Example decimal number
        String binaryString = convertDecimalToBinary(decimalNumber);
        System.out.println("Decimal: " + decimalNumber + " -> Binary: " + binaryString);
    }

    public static String convertDecimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.append(remainder);
            decimal /= 2;
        }
        return binary.reverse().toString();
    }
}
