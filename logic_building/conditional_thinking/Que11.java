package logic_building.conditional_thinking;

// take 3 value and check triangle or not and check triangle is equilateral, isosceles, scalene
public class Que11 {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("triangle");
            if (a == b && b == c) {
                System.out.println("equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("isosceles");
            } else {
                System.out.println("scalene");
            }
        } else {
            System.out.println("not triangle");

        }
    }
}
