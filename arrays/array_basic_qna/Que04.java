package arrays.array_basic_qna;


//find the maximum and min element in array
public class Que04 {
    public static void main(String[] args) {
        
        int [] arr = {30,1,2,3,1,39,100 };

        int max =0;
        int min =arr[0];
        for(int i=0; i<arr.length; i++){
            if (arr[i]>max) {
                max = arr[i];
            }else if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("max is :"+ max + "" +"min is :" + min);
    }
}
