package arrays.array_dsa_pattern.two_pointer;

import java.util.HashSet;

// remove duplicate elements from sorted array question 26 leetcode

// Given a sorted array arr[] of size n, the goal is to rearrange the array so that all distinct elements appear at the beginning in sorted order. Additionally, return the length of this distinct sorted subarray.

// Your task is to remove duplicates from nums in-place so that each element appears only once.

// Note: The elements after the distinct ones can be in any order and hold any value, as they don't affect the result.

// Examples: 
// Input: arr[] = [2, 2, 2, 2, 2]
// Output: [2]
// Explanation: All the elements are 2, So only keep one instance of 2.

// Input: arr[] = [1, 2, 2, 3, 4, 4, 4, 5, 5]
// Output: [1, 2, 3, 4, 5]

// Input: arr[] = [1, 2, 3]
// Output: [1, 2, 3]
// Explanation : No change as all elements are distinct.

public class Q3 {

    static void bruteForce(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                arr[idx++] = arr[i];
            }
        }
        System.out.println("index where elements are unnique is : " + idx + " and count of element is : " + set.size());

    }

    static void two_pointer(int[] arr) {
        // this is a optimize approach with time complexity O(N)
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        int cout = i + 1;

        System.out.println("index where elements are unnique is : " + i + " and count of element is : " + cout);

    }

    static int two_pointer2(int [] nums){
          int n = nums.length, l = 0, r = 0;
        while (r < n) {
            nums[l] = nums[r];
            while (r < n && nums[r] == nums[l]) {
                r++;
            }
            l++;        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4 };
        bruteForce(arr);
        two_pointer(arr);
    }
}



// Prerequisites
// Before attempting this problem, you should be comfortable with:

// Two Pointers - Using a read pointer and write pointer to modify arrays in-place
// In-Place Array Modification - Overwriting elements without using extra space
// Sorted Array Properties - Understanding that duplicates are always adjacent in sorted arrays.



// Hashset or Sorted set 
// Intuition
// Hash Sets automatically reject duplicate values. We can iterate through the array, push every element into an Ordered Hash Set to filter out the duplicates, and then overwrite the beginning of the original array with the unique values from the set.

// The problem strictly requires $O(1)$ constant extra memory (in-place modification). We must drop the Hash Set and use Two Pointers instead.
// brute force with time Nlog(n) and space O(N).



//  Two Pointers - I
// Intuition
// A more elegant approach: we compare each element with its predecessor. Since duplicates are consecutive in a sorted array, an element is unique if it differs from the one before it. We maintain a write pointer that only advances when we find a new unique value.

// Algorithm
// Start with l = 1 since the first element is always unique.
// Iterate r from 1 to the end of the array.
// If nums[r] differs from nums[r - 1], it's a new unique value.
// Copy it to position l and increment l.
// Return l as the count of unique elements.



// Two Pointers - II
// Intuition
// Since the array is sorted, duplicates are adjacent. We use two pointers: one (l) marks where to place the next unique element, and another (r) scans through the array. When r finds a new value (different from what's at l), we copy it to position l and advance both pointers. This modifies the array in-place.

// Algorithm
// Initialize both pointers l and r to 0.
// Copy the current element at r to position l.
// Skip all duplicates by advancing r while consecutive elements are equal.
// Move l forward to prepare for the next unique element.
// Return l as the count of unique elements.