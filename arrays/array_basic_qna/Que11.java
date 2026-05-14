package arrays.array_basic_qna;


// find the first element occures in array 
// same as to get last index loop backward
public class Que11 {
    public static void main(String[] args) {
        int [] arr  = {1,2,34,1,4,2,5};
        int n =2;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==n) {
            index = i;
            break;
            }
        }

        if (index != -1) {
            System.out.println(index);
        }else{
            System.out.println("not found");
        }
    }
}
