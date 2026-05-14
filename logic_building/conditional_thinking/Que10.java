package logic_building.conditional_thinking;


// take 3 value and check triangle or not
public class Que10 {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("triangle");
        } else {
            System.out.println("not triangle");
        }
    }
}
