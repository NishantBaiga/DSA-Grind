// Pair with given product (Product Pair)
// https://www.geeksforgeeks.org/dsa/pair-with-given-product-set-1-find-if-any-pair-exists/
// Given an integer array arr[] and an integer target, determine whether there exists a pair of elements in the array whose product is equal to target.

// Return true if such a pair exists; otherwise, return false.

// Examples : 

// Input: arr[] = [10, 20, 9, 40], target = 400
// Output: true
// Explanation: As 10 * 40 = 400, the answer is true.

// Input: arr[] = [-10, 20, 9, -40], target = 30
// Output: false
// Explanation: No pair exists with product 30.

package arrays.array_dsa_pattern.two_pointer.twoSum.unsortedInput;

import java.util.Arrays;
import java.util.HashSet;

public class q3 {

    static boolean bruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] * arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean twoPointer(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int product = arr[left] * arr[right];
            if (product == target) {
                return true;
            } else if (product < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    static boolean hashing(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            // if (target % i == 0) {
                int rem = target / arr[i];
                if (set.contains(rem)) {
                    return true;
                }
                set.add(arr[i]);
            // }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 9, 40 }, target = 400;


        // brute bruteForce
        System.out.println(bruteForce(arr, target));

        // sort with two pointer
        System.out.println(twoPointer(arr, target));

        // hasing
        System.out.println(hashing(arr, target));
    }
}