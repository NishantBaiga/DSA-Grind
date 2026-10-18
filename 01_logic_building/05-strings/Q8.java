// count uppper and lower case character
public class Q8 {
    public static void main(String[] args) {
        String str = "Java Programming 2026!";
        int upperCase = 0;
        int lowerCase = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check for uppercase letters (A-Z)
            if (ch >= 'A' && ch <= 'Z') {
                upperCase++;
            }
            // Check for lowercase letters (a-z)
            else if (ch >= 'a' && ch <= 'z') {
                lowerCase++;
            }
            // Numbers, spaces, and special characters are automatically ignored
        }

        System.out.println("Uppercase letters: " + upperCase); // Outputs: 2 (J, P)
        System.out.println("Lowercase letters: " + lowerCase); // Outputs: 13

    }
}
