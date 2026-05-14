package logic_building.conditional_thinking;

// take character and check weather it is uppercase , lowercase, digit ,special
public class Que9 {
    public static void main(String[] args) {
        int ch = 20;
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Number");
        } else {
            System.out.println("Special Character");
        }

    }
}
