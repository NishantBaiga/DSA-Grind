
public class q14 {

    public static int printEvenSum(int n) {
        if (n < 2) {
            return 0;
        }
        
        // here we are checking is number is odd or not if yes pass n-1 to make number even 
        if (n%2 != 0) {
            return printEvenSum(n-1);
        }
       int ans =  n + printEvenSum(n-2);
       return ans ;
    }

    public static int printOddSum(int n) {
        if (n < 1) {
            return 0;
        }
        
        // here we are checking is number is odd or not if yes pass n-1 to make number even 
        if (n%2 == 0) {
            return printEvenSum(n-1);
        }
       int ans =  n + printEvenSum(n-2);
       return ans ;
    }


    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum of even numbers up to " + n + " is: " + printEvenSum(n));
    }
}
