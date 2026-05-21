package arrays.array_dsa_pattern.two_pointer.twoSum.unsortedInput;

// Sum of two elements whose sum is closest to zero

// Given an integer array arr[], find the sum of any two elements whose sum is closest to zero.

// Note: In case if we have two ways to form sum closest to zero, return the maximum sum among them.

// Examples:

// Input: arr[] = [-8, 5, 2, -6]
// Output: -1
// Explanation: The min absolute sum pair is (5, -6)

// Input:  arr[] = [0, -8, -6, 3]
// Output: 3
// Explanation: We have a tie between (0, 3) and (-6, 3). We pick the max sum in this case which is 0+3

// Input: arr[] = [-7, 4, 1, -2]
// Output: -1
// Explanation: The min absolute sum pair is (1, -2).
public class q4 {
    static int bruteForce(int[] arr) {
        int res = arr[0] + arr[1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (Math.abs(sum) < Math.abs(res)) {
                    res = sum;
                } else if (Math.abs(sum) == Math.abs(res)) {
                    res = Math.max(res, sum);
                }
            }
        }

        return res;

    }

    public static void main(String[] args) {
        int arr[] = { -8, 5, 2, -6 };

        System.out.println(bruteForce(arr));
    }
}
