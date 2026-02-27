package com.sreejithjava.BasicPrograms;

public class FindHCF {
    public int calculateHCF(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    // Main Function
    public static void main(String[] args) {
        FindHCF hcfObj = new FindHCF();
        int num1 = 48;
        int num2 = 15;
        int hcf = hcfObj.calculateHCF(num1, num2);
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }
}
