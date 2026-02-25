package com.sreejithjava.BasicPrograms;

import java.util.ArrayList;
import java.util.List;

public class PrintCharactersNumberOfTimes {

    int counter = 0;
    List<Character> final_string_list = new ArrayList<Character>();

    public String printCharactersNumberOfTimes(String input_string) {
        char[] charArray = input_string.toCharArray();
        int following_digit;
        for(char c : charArray){
            if(Character.isAlphabetic(c)){
                following_digit = Character.getNumericValue(charArray[counter+1]);
                for(int i = 0; i < following_digit; i++){
                    final_string_list.add(c);
                }

            }
            counter++;
        }
        StringBuilder sb = new StringBuilder();
        for(Character c : final_string_list){
            sb.append(c);
        }
        return (sb.toString());
    }

    public static void main(String[] args) {
        String input_string = "a5b3c2d4z6a3";
        PrintCharactersNumberOfTimes p = new PrintCharactersNumberOfTimes();
        String output_string = p.printCharactersNumberOfTimes(input_string);
        System.out.println(output_string);
    }
}
