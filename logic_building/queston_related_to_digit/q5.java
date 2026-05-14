package logic_building.queston_related_to_digit;

// check armstrong number 371 = 3^3 + 7^3 = 1^3 = 371 , 1634 
public class q5 {
    public static void main(String[] args) {
        int n = 153;
        int sum = 0;
        int reverseDigit = 0;
        int dup = n;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit * digit * digit;
            n = n / 10;
            reverseDigit = reverseDigit * 10 + digit;
        }
        if (sum == dup) {
            System.out.println("armstrong number");
        } else {
            System.out.println("not armstrong number");
        }
    }
}
