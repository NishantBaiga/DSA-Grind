// find the product of digits of a number 
public class q10 {

    public  static int digitProduct (int n , int pro){
        if (n == 0) {
            return pro;
        }

        int lastDigit = n%10;
        pro = pro * lastDigit;

       int a =  digitProduct(n/10,pro);
       return a ;
    }
    public static void main(String[] args) {
        // give n 
        // work product , firts we have to extract digit n%10 and then multiply and remove 
        // base case n == 0 return product

        int n = 123 ;

       int ans =  digitProduct(n,1);
       System.out.println(ans);
    }
}
