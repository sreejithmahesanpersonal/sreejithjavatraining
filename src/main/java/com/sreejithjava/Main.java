package com.sreejithjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String studentName = "";

    /*    System.out.println("Hello World");
        System.out.println("Please enter  the student name :");
        Scanner input = new Scanner(System.in);
        studentName = input.next();
        System.out.println("The student name is :"+ studentName);
*/

        Scanner input = new Scanner(System.in);
        double result =0;
        boolean exitProgram =false;
        SimpleCalculator calc = new SimpleCalculator();

        while(!exitProgram) {
            System.out.println("Enter Number1");
            calc.setNumber01(input.nextDouble());

            System.out.println("Enter Number2");
            calc.setNumber02(input.nextDouble());

            System.out.println("Enter operation");
            switch (input.next()) {
                case "Add": {
                    result = calc.Add();
                    break;
                }
                case "Substract": {
                    result = calc.Substract();
                    break;
                }
                case "Multiply": {
                    result = calc.Multiply();
                    break;
                }
                case "Divide": {
                    result = calc.Divide();
                    break;
                }
                default: {
                    System.out.println("Unidentified operation");
                }
            }
            System.out.println("Result is: " + result);
            System.out.println("Type true to Exit");
            exitProgram = input.nextBoolean();
        }

    }


}
