package searching_algorithm;
// we use binary search when array is sorted . 
public class binarySearch {
    static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            // int mid = (left + right) / 2;
            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                return mid;
            }else if(target > arr[mid] ){
                left = mid + 1;
            }else{
                right = mid - 1;
            }

        }

        return -1;
    }

    static public void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12 }; // Must be sorted
        int target = 10;
        System.out.println("Index found at: " + search(arr, target));
    }
}



// Algorithm:
// Now, we will apply the binary search algorithm in the given array:

// Divide the search space into 2 halves:
// In order to divide the search space, we need to find the middle point of it. So, we will take a ‘mid’ pointer and do the following:
// mid = (low+high) // 2 ( ‘//’ refers to integer division)


// Compare the middle element with the target:
// In this step, we can observe 3 different cases:

// If arr[mid] == target: We have found the target. From this step, we can return the index of the target possibly.
// If target > arr[mid]: This case signifies our target is located on the right half of the array. So, the next search space will be the right half.
// If target < arr[mid]: This case signifies our target is located on the left half of the array. So, the next search space will be the left half.

// Trim down the search space:
// Based on the probable location of the target we will trim down the search space.
// If the target occurs on the left, we should set the high pointer to mid-1. Thus the left half will be the next search space.
// Similarly, 

// Note: If the target is not present in the array, low and high will cross each other.


// Iterative implementation:
// Initially, the pointers low and high will be 0 and n-1(where n = size of the given array) respectively.
// Now inside a loop, we will perform the 3 steps discussed above in the algorithm section.
// The loop will run until either we fount the target or any of the pointers crosses the other.

// Complexity Analysis
// Time Complexity: In the algorithm, in every step, we are basically dividing the search space into 2 equal halves. This is actually equivalent to dividing the size of the array by 2, every time. After a certain number of divisions, the size will reduce to such an extent that we will not be able to divide that anymore and the process will stop. The number of total divisions will be equal to the time complexity. So the overall time complexity is O(logN), where N = size of the given array.
// Space Complexity: 0(1), no extra space being used



// Recursive implementation:
// We will use recursion to implement the binary search algorithm.