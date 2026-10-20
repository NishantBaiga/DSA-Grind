
// calculate the power of a number
public class q5 {
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        if(base == 0){
            return 0 ;
        }


       return base * power(base, exponent - 1);
    }
    public static void main(String[] args) {
       int result = power(2, 3);
       System.out.println(result);
    }
}
