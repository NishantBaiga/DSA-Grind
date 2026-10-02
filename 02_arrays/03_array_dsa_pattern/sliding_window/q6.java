package arrays.array_dsa_pattern.sliding_window;
import java.util.Arrays;

// 209. Minimum Size Subarray Sum
// Medium

// https://leetcode.com/problems/minimum-size-subarray-sum/


// Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 

// Example 1:

// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: The subarray [4,3] has the minimal length under the problem constraint.
// Example 2:

// Input: target = 4, nums = [1,4,4]
// Output: 1
// Example 3:

// Input: target = 11, nums = [1,1,1,1,1,1,1,1]
// Output: 0
 

// Constraints:

// 1 <= target <= 109
// 1 <= nums.length <= 105
// 1 <= nums[i] <= 104
 

// Follow up: If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log(n)).
 

public class q6 {

    public static int minSubArrayLen(int target, int[] nums) {

        // Write your solution here

        return 0;
    }

    public static void main(String[] args) {

        int[][] testCases = {
                {2, 3, 1, 2, 4, 3},
                {1, 4, 4},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5},
                {5},
                {1, 2, 3},
                {1, 1, 1, 1, 7},
                {2, 2, 2, 2},
                {1, 2, 3, 4},
                {10, 2, 3}
        };

        int[] targets = {
                7,
                4,
                11,
                11,
                5,
                7,
                7,
                8,
                6,
                10
        };

        int[] expected = {
                2,
                1,
                0,
                3,
                1,
                0,
                1,
                4,
                2,
                1
        };

        for (int i = 0; i < testCases.length; i++) {

            int ans = minSubArrayLen(targets[i], testCases[i]);

            System.out.println("Test Case " + (i + 1));
            System.out.println("Target   : " + targets[i]);
            System.out.println("Input    : " + Arrays.toString(testCases[i]));
            System.out.println("Expected : " + expected[i]);
            System.out.println("Output   : " + ans);
            System.out.println(ans == expected[i] ? "PASS" : "FAIL");
            System.out.println("-----------------------------------------");
        }
    }
}
