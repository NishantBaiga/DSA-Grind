package recursion.recursion_basic;

public class q1 {
    // print n to 1
    public static void print(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        print(n - 1);
    }

    // print 1 to n
    public static void print2(int n) {
        if (n == 0)
            return;
        print(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        print(5);
        // print2(5);
    }
}