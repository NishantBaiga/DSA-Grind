package logic_building.conditional_thinking;

// check if one of two number is given numbers is a multiple of other
public class Que13 {
    public static void main(String[] args) {
        int a = 2,  b=6;

        if(a%b==0){
            System.out.println("a is a multiple of b");
        } else if (b%a ==0) {
            System.out.println("b is a multiple of a");
        } else System.out.println("both are independent");
    }
}
