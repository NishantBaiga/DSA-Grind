// compare lexicographically
public class Q4 {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";

        int result = str1.compareTo(str2);
        int result2 = str1.compareToIgnoreCase(str2); // Returns 0 (they are treated as equal)
    }
}
