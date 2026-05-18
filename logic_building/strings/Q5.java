package logic_building.strings;


// ascii value
public class Q5 {
    public static void main(String[] args) {
        String str = "java";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            System.out.println(ascii);
        }
    }
}
