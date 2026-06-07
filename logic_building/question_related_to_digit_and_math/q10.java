package logic_building.question_related_to_digit_and_math;

// check prime or not.
// a prime is diviasible by 1 and itself
public class q10 {
    // check prime
    static void isPrime() {
        int n = 7;
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("prime number");
        } else {
            System.out.println("not a prime number");
        }
    }

    // another way
    static void isNotPrime() {
        int n = 7;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("prime number");
        } else {
            System.out.println("not a prime number");
        }
    }

    public static void main(String[] args) {
        isPrime();
        isNotPrime();
    }
}
