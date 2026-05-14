package arrays.array_basic_qna;

// find the count of negative , positive and zero numbers count
public class Que05 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 3, 0, -5, 769, 8, 9, 0, -17 };

        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negativeCount++;
            } else if (arr[i] > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("negativeCount :" + negativeCount);
        System.out.println("positiveCount :" + positiveCount);
        System.out.println("zeroCount :" + zeroCount);
    }
}