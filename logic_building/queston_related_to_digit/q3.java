package logic_building.queston_related_to_digit;

//  reverse a number 
public class q3 {
    public static void main(String[] args) {
        int n = 123456;
        int reverseDigit = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            reverseDigit = reverseDigit * 10 + digit;
        }
        System.out.println(reverseDigit);

    }
}
