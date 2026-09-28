package arrays.array_dsa_pattern.two_pointer.twoSum.sortedInput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// leetcode 167 (Two Sum II - Input Array Is Sorted)
// Two Sum - Pair sum in sorted array

// https://www.geeksforgeeks.org/dsa/pair-with-given-sum-in-sorted-array-two-sum-ii/
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

// Given a 1-based indexed integer array arr[] that is sorted in non-decreasing order, along with an integer target. find two elements in the array such that their sum is equal to target. If such a pair exists, return the indices of the two elements in increasing order. If no such pair exists, return [-1, -1].

// Examples:

// Input: arr[] = [2, 7, 11, 15], target = 9
// Output: 1 2
// Explanation: Since the array is 1-indexed, arr[1] + arr[2] = 2 + 7 =  9

// Input: arr[] = [1, 3, 4, 6, 8, 11] target = 10
// Output: 3 4
// Explanation: Since the array is 1-indexed, arr[3] + arr[5] = 4 + 6 = 10

public class q1 {
    static int[] bruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum == target) {
                    return new int[] { i + 1, j + 1 };
                }
            }
        }
        return new int[0];
        // we can also use arraylist to return value but this better
    }

    static int[] hashing(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i + 1 };
            }
            map.put(arr[i], i + 1);
        }
        return new int[0];
    }

    static int[] twoPointer(int[] arr, int target) {

        int l = 0, r = arr.length - 1;
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == target) {
                return new int[] { l + 1, r + 1 };
            }else if(sum < target ){
                l++;
            }else{
                r--;
            }
        }
        return new int[0];
    }
    static int[] binarySearch(int[] arr, int target) {

        return new int[0];
    }



    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = bruteForce(arr, target);
        for (int val : result) {
            System.out.println(val);
        }
        int[] result2 = hashing(arr, target);
        for (int val : result2) {
            System.out.println(val);
        }
        int[] result3 = twoPointer(arr, target);
        for (int val : result3) {
            System.out.println(val);
        }
    }
}
