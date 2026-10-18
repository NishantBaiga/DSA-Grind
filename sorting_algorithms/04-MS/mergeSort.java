package sorting_algorithms;

public class mergeSort {
    static void MergeSort(int[] arr) {
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

        MergeSort(arrayLeft);
        MergeSort(arrayRight);
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

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 }; // 7 elements , 0 to 6 index
        int n = arr.length;
        MergeSort(arr);
        printArray(arr);
    }
}

