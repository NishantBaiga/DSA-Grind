package searching_algorithm;

public class linearSearch {
        static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if target does not exist
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 7 };
        int target = 9;
        System.out.println("Index found at: " + search(arr, target));
    }

}
