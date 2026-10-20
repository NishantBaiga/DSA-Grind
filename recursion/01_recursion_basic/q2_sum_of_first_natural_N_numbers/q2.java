
// sum of first n natural number n =5 , 1+2+3+4+5 = 15
public class q2 {

    public static void sum(int i, int n, int sum) {
        if (i == n) {
            sum +=i;
            System.err.println(sum);
            return;
        }
        sum += i;
        sum(i + 1, n, sum);

        // 1,5,0
        // 2,5,1
        // 3,5,3
        // 4,5,6
        // 5,5,10
        // 5,5,15
    }

    public static void main(String[] args) {
        sum(1, 5 , 0);
    }
}
