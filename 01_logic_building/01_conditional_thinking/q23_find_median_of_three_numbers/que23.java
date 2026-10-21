
// take 3 number a return median number
public class que23 {
    public static void main(String[] args) {
        int a = 22, b = 30, c = 9;

        int median;

        if (a >= b && a <= c || a <= b && a >= c) {
            median = a;
        } else if (b >= a && b <= c || b <= a && b >= c) {
            median = b;
        } else {
            median = c;
        }
        System.out.println(median);
    }
}
