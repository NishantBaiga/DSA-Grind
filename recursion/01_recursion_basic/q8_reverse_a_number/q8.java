// reverse a number recursively 

public class q8 {

    public static void rev(int n) {
        if (n < 10) {
            System.out.print(n);
            return;
        } else {
            // This prints the last digit of the current number.
            // Example: if n = 12345, then n % 10 = 5, so 5 is printed first.
            System.out.print(n % 10);

            // This removes the last digit and calls the function again with the smaller number.
            // Example: 12345 / 10 = 1234, then it keeps going until the number has 1 digit left.
            rev(n / 10);
        }
    }

    public static int rev2(int n, int sum) {
        if (n == 0) {
            return sum;
        } else {

            int c = n % 10;
            sum = (sum * 10) + c;
            int a = rev2(n / 10, sum);
            return a;
        }
    } 

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("original number :" + n);
        // rev(n);
        int ans = rev2(n, 0);
        System.out.println(ans);

        // given num
        // work reverse
        // base case 
    }
}
