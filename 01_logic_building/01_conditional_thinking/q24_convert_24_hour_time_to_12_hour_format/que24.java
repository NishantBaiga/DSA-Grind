
import java.util.Scanner;

// take 24 hours time (0-24) and 60 minutes (0-59) and print it in 12 hours format with AM/PM
public class que24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter hours 0-24");
        int hours = sc.nextInt();

        System.out.println("enter minutes 0-59");
        int minutes = sc.nextInt();

        if (hours < 0 || hours > 24 || minutes < 0 || minutes > 59) {
            System.err.println("invalid input");
        } else {
            String period;
            if (hours >= 12) {
                period = "PM";
            } else {
                period = "AM";
            }

            int displayHours = hours;
            if (hours == 0) {
                displayHours = 12;
            } else {
                displayHours = hours - 12;
            }
            System.out.printf("The time is: %d:%02d %s\n", displayHours, minutes, period);
        }

        sc.close();
        
    }
}
