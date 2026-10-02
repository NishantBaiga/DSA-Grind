package logic_building.looping_and_pattern;

import java.util.Scanner;

// print the sum of first natural number 
public class Q5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }
}
