package com.sreejithjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String studentName = "";

        System.out.println("Hello World");
        System.out.println("Please enter  the student name :");
        Scanner input = new Scanner(System.in);
        studentName = input.next();
        System.out.println("The student name is :"+ studentName);

    }


}
