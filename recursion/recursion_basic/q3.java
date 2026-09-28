package recursion.recursion_basic;

// calculate the power of a number
public class q3 {
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
       return base * power(base, exponent - 1);
    }
    public static void main(String[] args) {
       int result = power(2, 3);
       System.out.println(result);
    }
}
