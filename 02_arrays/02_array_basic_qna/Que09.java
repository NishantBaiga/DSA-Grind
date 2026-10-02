package arrays.array_basic_qna;

import java.util.Scanner;

// input an element and check if it is exist in array or not
public class Que09 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5, 5, 6, 6, 7, 8, 9, 10 };

        Scanner sc = new Scanner(System.in);
        System.out.println("enter element :");
        int n = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (i == n) {
                found = true;
                break;
            }
        }
        sc.close();

        if (found) {
            System.out.println("exist ");
        } else {
            System.out.println("not exist ");

        }

    }
}
