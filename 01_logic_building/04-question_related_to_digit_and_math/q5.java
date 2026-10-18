package logic_building.question_related_to_digit_and_math;

// check armstrong number 371 = 3^3 + 7^3 = 1^3 = 371 , 1634 
public class q5 {
    public static void main(String[] args) {
        int n = 153;
        int sum = 0;
        int reverseDigit = 0;
        int dup = n;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit * digit * digit;
            n = n / 10;
            reverseDigit = reverseDigit * 10 + digit;
        }
        if (sum == dup) {
            System.out.println("armstrong number");
        } else {
            System.out.println("not armstrong number");
        }
    }
}
// here we are check for 3 numbers but what if we want to check for n numbers. take input 



// import java.util.Scanner;

// public class ArmstrongNumberChecker {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Enter an integer to check: ");
//         int originalNumber = scanner.nextInt();
        
//         if (originalNumber < 0) {
//             System.out.println(originalNumber + " is NOT an Armstrong number.");
//             scanner.close();
//             return;
//         }

//         // Step 1: Count digits manually without string methods
//         int temp = originalNumber;
//         int digits = 0;
        
//         // Handle the edge case for zero
//         if (temp == 0) {
//             digits = 1;
//         }
        
//         while (temp > 0) {
//             digits++;
//             temp /= 10;
//         }
        
//         // Step 2: Compute sum of digits raised to the power of 'digits'
//         temp = originalNumber;
//         int sum = 0;
        
//         while (temp > 0) {
//             int remainder = temp % 10;
//             // Use custom power function instead of Math.pow()
//             sum += power(remainder, digits);
//             temp /= 10;
//         }
        
//         // Step 3: Check and display results
//         if (sum == originalNumber) {
//             System.out.println(originalNumber + " is an Armstrong number.");
//         } else {
//             System.out.println(originalNumber + " is NOT an Armstrong number.");
//         }
        
//         scanner.close();
//     }

//     // Custom helper method to calculate base raised to exponent
//     private static int power(int base, int exponent) {
//         int result = 1;
//         for (int i = 0; i < exponent; i++) {
//             result *= base;
//         }
//         return result;
//     }
// }
