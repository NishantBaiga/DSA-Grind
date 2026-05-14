package arrays.array_basic_qna;

//  coutn how many times a given element appears 
public class Que10 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 1, 2, 3, 33, 3 };
        int n = 33;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }
        System.out.println(count);
    }
}
