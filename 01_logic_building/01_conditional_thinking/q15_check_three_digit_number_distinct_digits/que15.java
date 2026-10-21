
import java.util.Scanner;

//Take a 3-digit number and check if all digits are distinct.
public class que15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();

        // Extract individual digits
        int h = (number / 100) % 10; // Hundreds place
        int t = (number / 10) % 10; // Tens place
        int u = number % 10; // Units place

        // Check if they are all different
        if (h != t && h != u && t != u) {
            System.out.println("All digits are distinct.");
        } else {
            System.out.println("Digits are not distinct.");
        }

        sc.close();
    }
}
