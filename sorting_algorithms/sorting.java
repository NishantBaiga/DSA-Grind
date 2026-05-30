package sorting_algorithms;

public class sorting {
    static void bubbleSort(int[] arr, int n) {
        boolean swap;
        // swap track that is element swap or not . if we pass sorted array then it sort
        // array even if array is sorted.
        for (int i = 0; i < n; i++) { // we are looping till last element
            swap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {// arr[j] < arr[j + 1] if sort in decrement order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap)
                break; // array is sorted the break
        }
    }
    // for (int i = n - 1; i >= 0; i--) { //Use two nested loops to iterate over the
    // array
    // for (int j = 0; j <= i - 1; j++) {
    // if (arr[j] > arr[j + 1]) {
    // int temp = arr[j + 1];
    // arr[j + 1] = arr[j]; //Swap arr[j+1] with arr[i];
    // arr[j] = temp;
    // }
    // }
    // }

    static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) { // we are looping till last element-1 beacause if we have last element then it
                                          // is sorted
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < minIndex) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int temp = arr[i]; // store current element
            int j = i - 1; // check previous element
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j]; // shift
                j--;
            }
            arr[j + 1] = temp; // insert
        }
    }

    static void mergeSort(int[] arr) {
        int length = arr.length;
        if (length <= 1)
            return;

        int middle = length / 2;
        int[] arrayLeft = new int[middle];
        int[] arrayRight = new int[length - middle];

        int i = 0;
        int j = 0;
        for (; i < length; i++) {
            if (i < middle) {
                arrayLeft[i] = arr[i];
            } else {
                arrayRight[j] = arr[i];
                j++;
            }
        }

        mergeSort(arrayLeft);
        mergeSort(arrayRight);
        merge(arrayLeft, arrayRight, arr);
    }

    static void merge(int[] arrayLeft, int[] arrayRight, int[] arr) {
        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize;
        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize) {
            if (arrayLeft[l] < arrayRight[r]) {
                arr[i] = arrayLeft[l];
                i++;
                l++;
            } else {
                arr[i] = arrayRight[r];
                i++;
                r++;
            }
        }

        while (l < leftSize) {
            arr[i] = arrayLeft[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            arr[i] = arrayRight[r];
            i++;
            r++;
        }
    }

    static void quickSort(int [] arr, int left, int right){
        int pivot = partition(arr, left, right);
         quickSort(arr, left, pivot-1);
         quickSort(arr, pivot + 1, right);
    }

    static int partition(int[] arr, int left, int right) {
        int i = left - 1;
        int pivot = arr[right];
        for (int j = 0; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1 ] ;
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i+1;
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 }; // 7 elements , 0 to 6 index
        int n = arr.length;
        // bubbleSort(arr, n);
        // selectionSort(arr, n);
        // insertionSort(arr, n);
        // mergeSort(arr);
        quickSort(arr, 0, n - 1);

        printArray(arr);
    }
}

// Bubble sort is a simple sorting algorithm.
// It repeatedly compares side-by-side items and swaps them if they are in the
// wrong order.
// Compare the first two items.
// Swap them if the first is larger.
// Move to the next pair.
// Repeat until the largest item "bubbles" to the end.
// Loop through the list until everything is sorted.
// Worst Speed: O(n^2) (very slow for large lists).
// Best Speed: O(n) (if already sorted).
// Memory: O(1) (uses no extra space).

// Approach:
// Select the range of the unsorted array: Use an outer loop (i) that runs
// backward from n-1 to 0 (where n is the size of the array). The value i = n-1
// means the range is from 0 to n-1, i = n-2 means the range is from 0 to n-2,
// and so on.
// Push the maximum element to the end of the selected range: Use an inner loop
// (j) that runs from 0 to i-1. Compare adjacent elements and swap them if
// arr[j] > arr[j+1]. Repeating this process ensures the maximum element in the
// current range moves to index i.
// Progressively sort the array: After each outer loop iteration, the last part
// of the array becomes sorted. For example:
// After the first iteration, the element at the last index is sorted.
// After the second iteration, the last two elements are sorted.
// This continues until the entire array is sorted.
// Complete sorting: After n-1 iterations, the whole array will be sorted.
// Note: After each iteration, the sorted portion grows from the end, so the
// last index of the unsorted range decreases by 1 (controlled by i). The inner
// loop (j) ensures the maximum element in the range [0…i] is placed at index i.

// Selection sort is a simple, comparison-based sorting algorithm that works by
// repeatedly finding the smallest element from an unsorted portion of a list
// and moving it to the beginning. It is an in-place algorithm, meaning it
// requires very little extra memory (constant \(O(1)\) space).

// How Selection Sort Works
// The algorithm conceptually divides the input list into two parts: a sorted
// sublist (built from left to right) and an unsorted sublist.
// Find the Minimum: Search the entire unsorted portion to find the smallest
// value.
// Swap: Exchange this smallest value with the element at the first position of
// the unsorted portion.
// Repeat: Move the boundary between the sorted and unsorted portions one step
// to the right and repeat until the entire list is sorted.

// Complexity Analysis
// Selection sort has a very predictable performance profile because it always
// scans the remaining unsorted portion regardless of the initial order.
// Time Complexity: O(n^2) for best, average, and worst cases.
// Space Complexity: O(1) auxiliary space.
// Stability: Not Stable; it does not necessarily preserve the relative order of
// equal elements because of non-adjacent swaps.

// Algorithm
// First, we will select the range of the unsorted array using a loop (say i)
// that indicates the starting index of the range.
// The loop will run forward from 0 to n-1.
// The value i = 0 means the range is from 0 to n-1, and similarly, i = 1 means
// the range is from 1 to n-1, and so on.
// (Initially, the range will be the whole array starting from the first index.)
// Now, in each iteration, we will select the minimum element from the range of
// the unsorted array using an inner loop.
// After that, we will swap the minimum element with the first element of the
// selected range(in step 1).
// Finally, after each iteration, we will find that the array is sorted up to
// the first index of the range.

// Insertion sort is a simple, in-place sorting algorithm that builds a sorted
// list one item at a time.
// It evaluates elements sequentially, shifting larger elements to the right and
// "inserting" each evaluated element into its correct position within the
// already sorted portion of the array.

// How it WorksThink of it like sorting a hand of playing cards: you keep the
// sorted cards in one hand and draw from the unsorted cards.
// Assume the first element is already sorted.Pick the next unsorted element and
// store it (often called the key).
// Compare the key to the elements in the sorted portion, moving right to
// left.If an element in the sorted portion is greater than the key, shift it
// one position to the right.
// Repeat shifting until you find an element smaller than the key (or reach the
// start of the list), then insert the key in that space.Repeat for all
// elements.

// ComplexityTime Complexity:
// Best Case: O(n) — Occurs when the array is already sorted.
// Worst & Average Case: O(n^2) — Occurs when the array is in reverse order or
// randomly ordered.
// Space Complexity: O(1) — It sorts the array in-place, requiring no additional
// memory.
// Stability: Stable (maintains the relative order of identical elements).
// When to Use ItInsertion sort is highly efficient for small datasets or arrays
// that are already mostly sorted.
// Because of its low overhead, it is frequently used as a base-case subroutine
// in hybrid sorting algorithms like Timsort (used in Python and Java) and
// IntroSort to handle small sub-arrays.