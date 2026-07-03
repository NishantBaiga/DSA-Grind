package arrays.array_dsa_pattern.kadens_algorithm;

import java.util.Arrays;

// Leetcode 53. Maximum Subarray
// Medium
// https://leetcode.com/problems/maximum-subarray/

// Given an integer array nums, find the subarray with the largest sum,
// and return its sum.

// Example 1:
// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6

// Example 2:
// Input: nums = [1]
// Output: 1

// Example 3:
// Input: nums = [5,4,-1,7,8]
// Output: 23

public class q1 {
    public static int maxSubArray(int[] nums) {
        // kadens algo
        int maxSum = nums[0];
        int currSum = 0;
        for (int val : nums) {
            currSum = currSum + val;
            maxSum = Math.max(maxSum, currSum);
            if(currSum < 0){
                currSum =0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {

        int[][] testCases = {
                { -2, 1, -3, 4, -1, 2, 1, -5, 4 },
                { 1 },
                { 5, 4, -1, 7, 8 },
                { -1 },
                { -2, -3, -1, -5 },
                { 8, -19, 5, -4, 20 }
        };

        int[] expected = {
                6,
                1,
                23,
                -1,
                -1,
                21
        };

        for (int i = 0; i < testCases.length; i++) {
            int ans = maxSubArray(testCases[i]);

            System.out.println("Input    : " + Arrays.toString(testCases[i]));
            System.out.println("Expected : " + expected[i]);
            System.out.println("Output   : " + ans);
            System.out.println(ans == expected[i] ? "PASS" : "FAIL");
            System.out.println("--------------------------------");
        }
    }
}