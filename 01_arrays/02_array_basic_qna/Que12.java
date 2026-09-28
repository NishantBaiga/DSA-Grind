package arrays.array_basic_qna;

// check if all elements are unique or not
public class Que12 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 34, 1, 4, 2, 5 };

        boolean unique = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    unique = false;
                    break;
                }
            }
            if (!unique) {
                break;
            }
        }

        if (unique) {
            System.out.println("All elements in the array are unique.");
        } else {
            System.out.println("The array contains duplicate elements.");
        }
    }
}
