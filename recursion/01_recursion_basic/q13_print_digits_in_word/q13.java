
public class q13 {
    public static void printDigitsInWords(int n) {

        String[] words = {"Zero", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine"};

        if (n < 0) {
            System.out.print("Minus");
            n = -n;
        }

        if (n < 10) {
            System.out.println(words[n]);
            return;
        }

        printDigitsInWords(n/10);
        System.out.println(words[n%10]);

    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println("The digits of " + n + " in words: ");
        printDigitsInWords(n);
    }
}
