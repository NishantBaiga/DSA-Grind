package logic_building.question_related_to_digit_and_math;

import java.util.Scanner;

// check if number is perfect number or not.
// A perfect number is a positive integer that is exactly equal to the sum of its proper positive divisors
// example 6 , divisors = 1 + 2 + 3 =6 
public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
                System.out.println(i);
            }
        }

        if (sum == n) {
            System.out.println("perfect number");
        } else {
            System.out.println("not a perfect number");

        }

        sc.close();
    }
}
