package logic_building.queston_related_to_digit;

// extract digit and print 
public class q1 {
    public static void main(String[] args) {
        int n = 12345;
        // System.out.println(n%10);
        // System.out.println(n/10);

        while (n > 0) {
            int digit = n % 10;
            System.out.println(digit);
            n=n/10;
        }

    }
}
