package logic_building.queston_related_to_digit;

// find the sum of digit  and product of digit
public class q6 {
    public static void main(String[] args) {
        int n = 123456;
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n = n / 10;
        }
        System.out.println(sum);
        System.out.println(product);
    }
}
