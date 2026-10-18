package logic_building.question_related_to_digit_and_math;
import java.util.ArrayList;

// print all the divisor of 36 
public class q7 {
    public static void main(String[] args) {
        int n = 36;

        // normal  time complexity O(n)
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        // opimize
        ArrayList <Integer> list  = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) { // i*i <= n because math.sqrt(n) is a function 
            if (n % i == 0) {
                // System.out.println(i);
                list.add(i);

                if ((n%1) != i) {
                    list.add(n/i);
                }
            }
        }

        list.sort(null);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
