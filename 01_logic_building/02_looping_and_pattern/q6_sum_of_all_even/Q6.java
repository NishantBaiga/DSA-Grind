
// print the sum f all even numbers
public class Q6 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10; i += 2) {
            sum += i;
        }
        System.out.println(sum);

        int oddSum = 0;
        for (int i = 1; i <= 10; i += 2) {
            oddSum += i;
        }
        System.out.println(oddSum);

    }
}
