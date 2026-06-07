package arrays.array_basic;

import java.util.Arrays;

public class Arrays01_Basics {

    public static void main(String[] args) {

        /*
        =========================================
        1. Declaration
        =========================================
        */

        int[] arr1;

        /*
        =========================================
        2. Creation
        =========================================
        */

        arr1 = new int[5];

        /*
        Default values:
        int -> 0
        double -> 0.0
        boolean -> false
        String -> null
        */

        System.out.println(arr1[0]);

        /*
        =========================================
        3. Assign Values One By One
        =========================================
        */

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;

        System.out.println(Arrays.toString(arr1));

        /*
        =========================================
        4. Declaration + Creation
        =========================================
        */

        int[] arr2 = new int[3];

        arr2[0] = 100;
        arr2[1] = 200;
        arr2[2] = 300;

        System.out.println(Arrays.toString(arr2));

        /*
        =========================================
        5. Direct Initialization
        =========================================
        */

        int[] arr3 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arr3));

        /*
        =========================================
        6. Anonymous Array
        =========================================
        */

        System.out.println(
                new int[]{10, 20, 30}[1]
        );

        /*
        =========================================
        7. Different Data Type Arrays
        =========================================
        */

        String[] names = {
                "Nishant",
                "Rahul",
                "Aman"
        };

        double[] marks = {
                85.5,
                90.2,
                78.8
        };

        char[] grades = {
                'A',
                'B',
                'C'
        };

        boolean[] status = {
                true,
                false,
                true
        };

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(grades));
        System.out.println(Arrays.toString(status));

        /*
        =========================================
        8. Array Length
        =========================================
        */

        System.out.println(arr3.length);

        /*
        =========================================
        9. Access Elements
        =========================================
        */

        System.out.println(arr3[0]);
        System.out.println(arr3[4]);

        /*
        =========================================
        10. Update Element
        =========================================
        */

        arr3[2] = 100;

        System.out.println(Arrays.toString(arr3));
    }
}