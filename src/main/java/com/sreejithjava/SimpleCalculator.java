package com.sreejithjava;

import java.util.Scanner;

public class SimpleCalculator {
    private double calculated =0;
    private double number01,number02;
    Scanner input;

    SimpleCalculator()
    {
        if(input == null)
        {
            input = new Scanner(System.in);
        }
    }
    public double getCalculated() {
        return calculated;
    }

    public void setCalculated(double calculated) {
        this.calculated = calculated;
    }

    public void setNumber01(double number01) {
        this.number01 = number01;
    }

    public void setNumber02(double number02) {
        this.number02 = number02;
    }

    public double Add()
    {
        setCalculated(number01+number02);
        return getCalculated();
    }
    public double Substract()
    {
        setCalculated(number01-number02);
        return getCalculated();
    }
    public double Multiply()
    {
        setCalculated(number01*number02);
        return getCalculated();
    }
    public double Divide()
    {
        if(number02==0)
        {
            System.out.println("Division by zero not possible");
        }
        else {
            try {
                setCalculated(number01 / number02);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        return getCalculated();
    }


}
