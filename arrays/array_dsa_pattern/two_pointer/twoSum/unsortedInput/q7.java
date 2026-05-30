package arrays.array_dsa_pattern.two_pointer.twoSum.unsortedInput;
import java.util.Arrays;
import java.util.HashMap;

// leetcode 2006
// Count pairs with absolute difference equal to k

// Given an array arr[] and a positive integer k, the task is to count all pairs (i, j) such that i < j and absolute value of (arr[i] - arr[j]) is equal to k. 

// Examples: 

// Input: arr[] = [1, 4, 1, 4, 5], k = 3
// Output: 4
// Explanation: There are 4 pairs with absolute difference 3, the pairs are [1, 4], [1, 4], [1, 4] and [4, 1]

// Input: arr[] = [8, 16, 12, 16, 4, 0], k = 4
// Output: 5
// Explanation: There are 5 pairs with absolute difference 4, the pairs are [8, 12], [8, 4], [16, 12], [12, 16], [4, 0].
public class q7 {

    static int bruteForce(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }

    static int two_pointer(int[] arr, int k) {
        Arrays.sort(arr);

        int left = 0;
        int right = 0;
        int count = 0;

        while (right < arr.length) {
            if (arr[right] - arr[left] < k) {
                right++;
            } else if (arr[left] - arr[right] > k) {
                left++;
            } else if (arr[right] - arr[left] == k) {
                int e1 = arr[left], e2 = arr[right];
                int count1 = 0, count2 = 0;
                while (right < arr.length && arr[right] == e2) {
                    right++;
                    count2++;
                }
                while (left < arr.length && arr[left] == e1) {
                    left++;
                    count1++;
                }
                if (e1 == e2) {
                    count += (count1 * (count1 - 1) / 2);
                } else {
                    count += count1 * count2;
                }
            }
        }
        return count;
    }

    static int hashing(int[] arr, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i] - k)) {
                count += map.get(arr[i] - k);
            }
            if (map.containsKey(arr[i] + k)) {
                count += map.get(arr[i] + k);
            }

            map.put(arr[i], map.getOrDefault(arr[i],0) + 1 );
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 1, 4, 5 }, k = 3;

        System.out.println(bruteForce(arr, k));
        System.out.println(two_pointer(arr, k));
        System.out.println(hashing(arr, k));
    }
}
