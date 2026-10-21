
import java.util.Scanner;

//Check whether a given integer is single-digit, double-digit, or multi-digit.
public class que18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        // Use Math.abs so -5 is treated as single-digit and -25 as double-digit
        int absoluteNum = Math.abs(num);

        if (absoluteNum < 10) {
            System.out.println(num + " is a single-digit number.");
        } else if (absoluteNum < 100) {
            System.out.println(num + " is a double-digit number.");
        } else {
            System.out.println(num + " is a multi-digit number.");
        }

        scanner.close();

        // we can also use count digit .

    }
}
