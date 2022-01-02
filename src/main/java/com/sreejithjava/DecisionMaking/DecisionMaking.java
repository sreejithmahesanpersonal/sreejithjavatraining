package com.sreejithjava.DecisionMaking;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter  your age");
        age = input.nextInt();
        if(age>18)
        {
            System.out.println("You can vote");
        }
        else
        {
            System.out.println("You are a minor");
        }

    }
}
