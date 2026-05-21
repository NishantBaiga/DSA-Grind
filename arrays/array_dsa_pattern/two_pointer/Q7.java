package arrays.array_dsa_pattern.two_pointer;

import java.util.Arrays;

// merge two sorted array . leetcode 88
// size of arr1 is m + n and size of arr2 is n . m is a elements in arr1 and n is element in arr2 also size of arr2.
// without using extra space.
public class Q7 {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solver = new Solution();

        int[] arr1 = { 1, 2, 3, 0, 0, 0 }; // this must be M + N
        int[] arr2 = { 2, 5, 6 };

        int m = 3;
        int n = 3;

        // brute force
        solver.bruteForce(arr1, m, arr2, n);
        // optimize
        // solver.merge(arr1, m, arr2, n);

        System.out.println(Arrays.toString(arr1));
    }
}

// optimize using two pointer. with time M+N and space O(1)
class Solution {
    // add elements of 2nd array to 1st and the sort the array.
    public void bruteForce(int[] arr1, int m, int[] arr2, int n) {
        for (int i = 0; i < n; i++) {
            arr1[m + i] = arr2[i];
        }

        Arrays.sort(arr1);
    }

    // using two pointer
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int idx = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while (i >= 0 && j >= 0) {
            if (arr1[i] >= arr2[j]) {
                arr1[idx] = arr1[i];
                idx--;
                i--;
            } else {
                arr1[idx] = arr2[j];
                idx--;
                j--;
            }
        }
        // if we have remaining element in arr2
        while (j >= 0) {
            arr1[idx] = arr2[j];
            idx--;
            j--;
        }
        // if we have remaining element in arr1
        while (i >= 0) {
            arr1[idx] = arr1[i];
            idx--;
            i--;
        }
    }
}
