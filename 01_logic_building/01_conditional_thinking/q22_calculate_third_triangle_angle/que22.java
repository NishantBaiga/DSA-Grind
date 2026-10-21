
// Take two angles of a triangle and compute the third angle.
public class que22 {
    public static void main(String[] args) {
        double angle1 = 45.0;
        double angle2 = 60.5;

        // Validation check for positive inputs
        if (angle1 > 0 && angle2 > 0 && (angle1 + angle2) < 180) {
            double angle3 = 180.0 - (angle1 + angle2);
            System.out.println("The third angle is: " + angle3 + " degrees");
        } else {
            System.out.println("Invalid angles. They must be positive and their sum must be less than 180.");
        }
    }
}
