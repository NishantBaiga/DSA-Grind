package logic_building.queston_related_to_digit;

public class q8 {
    // take 3 digit number and check if all digits are distinct
    static void q1() {
        int number = 123; // Change this to test other numbers

        // Extract individual digits
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;

        System.out.println("Hundreds: " + hundreds);
        System.out.println("Tens: " + tens);
        System.out.println("Units: " + units);

        // Check if all pairs are unique
        if (hundreds != tens && tens != units && hundreds != units) {
            System.out.println(number + " has distinct digits.");
        } else {
            System.out.println(number + " does not have distinct digits.");
        }
    }

    // take 3 digit number and check the relationship of the middle digit
    static void q2() {
        int number = 385; // Change this to test other numbers

        // Extract individual digits
        int hundreds = number / 100;
        int middle = (number / 10) % 10;
        int units = number % 10;

        // Check the relationship of the middle digit
        if (middle > hundreds && middle > units) {
            System.out.println("The middle digit (" + middle + ") is the LARGEST.");
        } else if (middle < hundreds && middle < units) {
            System.out.println("The middle digit (" + middle + ") is the SMALLEST.");
        } else {
            System.out.println("The middle digit (" + middle + ") is NEITHER.");
        }
    }

    // take 4 digit number and check if the first and last digits are equal
    static void q3() {
        int number = 4524; // Change to test other numbers

        // Extract digits
        int firstDigit = number / 1000;
        int lastDigit = number % 10;

        // Compare digits
        if (firstDigit == lastDigit) {
            System.out.println("The first and last digits are EQUAL.");
        } else {
            System.out.println("The first and last digits are NOT EQUAL.");
        }
    }

    // take a number and check the number of digits
    static void q4() {
        int number = -45; // Change to test other numbers

        // Use Math.abs to correctly handle negative numbers
        int absNumber = Math.abs(number);

        // Check digit categories based on value ranges
        if (absNumber < 10) {
            System.out.println(number + " is a SINGLE-DIGIT number.");
        } else if (absNumber < 100) {
            System.out.println(number + " is a DOUBLE-DIGIT number.");
        } else {
            System.out.println(number + " is a MULTI-DIGIT number.");
        }
    }

    // take a number and check if it is a multiple of 7 or ends with 7
    static void q5() {
        int number = 27; // Change to test other numbers

        // Check both conditions using the absolute value for negatives
        boolean isMultipleOf7 = (number % 7 == 0);
        boolean endsWith7 = (Math.abs(number) % 10 == 7);

        // Evaluate conditions using the logical OR (||) operator
        if (isMultipleOf7 || endsWith7) {
            System.out.println(number + " satisfies the condition.");

            // Optional: Print the specific reason
            if (isMultipleOf7 && endsWith7) {
                System.out.println("Reason: It is both a multiple of 7 and ends with 7.");
            } else if (isMultipleOf7) {
                System.out.println("Reason: It is a multiple of 7.");
            } else {
                System.out.println("Reason: It ends with 7.");
            }
        } else {
            System.out.println(number + " does not satisfy the condition.");
        }
    }

    // take a number and check if the sum of the first and last digits is equal to the middle digit
    static void q6() {
        int number = 132; // Change this to test other numbers

        // Ensure the number is a positive 3-digit number
        int absNumber = Math.abs(number);

        if (absNumber >= 100 && absNumber <= 999) {
            // Extract individual digits
            int firstDigit = absNumber / 100;
            int middleDigit = (absNumber / 10) % 10;
            int lastDigit = absNumber % 10;

            // Check if the sum of first and last equals the middle
            if ((firstDigit + lastDigit) == middleDigit) {
                System.out.println(number + " satisfies the condition ("
                        + firstDigit + " + " + lastDigit + " = " + middleDigit + ").");
            } else {
                System.out.println(number + " does not satisfy the condition.");
            }
        } else {
            System.out.println("Please provide a valid 3-digit number.");
        }
    }

    public static void main(String[] args) {
        // q1();
        // q2();
        // q3();
        // q4();
        // q5();
        // q6();
        
    }
}
