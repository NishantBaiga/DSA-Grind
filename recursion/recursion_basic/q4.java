package recursion.recursion_basic;

public class q4 {
    public static int fibonacci(int n) {
        if (n== 0) {
            return 0;
        }

        if (n==1) {
            return 1;
        }

        int ans = fibonacci(n-1) + fibonacci(n-2);
        return ans;

    }
    public static void main(String[] args) {
        int result = fibonacci(10);
        System.out.println(result);
    }
}
