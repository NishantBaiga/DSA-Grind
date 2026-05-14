package arrays.array_dsa_pattern.two_pointer;

import java.util.Arrays;

// remove element leetcode 27 
// remove element from array value equal to k
public class Q4 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5, 2 };
        int k = 5;

        // ------ situation if we can use two array and question not say to use in place
        // ----//
        /*
         * // Pass 1: Count how many elements are NOT equal to val
         * int count = 0;
         * for (int num : arr) {
         * if (num != k) {
         * count++;
         * }
         * }
         * 
         * // Allocate exact memory for the new array
         * int[] result = new int[count];
         * int index = 0;
         * 
         * // Pass 2: Copy the valid elements over
         * for (int num : arr) {
         * if (num != k) {
         * // result[index++] = num; sort hand
         * result[index] = num;
         * index++;
         * }
         * }
         * System.out.println(Arrays.toString(result));
         */

        // ----- two pointer approach -----//
        // we can solve this by two ways using pointer. 1st when we start both pointer
        // from start or when we start pointer from start and end .

        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != k) {
                arr[i] = arr[j];
                i++;
            }
        }
        System.out.println("index where elements are is : " + i);

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] == k) {
                arr[left] = arr[right - 1];
                right--;
            } else {
                left++;
            }
        }
        System.out.println(left);

    }
}
