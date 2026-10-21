
// check if number is leap year or not
public class que5 {
    public static void main(String[] args) {
        
        int n = 2001;
        if (n%4==0 && n%100!=0 || n%400==0) {
            System.out.println("year is leap year ");
        }else System.out.println("year is not leap ");
    }
}
