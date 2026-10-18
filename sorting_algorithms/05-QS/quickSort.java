package sorting_algorithms;

public class quickSort {
    static void QuickSort(int [] arr, int left, int right){
        int pivot = partition(arr, left, right);
         QuickSort(arr, left, pivot-1);
         QuickSort(arr, pivot + 1, right);
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
        QuickSort(arr, 0, n - 1);
        printArray(arr);
    }
}

