package arrays.array_dsa_pattern.two_pointer;

//Leetcode 11. Container With Most Water (Medium)

// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.

// Example 1:
// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

// Example 2:
// Input: height = [1,1]
// Output: 1

// Constraints:

// n == height.length
// 2 <= n <= 105
// 0 <= height[i] <= 104
public class Q7 {

    static int bruteForce (int[] height){
        int res =0;
        


        return res;
    }
    static int two_pointer(int[] height) {
        int res = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int currentArea = w*h;
            res = Math.max(res,currentArea);
            if(left < right){
                left++;
            }else{
                right--;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(two_pointer(height));
    }
}
