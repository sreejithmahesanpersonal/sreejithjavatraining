package com.sreejithjava.DecisionMaking;
import java.util.Scanner;

public class WhileDemo {

    public static void main(String[] args) {
        int exitValue = 0;
        Scanner input = new Scanner(System.in);
        while(exitValue  < 10) {
            System.out.println("Please enter exit number (any value greater than 10 ");
            exitValue = input.nextInt();
            if(exitValue < 10)
            {
                System.out.println("repeat while loop again");
            }
            else
            {
                System.out.println("Exiting  while loop");
            }
        }

    }
}
