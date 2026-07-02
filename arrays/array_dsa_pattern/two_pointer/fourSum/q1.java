package arrays.array_dsa_pattern.two_pointer.fourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// LeetCode 18. 4Sum
// Medium
// https://leetcode.com/problems/4sum/description/

// Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

// 0 <= a, b, c, d < n
// a, b, c, and d are distinct.
// nums[a] + nums[b] + nums[c] + nums[d] == target
// You may return the answer in any order.

// Example 1:

// Input: nums = [1,0,-1,0,-2,2], target = 0
// Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
// Example 2:

// Input: nums = [2,2,2,2,2], target = 8
// Output: [[2,2,2,2]]
public class q1 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j= i+1; j<n; j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;

                Arrays.sort(nums);
                int left = j+1, right = n-1;
                while(left<right){
                    long sum = nums[left] + nums[right];
                    sum += nums[i];
                    sum += nums[j];
                    if(sum == target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[left], nums[right]));
                        left++;
                        right--;
                        while(left<right && nums[left] == nums[left-1]) left++;
                        while(left<right && nums[right] == nums[right+1]) right--;

                    }else if(sum < target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        // Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

        List<List<Integer>> result = fourSum(nums, target);

        if (result.isEmpty()) {
            System.out.println("No quadruplets found.");
        } else {
            for (List<Integer> quad : result) {
                System.out.println(quad);
            }
        }
    }
}



