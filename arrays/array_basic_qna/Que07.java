package arrays.array_basic_qna;

// find the index of maximum and minimum element in array
public class Que07 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        int maxIndex = 0;
        int minindex = 0;
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            } else if (arr[i] < min) {
                min = arr[i];
                minindex = i;
            }
        }

        System.out.println("max element index :" + maxIndex);
        System.out.println("min element index :" + minindex);
    }
}
