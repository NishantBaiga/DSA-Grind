package arrays.array_dsa_pattern.two_pointer;

import java.util.HashSet;
import java.util.TreeSet;

// remove duplicate elements from sorted array question 26 leetcode
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
// https://neetcode.io/solutions/remove-duplicates-from-sorted-array
// https://takeuforward.org/data-structure/remove-duplicates-in-place-from-sorted-array

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

public class Q1 {

    static void bruteForce(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                arr[idx++] = arr[i];
            }
        }
        System.out.println( set.size());

    }

    static void bruteForce_2(int[] nums) {
        TreeSet<Integer> unique = new TreeSet<>();
        for (int num : nums) {
            unique.add(num);
        }
        int i = 0;
        for (int num : unique) {
            nums[i++] = num;
        }
        System.out.println(unique.size());
    }

    static void two_pointer(int[] arr) {
        // if (arr.length == 0) return 0;
        // this is a optimize approach with time complexity O(N)
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println(i+1);
    }

    static int two_pointer2(int[] nums) {
        int n = nums.length, l = 0, r = 0;
        while (r < n) {
            nums[l] = nums[r];
            while (r < n && nums[r] == nums[l]) {
                r++;
            }
            l++;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4 ,8};
        bruteForce(arr);
        bruteForce_2(arr);
        two_pointer(arr);
        // two_pointer2(arr);
    }
}
