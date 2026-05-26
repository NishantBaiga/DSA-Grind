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
            }else if(arr[mid] < target){
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
