package arrays.array_dsa_pattern.two_pointer.threeSum.unsortedInput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Leetcode 15. 3Sum (Medium)
// https://leetcode.com/problems/3sum/description/?envType=problem-list-v2&envId=two-pointers
// https://neetcode.io/solutions/3sum
// https://takeuforward.org/data-structure/3-sum-find-triplets-that-add-up-to-a-zero

// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.

// Example 1:
// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.

// Example 2:
// Input: nums = [0,1,1]
// Output: []
// Explanation: The only possible triplet does not sum up to 0.

// Example 3:
// Input: nums = [0,0,0]
// Output: [[0,0,0]]
// Explanation: The only possible triplet sums up to 0.

// Constraints:
// 3 <= nums.length <= 3000
// -105 <= nums[i] <= 105
public class q1 {
    static List<List<Integer>> bruteForce(int[] arr) {
        Set<List<Integer>> res = new HashSet<>();
        // we can also use arraylist.
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum == 0) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(arr[i]);
                        triplet.add(arr[j]);
                        triplet.add(arr[k]);
                        // Sort to ensure duplicates like
                        // [-1,0,1] and [0,1,-1] become the same
                        Collections.sort(triplet);
                        res.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }

    // we broke this question in 2sum problem .
    static List<List<Integer>> Hashing(int[] arr) {
        int n = arr.length;
        // here we are using set because we want unique triplets
        Set<List<Integer>> res = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = -(arr[i] + arr[j]);
                if (set.contains(third)) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(third);
                    // List<Integer> temp = Arrays.asList(arr[i], arr[j], third); //short hand
                    Collections.sort(temp);
                    res.add(temp);
                }
                set.add(arr[j]);
            }
        }
        return new ArrayList<>(res);
    }

    static List<List<Integer>> twoPointer(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // here we are checking duplicates. if dupplicate then skip.
            if (i > 0 && arr[i] == arr[i - 1])
                continue;

            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    res.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;
                    while (left < right && arr[left] == arr[left - 1])
                        left++;
                    while (left < right && arr[right] == arr[right + 1])
                        right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };

        List<List<Integer>> res = bruteForce(nums);
        List<List<Integer>> res2 = Hashing(nums);
        List<List<Integer>> res3 = twoPointer(nums);

        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);

        // for (List<Integer> triplet : res2) {
        // for (int num : triplet)
        // System.out.print(num + " ");
        // System.out.println();
        // }

    }
}
