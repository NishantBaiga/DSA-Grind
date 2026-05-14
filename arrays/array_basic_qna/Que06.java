package arrays.array_basic_qna;


// count how many elements are even and odd
// find count of even or odd numbers
public class Que06 {
    public static void main(String[] args) {
        
        int []arr = {1,2,3,4,5,6,0,0,-9};

        int even = 0, odd = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("even count is :"+ even +"odd count is :"+ odd);
    }
}
