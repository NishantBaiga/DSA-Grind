package logic_building.strings;


// count letter , digit and specialChars
public class Q7 {
    public static void main(String[] args) {
        String str = "Java 123 #$%";
        int letters = 0;
        int digits = 0;
        int specialChars = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                // ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))  without function
                letters++;
            } else if (Character.isDigit(ch)) {
                // (ch >= '0' && ch <= '9') 
                digits++;
            } else {
                specialChars++; // Counts spaces, punctuation, and symbols
            }
        }

        System.out.println("Letters: " + letters); // Outputs: 4
        System.out.println("Digits: " + digits); // Outputs: 3
        System.out.println("Special Characters: " + specialChars); // Outputs: 5

    }
}
