package arrays.array_dsa_pattern.sliding_window;
import java.util.Arrays;

// 904. Fruit Into Baskets
// Medium
// https://leetcode.com/problems/fruit-into-baskets/


// You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.

// You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

// You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
// Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
// Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
// Given the integer array fruits, return the maximum number of fruits you can pick.

// Example 1:

// Input: fruits = [1,2,1]
// Output: 3
// Explanation: We can pick from all 3 trees.
// Example 2:

// Input: fruits = [0,1,2,2]
// Output: 3
// Explanation: We can pick from trees [1,2,2].
// If we had started at the first tree, we would only pick from trees [0,1].
// Example 3:

// Input: fruits = [1,2,3,2,2]
// Output: 4
// Explanation: We can pick from trees [2,3,2,2].
// If we had started at the first tree, we would only pick from trees [1,2].
 

// Constraints:

// 1 <= fruits.length <= 105
// 0 <= fruits[i] < fruits.length
public class q5 {

    public static int totalFruit(int[] fruits) {

        // Write your solution here

        return 0;
    }

    public static void main(String[] args) {

        int[][] testCases = {
                {1, 2, 1},
                {0, 1, 2, 2},
                {1, 2, 3, 2, 2},
                {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4},
                {1},
                {1, 1, 1, 1},
                {1, 2, 1, 2, 1, 2},
                {1, 2, 3, 4, 5},
                {0, 1, 6, 6, 4, 4, 6},
                {1, 0, 1, 4, 1, 4, 1, 2, 3}
        };

        int[] expected = {
                3,
                3,
                4,
                5,
                1,
                4,
                6,
                2,
                5,
                5
        };

        for (int i = 0; i < testCases.length; i++) {

            int ans = totalFruit(testCases[i]);

            System.out.println("Test Case " + (i + 1));
            System.out.println("Input    : " + Arrays.toString(testCases[i]));
            System.out.println("Expected : " + expected[i]);
            System.out.println("Output   : " + ans);
            System.out.println(ans == expected[i] ? "PASS" : "FAIL");
            System.out.println("-----------------------------------------");
        }
    }
}