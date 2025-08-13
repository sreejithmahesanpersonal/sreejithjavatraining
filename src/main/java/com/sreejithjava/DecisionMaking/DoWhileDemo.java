package com.sreejithjava.DecisionMaking;

import java.util.Scanner;

public class DoWhileDemo
{
    public static void main(String[] args) {
        int exitValue = 0;
        int counter=0,counterWhile =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter exit number (any value greater than 10) to exit the loop");
        exitValue= input.nextInt();
        do {
            System.out.println("Do executes atleast once whatever the condition  in while");
            exitValue++;
            counter++;
           System.out.println("Do executes " + counter + " times");
        }
        while(exitValue  < 10);
        {
            exitValue++;
            counterWhile++;
            System.out.println("While executes " + counterWhile + " times");
            if (exitValue < 10) {
                System.out.println("repeat while loop");
            } else {
                System.out.println("Exiting  while loop");
            }

        }
    }
}
