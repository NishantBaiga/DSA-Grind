
import java.util.Scanner;

// print table of given number 
public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number whose tabel you want ");
        int a = sc.nextInt();
        System.out.println("enter number how many times you want to ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            System.out.println(i * a);
        }

        sc.close();
    }
}
