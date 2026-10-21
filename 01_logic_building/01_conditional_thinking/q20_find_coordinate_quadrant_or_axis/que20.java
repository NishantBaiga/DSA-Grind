
// Take coordinates (x, y) and determine which quadrant the point lies in.
public class que20 {
    public static void main(String[] args) {
        int x = -5; 
        int y = 10; 

        if (x > 0 && y > 0) {
            System.out.println("Quadrant 1");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrant 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrant 3");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrant 4");
        } else if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (x == 0) {
            System.out.println("Y-Axis");
        } else {
            System.out.println("X-Axis");
        }
    }
}



