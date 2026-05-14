package arrays.array_dsa_pattern.two_pointer;


// remove duplicate from sorted array 2 . leetcode 80.
public class Q5 {
    public static void main(String[] args) {
        int [] arr = {1,1,1,2,2,3};

        if(arr.length <= 2 ) return;

        int i = 2;
        for (int j = 2; j < arr.length; j++) {
            if (arr[i] != arr[j -2]) {
                arr[++i] = arr[j];
            }
        }
        System.out.println(i+2);  // i+2 because we start from 2
    }
}
