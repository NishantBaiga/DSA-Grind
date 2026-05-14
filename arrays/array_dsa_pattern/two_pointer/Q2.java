package arrays.array_dsa_pattern.two_pointer;

import java.util.Arrays;
import java.util.HashMap;

// find sum equal to k when array is unsorted and return value/index.
// two sum leetcode problem 1
public class Q2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int target = 7;

        // brute force with time complexity O(N^2)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("target value k:" + " " + target + " " + "at index" + " " + i + " " + j);
                }
            }
        }


        // optimized approach using hashmap
        // Time Complexity: O(n + m)
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= arr.length; i++) {
            int compliment = target - arr[i];
            if (map.containsKey(compliment)) {
                System.out.println("target value k:" + " " + target + " " + "at index" + " " + map.get(compliment) + " " + i);  
            }
            map.put(arr[i], i);
        }

        // using two pointer when question say without hashmap.
        // two pointer with time complexity O(N) + O(Nlog(N)).two pointer work on sorted array .
        // remeber when we sort an array there index of element will change example [4,5,6,2] 4 at index 0 after sort it will be at index 3.
        // so if question ask to return value the it is easy , and if ask to return index then it will be hard.
        // to return original index we have to preserve original index.
    

        // Arrays.sort(arr);

        // int left = 0;
        // int right = arr.length - 1;
        // while (left < right) {
        //     int sum = arr[left] + arr[right];
        //     if (sum == target) {
        //         System.out.println("target value k:" + " " + target + " " + "at index" + " " + left + " " + right);
        //         left++;
        //         right--;
        //     } else if (sum > target) {
        //         right--;
        //     } else {
        //         left++;
        //     }
        // }

        


        // we can also solve this problem using binary search

    }
}
