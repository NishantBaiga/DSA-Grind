
// take temprature value and print "warm ", "cold", "hot"  using range condtion
public class que8 {
    public static void main(String[] args) {
        int temp = 40;

        if (temp > 15) {
            System.out.println("warm");
        } else if (temp < 30) {
            System.out.println("hot");
        } else if (15 <= temp &&  temp <=30) {
            System.out.println("warm");
        }
    }
}
