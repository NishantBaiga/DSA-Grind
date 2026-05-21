package arrays.array_dsa_pattern.sliding_window;

// Maximum sum of a subarray of size k

// Given an array of integers arr[] and an integer k, find the maximum possible sum among all contiguous subarrays of size exactly k.

// A subarray is a sequence of consecutive elements from the original array. Return the maximum sum that can be obtained from any such subarray of length k.

// Examples: 

// Input  : arr[] = [100, 200, 300, 400],  k = 2
// Output : 700
// Explanation: We get maximum sum by adding subarray [300,400] of size 2

// Input  : arr[] = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4 
// Output : 39
// Explanation: We get maximum sum by adding subarray [4, 2, 10, 23] of size 4.

// Input  : arr[] = [2, 3], k = 1
// Output : 3
// Explanation: The subarrays of size 1 are [2] and [3]. The maximum sum is 3.
public class q1 {

    static int bruteForce(int[] arr, int k) {
        int maxSum = 0;
        for (int i = 0; i < arr.length - k; i++) {
            int currSum = 0;
            for (int j = 0; j < k; j++) {
                currSum = currSum + arr[i + j];
            }

            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println(maxSum);
        return maxSum;
    }

    static int sliding_window(int[] arr, int k) {
        // sliding window
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum = windowSum + arr[i];
        }

        int maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.println(maxSum);
        return maxSum;
    }

    static int sliding_window2(int[] arr, int k) {
        // another way of wrinting sliding window
        int low = 0; // window start
        int high = 0; // window end  , these are pointers to keep track of window
        int windowSum = 0;
        int maxSum = 0;
        while (high < arr.length) {
            windowSum = windowSum + arr[high]; // first window sum
            if (high - low + 1 < k) { // high -  low + 1 = window size
                high++;
            } else if (high - low + 1 == k) {
                maxSum = Math.max(windowSum, maxSum);
                windowSum = windowSum - arr[low];
                low++;
                high++;
            }
        }
        System.out.println(maxSum);
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 10, 23, 3, 1, 0, 20 }, k = 4;

        bruteForce(arr, k);

        sliding_window(arr, k);

        sliding_window2(arr, k);

    }
}
