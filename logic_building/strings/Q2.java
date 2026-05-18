package logic_building.strings;

// count the word
public class Q2 {
    public static void main(String[] args) {

        String sentence = "hello my name is jimmy. ";


        // trim() removes whitespace from both ends of a string. It cuts spaces, tabs, and newline characters at the very beginning and very end. Ignored: It does not touch spaces between words.
        
        //The split() method breaks a string into an array of smaller strings based on a delimiter you choose. It looks for a specific character or pattern (called a regular expression). Action: It cuts the string at every match, removes the delimiter, and stores the pieces in an array.
        String[] word = sentence.trim().split("\\s+");

        System.out.println(word.length);
    }
}
