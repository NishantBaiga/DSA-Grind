
// Check if a number is a multiple of 7 or ends with 7.
public class que19 {
    public static void main(String[] args) {
        int num = 27;

        if (num % 7 == 0 || num % 10 == 7) {
            System.out.println(num + " is a multiple of 7 or ends with 7.");
        } else {
            System.out.println(num + " is not a multiple of 7 or does not end with 7.");
        }
    }
}
