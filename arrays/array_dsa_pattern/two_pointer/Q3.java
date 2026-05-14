package arrays.array_dsa_pattern.two_pointer;

import java.util.HashSet;

// remove duplicate element sfrom sorted array question 26 leetcode
// return count of unique element, 
public class Q3 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4 };

        // brute force with time Nlog(n)
        HashSet<Integer> set = new HashSet<>();

        int idx =0;
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                arr[idx++] = arr[i];
            }
        }
        System.out.println("index where elements are unnique is : " + idx + " and count of element is : " + set.size());

        // this is a optimize approach with time complexity O(N)
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        int cout = i + 1;

        System.out.println("index where elements are unnique is : " + i + " and count of element is : " + cout);

    }

}
