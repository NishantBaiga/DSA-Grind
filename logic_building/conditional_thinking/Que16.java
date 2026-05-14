package logic_building.conditional_thinking;
import java.util.Scanner;


// take a 3-digit number and check if the middle digit is largest, smallest, or neither
public class Que16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = scanner.nextInt();

        // Ensure it is a 3-digit number (basic validation)
        if (num < 100 || num > 999) {
            System.out.println("Please enter a valid 3-digit number.");
        } else {
            // Extract digits using math
            int hundreds = num / 100; // First digit
            int middle = (num % 100) / 10; // Middle digit
            int units = num % 10; // Last digit

            System.out.println("Digits: " + hundreds + ", " + middle + ", " + units);

            // Determine if middle is largest, smallest, or neither
            if (middle >= hundreds && middle >= units) {
                System.out.println("The middle digit (" + middle + ") is the largest (or equal).");
            } else if (middle <= hundreds && middle <= units) {
                System.out.println("The middle digit (" + middle + ") is the smallest (or equal).");
            } else {
                System.out.println("The middle digit (" + middle + ") is neither the largest nor smallest.");
            }
        }
        scanner.close();
    }
}
