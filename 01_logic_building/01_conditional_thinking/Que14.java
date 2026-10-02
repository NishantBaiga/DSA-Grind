package logic_building.conditional_thinking;

// Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”, “Good Evening”, or “Good Night”.
public class Que14 {
    public static void main(String[] args) {
        int h = 2;

        if (h >= 0 && h < 12) {
            System.out.println("Good Morning");
        } else if (h >= 12 && h < 16) {
            System.out.println("Good Afternoon");
        } else if (h >= 16 && h < 20) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night");
        }
    }
}
