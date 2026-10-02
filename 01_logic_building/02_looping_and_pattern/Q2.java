package logic_building.looping_and_pattern;

// print even number from 1 to 100
public class Q2 {
    public static void main(String[] args) {

        // even 
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }

        // same as odd
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
        }

    }
}
