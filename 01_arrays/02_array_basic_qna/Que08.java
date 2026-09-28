package arrays.array_basic_qna;

// take n elements and and print only those greater than given k 
public class Que08 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 3;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < k){
                continue;
            }else System.out.println(i);
        }
    }
}