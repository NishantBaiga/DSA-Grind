
//Take a 4-digit number and check if the first and last digits are equal.
public class que17 {
    public static void main(String[] args) {
          int number = 4324; // You can change this to test other numbers

        // 1. Get the last digit using modulo 10
        int lastDigit = number % 10;

        // 2. Get the first digit by dividing by 1000 
        // (Since it's a 4-digit number, this moves the decimal 3 places)
        int firstDigit = number / 1000;

        // 3. Compare them
        if (firstDigit == lastDigit) {
            System.out.println("Match! The first and last digits are both " + firstDigit);
        } else {
            System.out.println("No match. First: " + firstDigit + ", Last: " + lastDigit);
        }
    }
}
