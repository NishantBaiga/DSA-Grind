package sorting_algorithms;

public class insertionSort {
   
 static void Sort(int[] arr, int n) {
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

   

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 }; // 7 elements , 0 to 6 index
        int n = arr.length;
        Sort(arr, n);
        printArray(arr);
    }
}

