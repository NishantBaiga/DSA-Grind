package arrays.array_dsa_pattern.sliding_window;

// Smallest subarray with sum greater than a given value (leetcode 209 Minimum Size Subarray Sum)
// https://leetcode.com/problems/minimum-size-subarray-sum/description/?envType=problem-list-v2&envId=sliding-window
// https://algomaster.io/learn/dsa/minimum-size-subarray-sum
// https://algo.monster/liteproblems/209

// Given an array arr[] of integers and a number x, the task is to find the smallest subarray with a sum strictly greater than x.

// Examples:

// Input: x = 51, arr[] = [1, 4, 45, 6, 0, 19]
// Output: 3
// Explanation: Minimum length subarray is [4, 45, 6]

// Input: x = 100, arr[] = [1, 10, 5, 2, 7]
// Output: 0
// Explanation: No subarray exist

// Edge cases to consider:
// What if no subarray sums to at least the target? (return 0). 
// What if the entire array's sum is less than target? 
// What if a single element is already >= target? 
// What if the array is empty?

public class q3 {

    static int bruteForce(int[] arr, int target) {
        int n = arr.length;
        int minLength = Integer.MAX_VALUE;

        // if arr is 0 to 5 then it run 0 to 4 , 1 less
        for (int start = 0; start < n; start++) {
            int currentWindowsum = 0;
            for (int end = start; end < n; end++) {
                currentWindowsum = currentWindowsum + arr[end];

                if (currentWindowsum >= target) {
                    int currentLength = end - start + 1;
                    minLength = Math.min(currentLength, minLength);
                    break;
                }
            }
        }

        // Return 0 if no valid subarray found
        return minLength == Integer.MAX_VALUE ? 0 : minLength +1;

    }

    static int sliding_window(int[] arr, int target) {
        int n = arr.length;
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int windowSum = 0;

        for (int right = 0; right < n; right++) {
            windowSum = windowSum + arr[right];

            while (windowSum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                windowSum = windowSum- arr[left];
                left++;
            }
        }

        // Return result (0 if no valid subarray found)
        return minLength != Integer.MAX_VALUE ? minLength + 1 : 0;
    }

    public static void main(String[] args) {
        int[] array = { 2, 3, 1, 2, 4, 3 };
        int target = 7;

        System.out.println(bruteForce(array, target));
        System.out.println(sliding_window(array, target));

    }
}