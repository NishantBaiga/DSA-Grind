
// find sum of digit of a number
public class q6 {
    public static int digitSum(int num) {
        if (num == 0) {
            return 0  ;
        }
        int digit = num % 10;
        // Recursive step: extract last digit + recurse for the remaining digits
        int sum = digit + digitSum(num / 10);
        return sum;
    }

    public static void main(String[] args) {
        // n%10 get last digit 
        // n/10 remove last digit
        // given n 
        // work sum of digit 
        // base case n=0 stop
       int a = digitSum(123);
       System.out.println(a);

    }
}
