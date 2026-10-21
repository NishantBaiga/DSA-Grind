

// print factorial 
public class Q7 {
    public static void main(String[] args) {
        int n = 3;
        int factorial =1;
        // check edge cases fact 1 , fact 0
        for (int i = 1; i <= n; i++) {
            factorial = factorial *i;
        }
        System.out.println(factorial);
    }
}
