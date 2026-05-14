package logic_building.conditional_thinking;

import java.util.Scanner;

// take two number and print larger one 
public class Que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number ");
        int a = sc.nextInt();

        System.out.println("enter 2nd number ");
        int b = sc.nextInt();
        if (a < b) {
            System.out.println("first no is small");
        } else
            System.out.println("2nd num is small");
        sc.close();
    }
}
