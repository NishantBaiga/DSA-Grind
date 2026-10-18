// package sorting_algorithms;

public class bubleSort {

    static void BubleSort(int[] arr, int n) {
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
            if (!swap) {
                break; // array is sorted the break

            }
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
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; // 7 elements , 0 to 6 index
        int n = arr.length;
        BubleSort(arr, n);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
