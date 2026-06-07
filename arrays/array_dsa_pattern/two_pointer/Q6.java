
package arrays.array_dsa_pattern.two_pointer;
// leetcode 42. Trapping Rain Water (Hard),

// https://leetcode.com/problems/trapping-rain-water/description/

// https://neetcode.io/solutions/trapping-rain-water
// https://www.hellointerview.com/learn/code/two-pointers/trapping-rain-water

// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

// Example 1:
// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

// Example 2:
// Input: height = [4,2,0,3,2,5]
// Output: 9

// Constraints:

// n == height.length
// 1 <= n <= 2 * 104
// 0 <= height[i] <= 105
public class Q6 {
    static int bruteForce(int[] height) {
        if (height.length == 0 || height == null) {
            return 0;
        }
        int n = height.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int leftMax = height[i];
            int rightMax = height[i];
            for (int j = 0; j < i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }
            for (int j = i + 1; j < n; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }
            res += Math.min(leftMax, rightMax) - height[i];
        }
        return res;
    }

    // prefix and suffix array
    static int better(int[] height) {
        if (height.length == 0 || height == null) {
            return 0;
        }

        int n = height.length;
        int res = 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = height[0];
        rightMax[n - 1] = height[n - 1];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        for (int i = 0; i < n; i++) {
            res+= Math.min(leftMax[i],rightMax[i]) -height[i];
        }
        return res;
    }

    static int two_pointer(int[] height) {
        if (height.length == 0 || height == null)
            return 0;
        int left = 0, right = height.length - 1;
        int leftMax = height[left], rightMax = height[right];
        int res = 0;
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                res += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                res += rightMax - height[right];
            }
        }
        return res;
    }

    // this can also be solved by stack

    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(bruteForce(height));
        System.out.println(better(height));
        System.out.println(two_pointer(height));
    }
}
