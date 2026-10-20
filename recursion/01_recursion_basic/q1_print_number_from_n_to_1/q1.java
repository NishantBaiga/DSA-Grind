
// print n to 1 , 1 to n 
public class q1 {
    // print n to 1
    public static void print(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        print(n - 1);
    }

    // print 1 to 5
    public static void print2(int n) {
        if (n == 6)
            return;
        System.out.println(n);
        print2(n + 1);
    }


    // print 1 to n 
    public static void print3(int n, int m) {
        if (n == m)
            return;
        System.out.println(n);
        print3(n + 1 ,m);
    }

    // print only even 
    public static void printEven(int n, int m){
        if (n > m)
            return;
        System.out.println(n);
        printEven(n + 2 ,m);
    }

    // print only odd
    public static void printOdd(int n, int m){
        if (n > m)
            return;
        System.out.println(n);
        printOdd(n + 2 ,m);
    }
    public static void main(String[] args) {
        print(5);
        print2(1);
        print3(1, 10);
        printEven(2, 10);
        printOdd(1, 10);
    }
}