// check if a number is palindrome or not 
public class q9 {
    public static int reversed(int n, int reversed) {
        if (n == 0) {
            return reversed;
        }

        int lastDigit = n % 10;
        reversed = (reversed * 10) + lastDigit;
        return reversed(n / 10, reversed);
    }

    public static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }
        return n == reversed(n, 0);
    }

    public static void main(String[] args) {
        int n = 121;
        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome number.");
        } else {
            System.out.println(n + " is not a palindrome number.");
        }

    }
}
