package arrays.array_dsa_pattern.kadens_algorithm;

import java.util.Arrays;

// Leetcode 152. Maximum Product Subarray
// Medium
// https://leetcode.com/problems/maximum-product-subarray/

// Given an integer array nums, find a subarray that has the largest product,
// and return the product.

// Example 1:
// Input: nums = [2,3,-2,4]
// Output: 6

// Example 2:
// Input: nums = [-2,0,-1]
// Output: 0

// Constraints:
// 1 <= nums.length <= 2 * 10^4
// -10 <= nums[i] <= 10

public class q2 {
    public static int maxProduct(int[] nums) {

        // // brute force
        // int n = nums.length;
        // int maxProduct = Integer.MIN_VALUE;
        // for(int i =0; i<n; i++){
        //     int prod = 1;
        //     for(int j =i; j<n; j++){
        //         prod*=nums[j];
        //         maxProduct= Math.max(maxProduct,prod);
        //     }
        // }
        // return maxProduct;

        // // prefix and suffix
        // int n = nums.length;
        // int maxProduct= nums[0];
        // int prefix = 1, suffix =1;
        // for(int i =0; i<n; i++){
        //     if(prefix == 0 ) prefix =1;
        //     if(suffix == 0 ) suffix =1;
        //     prefix*=nums[i];
        //     suffix*=nums[n-i-1];
        //     maxProduct = Math.max(maxProduct, Math.max(prefix,suffix));
        // }

        // return maxProduct;

        // kadens algo
        int res = nums[0];
        int curMin = 1, curMax = 1;

        for (int num : nums) {
            int tmp = curMax * num;
            curMax = Math.max(Math.max(num * curMax, num * curMin), num);
            curMin = Math.min(Math.min(tmp, num * curMin), num);
            res = Math.max(res, curMax);
        }
        return res;
    }

    public static void main(String[] args) {

        int[][] testCases = {
                {2, 3, -2, 4},
                {-2, 0, -1},
                {-2},
                {0, 2},
                {-2, 3, -4},
                {2, -5, -2, -4, 3},
                {-1, -2, -9, -6},
                {1, 2, 3, 4},
                {-2, -3, 7},
                {0, -2, -3, 0, -2, -40}
        };

        int[] expected = {
                6,
                0,
                -2,
                2,
                24,
                24,
                108,
                24,
                42,
                80
        };

        for (int i = 0; i < testCases.length; i++) {

            int ans = maxProduct(testCases[i]);

            System.out.println("Test Case " + (i + 1));
            System.out.println("Input    : " + Arrays.toString(testCases[i]));
            System.out.println("Expected : " + expected[i]);
            System.out.println("Output   : " + ans);
            System.out.println(ans == expected[i] ? "PASS" : "FAIL");
            System.out.println("--------------------------------------");
        }
    }
}

// in this question there is a edge cases 
// 1) all +ve that means all the elements include .
// 2) odd -ve means output will -ve.
// 3) even -ve means output will +ve.
// 4) array can contain 0 

// to solve this question there are various ways
// 1) brute force
// 2) prefix and suffix 
// 3) sliding window
// 4) kadens algo