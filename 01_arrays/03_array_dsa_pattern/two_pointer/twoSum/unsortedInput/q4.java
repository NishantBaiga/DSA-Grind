package arrays.array_dsa_pattern.two_pointer.twoSum.unsortedInput;

import java.util.Arrays;

// Sum of two elements whose sum is closest to zero

// Given an integer array arr[], find the sum of any two elements whose sum is closest to zero.

// Note: In case if we have two ways to form sum closest to zero, return the maximum sum among them.

// Examples:

// Input: arr[] = [-8, 5, 2, -6]
// Output: -1
// Explanation: The min absolute sum pair is (5, -6)

// Input:  arr[] = [0, -8, -6, 3]
// Output: 3
// Explanation: We have a tie between (0, 3) and (-6, 3). We pick the max sum in this case which is 0+3

// Input: arr[] = [-7, 4, 1, -2]
// Output: -1
// Explanation: The min absolute sum pair is (1, -2).
public class q4 {
    static int bruteForce(int[] arr) {
        int res = arr[0] + arr[1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (Math.abs(sum) < Math.abs(res)) {
                    res = sum;
                } else if (Math.abs(sum) == Math.abs(res)) {
                    res = Math.max(res, sum);
                }
            }
        }

        return res;

    }

    // best approach
    static int two_pointer(int[] arr) {
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        int closestSum  = arr[0] + arr[1];
        while (left < right) {
            int sum = arr[left] + arr[right];

            if (Math.abs(sum) == Math.abs(closestSum)) {
                closestSum = Math.max(sum , closestSum);
            }else if (Math.abs(sum ) < Math.abs(closestSum)) {
                closestSum = Math.max(closestSum, sum);
            }

            if (arr[left] + arr[right] > 0) {
                right--;    
                
            } else {
                left++;
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {
        int arr[] = { -8, 5, 2, -6 };

        // System.out.println(bruteForce(arr));
        System.err.println(two_pointer(arr));
    }
}

// The idea is to sort the array first and use two pointers, one at the leftmost
// (smallest) and the other at the rightmost (largest) element. We calculate
// their sum and check if it's closer to zero than our current best sum. If we
// find a sum of zero, we return immediately. Otherwise, we adjust the pointers
// based on whether the sum is positive (move right pointer left) or negative
// (move left pointer right).

// Steps to implement the above idea:

// Sort the array in ascending order.
// Initialize two pointers: one at the start and one at the end.
// Initialize variables to store the closest sum and its absolute difference.
// Iterate while left pointer is less than right pointer.
// Update the closest sum if the current sum is closer to zero.
// Move the left pointer right if the sum is negative; else, move the right
// pointer left.


// ❌ we can use hash but it it not a best approach , we use hash set if we want to excat target 

