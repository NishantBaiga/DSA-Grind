package logic_building.question_related_to_digit_and_math;

// extract digit and count 
public class q2 {
    public static void main(String[] args) {
        int n = 123456;
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            count++;
            System.out.println(digit);
            n = n / 10;
        }
        System.out.println("digit count : " + count);

        //  we can also count digit using log log10(n) and add 1 then conver to integer, (int) (log10(N) + 1);

    }
}
