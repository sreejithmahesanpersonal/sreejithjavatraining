package com.sreejithjava.BasicPrograms;

import java.util.*;

public class StringCompression {
    public String initial_String = "a3b5c2a2";
    public String compress_string(String input_string) {
        char[] charArray = input_string.toCharArray();
        Set<Character> charSet = new HashSet<Character>();
        Map<Character,Integer> map_all_items = new HashMap<>();
        int index_of_char = 0;
        int counter = 0;
        int length = charArray.length;
        for (char c : charArray) {
            if(Character.isAlphabetic(c)) {
                if (charSet.contains(c)) {
                    int temp_value = Character.getNumericValue(charArray[counter+1]);
                    int current_value = map_all_items.get(c);
                    int changed_value = temp_value + current_value;
                    map_all_items.replace(c, changed_value);
                }
                else {
                    charSet.add(c);
                    map_all_items.put(c, Character.getNumericValue(charArray[counter + 1]));
                }
            }

            counter++;
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : map_all_items.entrySet()){
            char char_val = entry.getKey();
            int num_val  = entry.getValue();
            sb.append(char_val);
            sb.append(num_val);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StringCompression s = new StringCompression();
        s.initial_String = "a3b5c2a2d4c7a5d6";
        String output_String = s.compress_string(s.initial_String);
        System.out.println(output_String);

    }
}
