package arrays.array_dsa_pattern.two_pointer;

// Description (remove duplicate from sorted array 2 leetcode 80)
// You are given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.

// Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

// Return k after placing the final result in the first k slots of nums.

// Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

// Constraints:
// 1 <= nums.length <= 30,000
// -10,000 <= nums[i] <= 10,000
// nums is sorted in non-decreasing order.
public class Q5 {


    static int two_pointer(int[] nums) {
         int l = 0, r = 0;

        while (r < nums.length) {
            int count = 1;
            while (r + 1 < nums.length && nums[r] == nums[r + 1]) {
                r++;
                count++;
            }

            for (int i = 0; i < Math.min(2, count); i++) {
                nums[l] = nums[r];
                l++;
            }
            r++;
        }

        return l;
    }


    static int two_pointer2(int [] arr){
        if(arr.length <= 2 ) return arr.length;
        int i = 2;
        for (int j = 2; j < arr.length; j++) {
            if (arr[i] != arr[j -2]) {
                arr[++i] = arr[j];
            }
        }
        System.out.println(i+2);  // i+2 because we start from 2
        return i+2;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,1,2,2,3};

        two_pointer(arr);
        two_pointer2(arr);

    }
}


// Prerequisites
// Two Pointers - Using a read pointer and write pointer to modify arrays in-place
// In-Place Array Modification - Overwriting elements without using extra space
// Sorted Array Properties - Leveraging the fact that duplicates are always adjacent in sorted arrays






//  Brute Force
// Intuition
// We allow each element to appear at most twice. When we find more than two consecutive duplicates, we shift all subsequent elements left to overwrite the extras. This in-place modification is straightforward but inefficient due to repeated shifting operations.

// Algorithm
// Handle arrays with 2 or fewer elements as base cases.
// Iterate through the array looking for duplicate pairs.
// When a duplicate pair is found, count how many extras exist beyond the allowed two.
// Shift all elements after the extras to the left to fill the gap.
// Reduce the effective array length and continue scanning.
// Return the final length.

// Time & Space Complexity
// Time Complexity: O(N*N).
// Space Complexity: O(1).





// Hash Map
// Intuition
// We count occurrences of each element using a hash map while preserving order. Then we reconstruct the array, writing each element at most twice. This uses extra space but separates the counting logic from the placement logic.

// Algorithm
// Count occurrences of each element while tracking their first appearance order.
// Iterate through unique elements in order.
// For each element, write it to the result position once, then write it again if it appeared more than once.
// Return the final write position as the new length.
// This approach ensures the array remains sorted since we process unique elements in order.

// Time & Space Complexity
// Time Complexity: O(N).
// Space Complexity: O(N).







// Two Pointers
// Intuition
// We process groups of consecutive duplicates together. For each group, we write at most two copies to the result portion of the array. The left pointer tracks where to write, and the right pointer scans through the array finding groups.

// Algorithm
// Initialize left and right pointers at 0.
// For each group of duplicates, count how many there are by advancing r.
// Write min(2, count) copies of the element starting at position l.
// Advance l accordingly and move to the next group.
// Return l as the new length.

// Time & Space Complexity
// Time Complexity: O(N).
// Space Complexity: O(1).






//  Two Pointers (Optimal)
// Intuition
// The cleanest approach uses a single condition: we only write an element if the write position is less than 2 (first two elements always go through) OR the current element differs from the element two positions back in the result. This automatically limits each value to at most two occurrences.

// Algorithm
// Initialize the write pointer l at 0.
// Iterate through each element in the array.
// If l < 2 or the current element differs from nums[l - 2], write it at position l and increment l.
// Return l as the new length.

// Time & Space Complexity
// Time Complexity: O(N).
// Space Complexity: O(1).