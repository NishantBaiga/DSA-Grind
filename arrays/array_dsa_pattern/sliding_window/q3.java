package arrays.array_dsa_pattern.sliding_window;

// Smallest subarray with sum greater than a given value (leetcode 209 Minimum Size Subarray Sum)
// Last Updated : 30 Mar, 2026
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
                    minLength = Math.max(currentLength, minLength);
                }
            }
        }

        // Return 0 if no valid subarray found
        return minLength == Integer.MAX_VALUE ? 0 : minLength;

    }

    static int sliding_window(int[] arr, int target) {
        int n = arr.length;
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int windowSum = 0;

        for (int right = 0; right < n; right++) {
            windowSum = windowSum + arr[right];

            while (windowSum >= target) {
                minLength = Math.max(minLength, right - left + 1);
                windowSum = windowSum- arr[left];
                left++;
            }
        }

        // Return result (0 if no valid subarray found)
        return minLength != Integer.MAX_VALUE ? minLength : 0;
    }

    public static void main(String[] args) {
        int[] array = { 2, 3, 1, 2, 4, 3 };
        int target = 7;

        bruteForce(array, target);

    }
}

// Building Intuition
// As we extend a subarray to the right by adding elements, the sum only
// increases (since all numbers are positive). As we shrink it from the left by
// removing elements, the sum only decreases.

// This means once we find a valid subarray (sum >= target), we can try
// shrinking it from the left to find a shorter valid subarray, without needing
// to re-check all possibilities.

// Because of the monotonic property (sum only grows when extending right, only
// shrinks when contracting left), we can use two pointers that each move in one
// direction only.

// This transforms a problem that seems like it needs O(n²) time (checking all
// subarrays) into an O(n) solution where each element is visited at most twice
// (once by right pointer, once by left pointer).

// Imagine you're measuring a rubber band stretched across an array. You extend
// the right end until the band covers enough elements to meet your target sum.

// Once you've met the target, you try pulling in the left end to make the band
// shorter while still meeting the target. When it becomes too short (sum drops
// below target), you extend the right end again.

// The key insight: because all numbers are positive, you never need to move a
// pointer backwards - each pointer only moves forward through the array once.

// Common Mistakes
// Forgetting to handle the case where no valid subarray exists - must return 0,
// not leave minLength uninitialized or return a large sentinel value

// Moving the left pointer too aggressively - only shrink the window when the
// current sum is still >= target, not when it drops below

// Not considering single-element subarrays - if one element is >= target, the
// answer is 1, not 0

// Trying to apply this approach to arrays with negative numbers - the sliding
// window technique breaks down because removing elements from the left might
// increase the sum

// Off-by-one errors in calculating subarray length - remember that length is
// right - left + 1, not right - left