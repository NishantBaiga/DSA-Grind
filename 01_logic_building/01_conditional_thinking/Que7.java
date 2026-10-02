package logic_building.conditional_thinking;


// take three number and print largest num
public class Que7 {
    public static void main(String[] args) {
        int a=1,  b=2, c=3;

        if(a>=b && a>=c ){
            System.out.println("a is largest ");
        }else if (b>=a && b>=c){
            System.out.println("b is largest");
        } else System.out.print("c is largest ");
    }
}
