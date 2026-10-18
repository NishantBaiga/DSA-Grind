
import java.util.Arrays;
import java.util.Scanner;

public class Arrays02_InputOutput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Size input
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        /*
        =========================================
        Input Array
        =========================================
        */

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        /*
        =========================================
        Output Array
        =========================================
        */

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}