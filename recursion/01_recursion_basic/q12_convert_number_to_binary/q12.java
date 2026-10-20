
public class q12 {
    public static int toBinaryInt(int n) {
        if (n == 0) {
            return 0;
        }

        int reminder = n % 2;
        int ans = reminder + 10 * toBinaryInt(n / 2);
        return ans;
    }
    public static void main(String[] args) {
        int n = 13;
        System.out.println("Binary of " + n + " is: " + toBinaryInt(n)); // Output: 1101

        // System.out.println(12/2);
    }
}
