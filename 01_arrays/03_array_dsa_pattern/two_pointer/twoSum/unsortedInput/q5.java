package arrays.array_dsa_pattern.two_pointer.twoSum.unsortedInput;

import java.util.Arrays;

// Smallest Difference pair of values between two unsorted Arrays

// Given two arrays of integers, compute the pair of values (one value in each array) with the smallest (non-negative) difference. Return the difference.

// Examples : 

// Input : A[] = {1, 3, 15, 11, 2}
//         B[] = {23, 127, 235, 19, 8} 
// Output : 3  
// That is, the pair (11, 8) 
// Input : A[] = {10, 5, 40}
//         B[] = {50, 90, 80} 
// Output : 10
// That is, the pair (40, 50)

public class q5 {

    static int bruteForce(int[] arr1, int[] arr2, int m, int n) {
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                int diff = Math.abs(arr1[i] - arr2[j]);
                if (diff < minDiff) {  // if current difference is less then min 
                    minDiff = diff;
                }
            }
        }

        return minDiff;
    }

    static int two_pointer(int[] arr1, int[] arr2, int m, int n) {

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int minDiff = Integer.MAX_VALUE;
        int left = 0, right =0;
        while (left < m & right < n) {
            int diff = Math.abs(arr1[left]-arr2[right]);
            if(diff < minDiff){
                minDiff =  diff;
            } 

            if (arr1[left] < arr2[right]) {
                left ++;
            }else{
                right++;
            }
        }

        return minDiff;
    }

    public static void main(String[] args) {
        // Input given array A
        // int[] A = { 1, 2, 11, 5 };
        int[] A = { 1, 3, 15, 11, 2 };

        // Input given array B
        // int[] B = { 4, 12, 19, 23, 127, 235 };
        int[] B = { 23, 127, 235, 19, 8 };

        // Calculate size of both arrays
        int m = A.length;
        int n = B.length;

        // System.out.println(bruteForce(A, B, m, n));
        System.out.println(two_pointer(A, B, m, n));

    }
}
