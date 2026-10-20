// count number of digit
public class q7 {
   public static int countDigit(int num){
      if (num <0) {
         num= Math.abs(num);
      }

      if (num < 10) {
         return  1; 
      }
      return 1 + countDigit(num/10);
   }
   public static void main (String [] args){
      // given num
      // work count 
      // base case if negative digit and single digit mean divide by 10

      int a = countDigit(123);
      System.out.println(a);
   } 
}
