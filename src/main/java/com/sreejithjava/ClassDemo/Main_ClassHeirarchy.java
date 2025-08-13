package com.sreejithjava.ClassDemo;

import com.sreejithjava.DecisionMaking.AbstractClassDemo1;

public class Main_ClassHeirarchy {

    //AbstractClassDemo1
   /* public static void main(String[] args) {
        AbstractClassDemo1 cDemo = new AbstractClassDemo1() {
            @Override
            public void display() {
                System.out.println("Mandatory Overriden Implementation  of abstract  method");
            }
        };
        cDemo.display();
    }*/


    //Abs
    public static void main(String[] args) {
        AbstractClassDemo1 abClass = new AbstractClassDemo1() {
            @Override
            public void display() {
                ;
                System.out.println("Mandatory Overriden Implementation of abstract method");
            }
        };
    }
}
