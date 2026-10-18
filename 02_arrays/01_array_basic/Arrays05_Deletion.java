

public class Arrays05_Deletion {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("original array");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        

        // delete element from end by making last element 0
        int lastElement = arr[arr.length - 1];
        arr[arr.length - 1] = 0;
        arr[arr.length - 1] = lastElement;

        System.out.println("\narray after deletion from end");
        for (int val : arr) {
            System.out.print(val + " ");
        }

        // delete elemnet from end by reducing size of array by 1 uing new array
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
        System.out.println("\narray after deletion from end by reducing size of array by 1");
        for (int val : newArr) {
            System.out.print(val + " ");
        }


        // delete element from end by reducing size of array without uisng new array

        
    }
}
