package arrays.array_basic_qna;

//find the average of array elements
public class Que03 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
            // sum = sum +arr[i];
        }
        int avg = sum/arr.length;
        System.out.println(avg);
    }
}
