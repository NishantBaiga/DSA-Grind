package arrays.array_dsa_pattern.two_pointer.twoSum.unsortedInput;

import java.util.Arrays;
import java.util.HashSet;

// 2sum (pair with given sum )

//Given an array arr[] of n integers and a target value, check if there exists a pair whose sum equals the target. This is a variation of the 2-Sum problem.

// Examples: 

// Input: arr[] = [0, -1, 2, -3, 1], target = -2
// Output: true
// Explanation: There is a pair (1, -3) with the sum equal to given target, 1 + (-3) = -2.

// Input: arr[] = [1, -2, 1, 0, 5], target = 0
// Output: false
// Explanation: There is no pair with sum equals to given target.


// same as leetcode question 1 but we have to return index. when we have to return index we can not use sorting . and if array is not already sorted and we can not sort then we can not use two pointer , so in leetcode 2sum problem we can only use brute force and hashing
public class q1 {

    static boolean bruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                    // System.out.println("true pair exist in array ");
                }
            }
        }
        return false;
    }

    static boolean twoPointer(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                // System.out.println("true");
                left++; // we do not have to left ++ and right -- because we have to find only first
                        // pair not all
                right--;
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    static boolean hashing(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (set.contains(complement)) {
                return true;
                // System.out.println(" true");
            }
            set.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 0, -1, 2, -3, 1 };

        int target = -2;

        // brute force
        if (bruteForce(arr, target)) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }

        // sort with two pointer
        if (twoPointer(arr, target)) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }

        // hashing
        if (hashing(arr, target)) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }


        // sort with binary search
        
    }
}
