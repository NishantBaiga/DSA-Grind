package arrays.array_dsa_pattern.two_pointer.twoSum.unsortedInput;

import java.util.Arrays;
import java.util.HashSet;

// 2 Sum - Count pairs with given sum
// https://www.geeksforgeeks.org/dsa/count-pairs-with-given-sum/
// Given an array arr[] of n integers and a target value, find the number of pairs of integers in the array whose sum is equal to target.

// Examples:  

// Input: arr[] = [1, 5, 7, -1, 5], target = 6
// Output:  3
// Explanation: Pairs with sum 6 are (1, 5), (7, -1) & (1, 5).         

// Input: arr[] = [1, 1, 1, 1], target = 2
// Output:  6
// Explanation: Pairs with sum 2 are (1, 1), (1, 1), (1, 1), (1, 1), (1, 1) and (1, 1).

// Input: arr[] = [10, 12, 10, 15, -1], target = 125
// Output:  0
// Explanation: There is no pair with sum = target
public class q2 {
    static int bruteForce(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

    static int twoPointer(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                int cnt1 = 0, cnt2 = 0;
                int ele1 = arr[left], ele2 = arr[right];
                if (left <= right && arr[left] == ele1) {
                    cnt1++;
                    left++;
                }

                if (left <= right && arr[right] == ele2) {
                    cnt2++;
                    right--;
                }

                if (ele1 == ele2) {
                    count  += (cnt1 * (cnt1- 1)/2); // here we are using simple math to ffind the count of pair 
                }else{
                    count += cnt1 * cnt2;
                }

            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return count;
    }

    static int hashing(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (set.contains(complement)) {
                count++;
            }
            set.add(arr[i]);
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 7, -1, 5 }, target = 6;

        System.out.println(bruteForce(arr, target));
        System.out.println(twoPointer(arr, target));
        System.out.println(hashing(arr, target));
    }
}
