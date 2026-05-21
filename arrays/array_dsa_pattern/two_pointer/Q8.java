package arrays.array_dsa_pattern.two_pointer;

import java.util.Arrays;

// merge two sorted array  if extra space is allowed
public class Q8 {
    // brute force for learning we use 3rd array store both array elements and sort
    // the array.
    static void bruteForce(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        // temporary array to store all elements
        // from arr1 and arr2
        int[] merged = new int[n + m];

        // copy elements from arr1 and arr2 into merged array
        for (int i = 0; i < n; ++i) {
            merged[i] = arr1[i];
        }
        for (int j = 0; j < m; ++j) {
            merged[n + j] = arr2[j];
        }

        // sort the merged array
        Arrays.sort(merged);

        // distribute first n elements to arr1
        for (int i = 0; i < n; ++i) {
            arr1[i] = merged[i];
        }

        // distribute remaining m elements to arr2
        for (int j = 0; j < m; ++j) {
            arr2[j] = merged[n + j];
        }
    }

    // same like brute force we can use pointers with 3rd array to store elements of
    // 1st and 2nd array.
    // but in this we do not have to sort the merged array just put the sorted
    // elements to original.
    // these two approach is for learning because main question is merge without
    // using sorted array.

    // there are two optimize approach for without using extra space swap and sort ,
    // gap method.

    // swap and sort
    // static void swapAndSort(int[] arr1, int[] arr2) {
    //     int left = arr1.length - 1;
    //     int right = arr2[0];
        
    //     while (left >= 0 && right < arr2.length) {
    //         if (arr1[left] > arr2[right]) {
    //             swap(arr1[left], arr2[right]);
    //             left--; right++;
    //         }else{break;
    //         }

    //     }
    // }


    // gap method



    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 4, 5 };
        int[] arr2 = { 2, 4, 6, 8 };

        bruteForce(arr1, arr2);

        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}


// https://www.geeksforgeeks.org/dsa/merge-two-sorted-arrays-o1-extra-space/#better-approach-2-by-swap-and-sort-onlogn-mlogm-time-and-o1-space

// https://www.youtube.com/watch?v=n7uwj04E0I4&t=1643s