package arrays.array_basic_qna;
import java.util.Scanner;

// get input from use and print array 
public class Que01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size :");
        int size = sc.nextInt();

        System.out.println("enter array elements :");

        int [] arr = new int [size];
        for (int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }


        System.out.println("array ");
        for(int val : arr) System.out.println(val);
        sc.close();
    }
}
