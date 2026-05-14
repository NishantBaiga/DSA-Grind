package logic_building.queston_related_to_digit;

import java.util.ArrayList;
import java.util.List;

// print all the divisor of 36 
public class q7 {
    public static void main(String[] args) {
        int n = 36;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                // System.out.println(i);
            }
        }

        // List <Integer> list  = new ArrayList<>();
        // // opimize
        // for (int i = 1; i <= Math.sqrt(n); i++) {
        //     if (n % i == 0) {
        //         System.out.println(i);
        //     } else if (n % i != 0) {
        //         System.out.println(n / i);
        //     }
        // }
    }
}
