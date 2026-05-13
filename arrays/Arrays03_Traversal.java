package arrays;
import java.util.Arrays;
public class Arrays03_Traversal {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        /*
        =========================================
        1. Forward Traversal
        =========================================
        */

        System.out.println("Forward Traversal:");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

        /*
        =========================================
        2. Backward Traversal
        =========================================
        */

        System.out.println("\n\nBackward Traversal:");

        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.print(arr[i] + " ");
        }

        /*
        =========================================
        3. Enhanced For Loop
        =========================================
        */

        System.out.println("\n\nFor-Each Traversal:");

        for (int value : arr) {

            System.out.print(value + " ");
        }

        /*
        =========================================
        4. Traverse Even Indexes
        =========================================
        */

        System.out.println("\n\nEven Index Elements:");

        for (int i = 0; i < arr.length; i += 2) {

            System.out.print(arr[i] + " ");
        }

        /*
        =========================================
        5. Traverse Odd Indexes
        =========================================
        */

        System.out.println("\n\nOdd Index Elements:");

        for (int i = 1; i < arr.length; i += 2) {

            System.out.print(arr[i] + " ");
        }

        /*
        =========================================
        6. Traverse Even Elements
        =========================================
        */

        System.out.println("\n\nEven Elements:");

        for (int num : arr) {

            if (num % 2 == 0) {

                System.out.print(num + " ");
            }
        }

        /*
        =========================================
        7. Traverse Odd Elements
        =========================================
        */

        System.out.println("\n\nOdd Elements:");

        for (int num : arr) {

            if (num % 2 != 0) {

                System.out.print(num + " ");
            }
        }

        /*
        =========================================
        8. Traverse Alternate Elements
        =========================================
        */

        System.out.println("\n\nAlternate Elements:");

        for (int i = 0; i < arr.length; i += 2) {

            System.out.print(arr[i] + " ");
        }

        /*
        =========================================
        9. Traverse Specific Range
        =========================================
        */

        System.out.println("\n\nRange Traversal:");

        int start = 1;
        int end = 3;

        for (int i = start; i <= end; i++) {

            System.out.print(arr[i] + " ");
        }

        /*
        =========================================
        10. Skip Specific Element
        =========================================
        */

        System.out.println("\n\nSkip Element 30:");

        for (int num : arr) {

            if (num == 30) {

                continue;
            }

            System.out.print(num + " ");
        }

        /*
        =========================================
        11. Stop Traversal Early
        =========================================
        */

        System.out.println("\n\nStop at 40:");

        for (int num : arr) {

            if (num == 40) {

                break;
            }

            System.out.print(num + " ");
        }

        /*
        =========================================
        12. Traverse Empty Array
        =========================================
        */

        System.out.println("\n\nEmpty Array:");

        int[] empty = {};

        for (int num : empty) {

            System.out.print(num + " ");
        }

        /*
        =========================================
        13. Single Element Array
        =========================================
        */

        System.out.println("\n\nSingle Element:");

        int[] single = {100};

        for (int num : single) {

            System.out.print(num + " ");
        }

        /*
        =========================================
        14. Traverse Using While Loop
        =========================================
        */

        System.out.println("\n\nWhile Loop Traversal:");

        int i = 0;

        while (i < arr.length) {

            System.out.print(arr[i] + " ");

            i++;
        }

        /*
        =========================================
        15. Traverse Using Do-While
        =========================================
        */

        System.out.println("\n\nDo-While Traversal:");

        int j = 0;

        do {

            System.out.print(arr[j] + " ");

            j++;

        } while (j < arr.length);

        /*
        =========================================
        16. Reverse Traversal with Conditions
        =========================================
        */

        System.out.println("\n\nReverse Even Elements:");

        for (int k = arr.length - 1; k >= 0; k--) {

            if (arr[k] % 2 == 0) {

                System.out.print(arr[k] + " ");
            }
        }

        /*
        =========================================
        17. Modify While Traversing
        =========================================
        */

        System.out.println("\n\nDouble Elements:");

        int[] nums = {1, 2, 3, 4};

        for (int k = 0; k < nums.length; k++) {

            nums[k] = nums[k] * 2;
        }

        System.out.println(Arrays.toString(nums));

        /*
        =========================================
        18. Count Specific Elements
        =========================================
        */

        System.out.println("\nCount Even Numbers:");

        int count = 0;

        for (int num : arr) {

            if (num % 2 == 0) {

                count++;
            }
        }

        System.out.println(count);
    }
}