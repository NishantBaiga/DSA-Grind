package arrays.array_dsa_pattern.two_pointer.twoSum.sortedInput;

// GFG
// 2 Sum - Pair Sum Closest to Target using Binary Search
// https://www.geeksforgeeks.org/dsa/2-sum-pair-sum-closest-to-target-using-binary-search/

// Given an array arr[] of n integers and an integer target, the task is to find a pair in arr[] such that it’s sum is closest to target.

// Note: Return the pair in sorted order and if there are multiple such pairs return the pair with maximum absolute difference. If no such pair exists return an empty array.

// Examples:
// Input: arr[] = [10, 30, 20, 5], target = 25
// Output: [5, 20]
// Explanation: Out of all the pairs, [5, 20] has sum = 25 which is closest to 25.

// Input: arr[] = [5, 2, 7, 1, 4], target = 10
// Output: [2, 7]
// Explanation: As (4, 7) and (2, 7) both are closest to 10, but absolute difference of (2, 7) is 5 and (4, 7) is 3. Hence,[2, 7] has maximum absolute difference and closest to target.

// Input: arr[] = [10], target = 10
// Output: []
// Explanation: As the input array has only 1 element, return an empty array.
public class q2 {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 7, 8, 8, 9, 15, 19, 22, 32 };
        int target = 17;
        // System.out.println(findClosest(arr, target));
    }
}
