
// check palindrome 121 = 121 , 1331= 1331
public class q4 {
    public static void main(String[] args) {
        int n = 121;
        int duplicate = n;
        int reverseDigit = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            reverseDigit = reverseDigit * 10 + digit;
        }
        if (duplicate == reverseDigit) {
            System.err.println("number is palindrome");
        }else System.out.println("not a palindrome");
    }
}
