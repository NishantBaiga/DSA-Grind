
// take marks and print marks 
public class que12 {
    public static void main(String[] args) {
        int marks = 99;
        if (marks > 100 || marks < 0) System.out.println("invalid num");

        if (marks <= 100 && marks >= 90) {
            System.out.println("A");
        } else if (marks > 70 && marks < 90) {
            System.out.println("B");
        } else if (marks > 50 && marks < 70) {
            System.out.println("C");
        } else if (marks > 35 && marks < 50) {
            System.out.println("D");
        } else if (marks < 35 && marks > 0) {
            System.out.println("fail");

        }
    }
}