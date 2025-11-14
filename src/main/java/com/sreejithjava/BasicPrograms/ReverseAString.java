package com.sreejithjava.BasicPrograms;

public class ReverseAString {

    public void reverseUsingcharAt(String originalString)
    {
        String reversedString = "";
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }

    public void reverseUsingStringBuffer(String originalString)
    {
        StringBuilder reversedStringBuilder = new StringBuilder(originalString);
        reversedStringBuilder.reverse();
        String reversedString = reversedStringBuilder.toString();
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }

public void reverseUsingCharArray(String originalString)
{
    char originalStringArr[] = originalString.toCharArray();
    System.out.print("The original string is : ");
    for(char c:originalStringArr)
    {
        System.out.print(c + " ");
    }
    System.out.println("");
    System.out.print("The reversed string is : ");
    for(int i=originalStringArr.length-1;i>=0;i--)
    {
        System.out.print(originalStringArr[i]);
    }

}


    //Main Function
    public static void main(String[] args) {
     ReverseAString revobj = new ReverseAString();
     revobj.reverseUsingcharAt("My Name is Sreejith");
     revobj.reverseUsingStringBuffer("Java Programming");
     revobj.reverseUsingCharArray("Sreejith");
    }


}
