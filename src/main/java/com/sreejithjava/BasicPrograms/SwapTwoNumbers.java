package com.sreejithjava.BasicPrograms;

public class SwapTwoNumbers{
    public void swapUsingThirdVariable(int a, int b)
    {
        System.out.println("Before Swapping: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping using third variable: a = " + a + ", b = " + b);
    }

    public void swapWithoutThirdVariable(int a, int b)
    {
        System.out.println("Before Swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping without third variable: a = " + a + ", b = " + b);
    }

    //Main Function
    public static void main(String[] args) {
        SwapTwoNumbers swapObj = new SwapTwoNumbers();
        swapObj.swapUsingThirdVariable(5, 10);
        swapObj.swapWithoutThirdVariable(15, 25);
    }

}
