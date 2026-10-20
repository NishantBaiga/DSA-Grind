
// fibonacci series c = a+b  , 0,1 are first two terms , b is first last term and a is 2nd last 
public class q4 {
    public static void printFibonacci(int a, int b, int n) {
        if (n <= 0) {// handle negative and zero
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFibonacci(b, c, n - 1);
    }
    public static void printFibonacci2(int a, int b, int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(a);
        printFibonacci(b, a + b, n - 1);
    }

    public static void main(String[] args) {
        int n = 4;
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        printFibonacci(a, b, n - 2);  // we pass here n-2 because we know 1st and 2nd term is 0 and 1
        printFibonacci(0,1,5);  // 
    }
}