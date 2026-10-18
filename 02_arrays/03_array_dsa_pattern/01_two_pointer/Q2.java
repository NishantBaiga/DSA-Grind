package arrays.array_dsa_pattern.two_pointer;

import java.util.Arrays;

// Description
// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

// Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

// Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
// Return k.

// remove element leetcode 27 
// remove element from array value equal to k

public class Q2 {
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


// Prerequisites
// Before attempting this problem, you should be comfortable with:

// Arrays - Understanding how to traverse and modify array elements by index
// Two Pointers Technique - Using multiple pointers to track positions during array manipulation
// In-Place Modification - Modifying an array without using extra space.



// 1. Brute Force
// Intuition
// The simplest way to remove elements is to collect all the values we want to keep into a separate list.
// We iterate through the array, skip any element that matches the target value, and store the rest.
// Then we copy everything back into the original array.
// This works but uses extra space proportional to the input size.

// Algorithm
// Create a temporary list tmp to store elements that are not equal to val.
// Iterate through nums and add each element to tmp if it does not equal val.
// Copy all elements from tmp back into the beginning of nums.
// Return the length of tmp, which represents how many valid elements remain.

// Time & Space Complexity
// Time Complexity: O(n)
// Space Complexity: O(n)







// 2. Two Pointers - I
// Intuition
// Instead of using extra space, we can overwrite unwanted elements in place.
// We use a write pointer k that tracks where the next valid element should go.
// As we scan through the array, whenever we find an element that is not equal to val, we write it at position k and move k forward.
// At the end, everything before index k contains valid elements.

// Algorithm
// Initialize a pointer k = 0 to track the position for the next valid element.
// Iterate through the array with index i:
// If nums[i] is not equal to val, copy it to nums[k] and increment k.
// Return k as the count of valid elements.

// Time & Space Complexity
// Time Complexity: O(n)
// Space Complexity: O(1)