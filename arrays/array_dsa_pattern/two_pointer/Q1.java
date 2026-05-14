package arrays.array_dsa_pattern.two_pointer;

import java.util.HashSet;

// find sum equal to k when array is sorted and return value.
// example arr={1,2,3,4,5} k=7 output= {3,4}

// in this question we can return true if first subarray met or we can use arraylist to return all values that equal to k.
// there are 2 type of this question 1st in which when first subarray that is equal to k return true. and 2nd type is when we have to return all the subarrays that whose sum is equal to k .
// does pair exist return true or false . find all pair that sum is equal to k.
public class Q1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int k = 7;

        // this is brute force approch with O(N*N) time complexity .
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    // in here we can return true if first subarray met or we can store all subarray
                    // index or value in arrayList or in hasMap.
                    System.err.println("the target value k : " + k + " is found at index : " + i
                            + " and " + j);
                }
            }
        }

        // optimized approach with O(N) time complexity
        // using two pointer 
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == k) {
                // here now print all the pairs , if question ask to check pair exist or not
                // then return true or false.
                System.out.println("the target value k : " + k + " is found at index : " + left + " " + right);
                left++;
                right--;
            } else if (sum > k) {
                right--;
            } else {
                left++;
            }
        }

        // using hasSet
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int rem = k - arr[i];
            if (set.contains(rem)) {
                // here we are just check pair exist or not , this use in questions when ask pair exist or not. hasSet not allow duplicate
                System.out.println("the target value k : " + k + " is found at index : " + arr[i] + " " + rem);
            }
            set.add(arr[i]);
        }


    

    }
}
