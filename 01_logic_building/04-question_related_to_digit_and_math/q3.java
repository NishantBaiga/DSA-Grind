package logic_building.question_related_to_digit_and_math;

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
