
//  reverse a number 
public class q3 {
    public static void main(String[] args) {
        int n = 123456;
        System.out.println("original number : " + n);
        // way 1 
        // int reverseDigit = 0;
        // while (n > 0) {
        //     int digit = n % 10;
        //     n = n / 10;
        //     reverseDigit = reverseDigit * 10 + digit;
        // }
        // System.out.println(reverseDigit);

        // way 2
        while (n > 0) {
            int rev = n % 10;
            System.out.print(rev);
            n = n / 10;
        }

    }
}
