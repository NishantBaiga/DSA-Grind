package sorting_algorithms;

public class selectionSort {

    static void SelectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            // we are looping till last element-1 beacause if we have last element then it
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

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; // 7 elements , 0 to 6 index
        int n = arr.length;
        SelectionSort(arr, n);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
