package logic_building.strings;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String input = sc.nextLine();


        //  print string length 
        System.out.println(input +" " + "length of string is :" + " " + input.length());


        // get string first and last character
        if (!input.isEmpty()) {
           char f = input.charAt(0);
           char l= input.charAt(input.length()-1);
            System.out.println("first char : " +  f + " and last char is : " + l );
        } else {
            System.err.println("empty string");
        }

        // convert strint to uppercase and lower case
        System.out.println(" upper " + input.toUpperCase());
        System.out.println(" lower " + input.toLowerCase());

        // remove all space and get length
        System.out.println(input.replace(" ", ""));
        System.out.println(input.replace(" ", "").length());


        sc.close();
    }
}
