package com.sreejithjava.BasicPrograms;

public class FindLCM {
    public int calculateLCM(int num1, int num2) {
        int lcm = (num1 > num2) ? num1 : num2;

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                break;
            }
            lcm++;
        }
        return lcm;
    }

    // Main Function
    public static void main(String[] args) {
        FindLCM lcmObj = new FindLCM();
        int num1 = 12;
        int num2 = 15;
        int lcm = lcmObj.calculateLCM(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
