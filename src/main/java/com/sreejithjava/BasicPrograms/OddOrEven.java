package com.sreejithjava.BasicPrograms;

public class OddOrEven {
    public void checkOddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }

    // Main Function
    public static void main(String[] args) {
        OddOrEven oddOrEvenObj = new OddOrEven();
        oddOrEvenObj.checkOddOrEven(10);
        oddOrEvenObj.checkOddOrEven(7);
    }
}
