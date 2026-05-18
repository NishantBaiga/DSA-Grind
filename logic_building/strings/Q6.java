package logic_building.strings;


// count vowel and consonant
public class Q6 {
    public static void main(String[] args) {
        String str = "Hello World!";
        int vowels = 0;
        int consonants = 0;

        // Convert to lowercase to handle both 'A' and 'a' easily
        String lowerStr = str.toLowerCase();

        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            // Check if it is a valid letter (to exclude spaces, numbers, and punctuation)
            else if (Character.isLetter(ch)) {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels); // Outputs: 3
        System.out.println("Consonants: " + consonants); // Outputs: 7

    }
}
