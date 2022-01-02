package com.sreejithjava.DecisionMaking;
import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {
        System.out.println("Which is the first even  number ?");
        Scanner input  = new Scanner(System.in);
        int answer;
        boolean  assertValue = false;

        while(!assertValue)
        {
            answer = input.nextInt();
            switch (answer)
            {
                case 0:
                {
                    System.out.println("Answer is correct : 0");
                    assertValue = true;
                    break;
                }
                case 1:
                {
                    System.out.println("You are near");
                    break;
                }
                case 2:
                {
                    System.out.println("You are almost there");
                    break;
                }
                default:
                {
                    System.out.println("Guess again");
                }

            }

        }



    }
}
