package arrays.array_basic;

public class Arrays04_Insertion {
    public static void main(String[] args) {

        // inserting new element when array is full
        // we can do this by creating new array of size bigger than original and copy
        // elements from original to new.
        // we can insert element at start or end .
        // we can use build in Arrays.copyof() method to create new array.
        // question can be made using this , insert element, at start , end , at
        // Specific index.
        // other question insert element from one end and remove from other end , insert
        // element in front and remove from end and vice versa.

       /*  
        int []arr = {1,2,3,4,5};
        int newValue=6;

        int [] newArr= new int[arr.length + 1];

        for(int i=0; i<arr.length; i++){
        newArr[i]=arr[i];
        };
        newArr[arr.length]=newValue;

        System.out.println("original arr");
        for(int val : arr){
        System.out.print(val +" ");
        };
        System.out.println("new arr");
        for(int val : newArr){
        System.out.print(val +" ");
        };
        */


        // when array is fixed and space is available
        // we can insert element at end, at start , at Specific index.
        int[] arr2 = new int[5];
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;

        System.out.println("original array");
        for (int val : arr2) {
            System.out.print(val);
        }

        int size = 3;
        int newValue = 4;

        if (size == arr2.length) {
            System.out.println("array is full");
        } else {
            arr2[size] = newValue;
            size++;

        }

        System.out.println("");
        System.out.println("new array");
        for (int val : arr2) {
            System.out.print(val);
        }

    }

}
