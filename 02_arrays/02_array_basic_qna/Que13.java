package arrays.array_basic_qna;

// find the sum of even elements only 
// find the sum od odd element only
public class Que13 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = 0;
        int oddSum =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2!= 0) {
                oddSum = oddSum + arr[i];
            }
        }
        System.out.println(sum);
        System.out.println(oddSum);
    }
}
