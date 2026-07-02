package arrays.array_dsa_pattern.two_pointer.twoSum.unsortedInput;

import java.util.Arrays;
import java.util.HashMap;

// Find all pairs with a given sum in two unsorted arrays

// Given two unsorted arrays of distinct elements, the task is to find all pairs from both arrays whose sum is equal to a given value X.

// Examples: 

// Input: arr1[] = {-1, -2, 4, -6, 5, 7}, arr2[] = {6, 3, 4, 0} , x = 8
// Output: 4 4 5 3

// Input: arr1[] = {1, 2, 4, 5, 7}, arr2[] = {5, 6, 3, 4, 8}, x = 9
// Output: 1 8 4 5 5 4
public class q6 {

    static void bruteForce(int[] A, int[] B, int m, int n, int target) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] + B[j] == target) {
                    System.out.println(A[i] + " " + B[j]);
                }
            }
        }
    }

    static void two_pointer(int[] A, int[] B, int m, int n, int target) {
        Arrays.sort(A);
        Arrays.sort(B);

        int left = 0, right = B.length - 1;

        while (left < A.length && right >= 0) {

            int sum = A[left] + B[right];

            if (sum == target) {
                System.out.println(A[left] + "," + B[right]);
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }

        }

    }

    static void hashing(int[] A, int[] B, int m, int n, int target) {

        HashMap<Integer, Integer> set = new HashMap<>();

        for (int i = 0; i < m; i++) {
            set.put(A[i], 0);
        }

        for (int j = 0; j < n; j++) {
            int complement = target - B[j];
            if (set.containsKey(complement)) {
                System.out.println(complement + " " + B[j]);
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = { -1, -2, 4, -6, 5, 7 }, arr2[] = { 6, 3, 4, 0 }, x = 8;

        bruteForce(arr1, arr2, arr1.length, arr2.length, x);
        two_pointer(arr1, arr2, arr1.length, arr2.length, x);
        hashing(arr1, arr2, arr1.length, arr2.length, x);
    }
}
