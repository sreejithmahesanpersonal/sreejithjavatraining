package com.sreejithjava.BasicPrograms;

public class MultiplyTwoFloatingPointNumbers {
    public void multiply(float num1, float num2) {
        float result = num1 * num2;
        System.out.println("The multiplication of " + num1 + " and " + num2 + " is: " + result);
    }

    // Main Function
    public static void main(String[] args) {
        MultiplyTwoFloatingPointNumbers multiplyObj = new MultiplyTwoFloatingPointNumbers();
        multiplyObj.multiply(5.5f, 4.2f);
        multiplyObj.multiply(3.14f, 2.0f);
    }
}
