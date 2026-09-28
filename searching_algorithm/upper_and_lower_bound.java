package searching_algorithm;

public class upper_and_lower_bound {
    static int lowerBound(int [] arr, int target){
        int n = arr.length;
        int left = 0, right= n-1;
        int ans = n;
        while(left<=right){
            int mid = left + ((right-left)/2);
            if(arr[mid]>=target){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans ;
    }

    static int upperBound(int [] arr, int target ){
         int n = arr.length;
        int left = 0, right= n-1;
        int ans = n;
        while(left<=right){
            int mid = left + ((right-left)/2);
            if(arr[mid]>target){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 4, 5, 7 };

        int target = 2;

        int lb = lowerBound(arr, target);
        int ub = upperBound(arr, target);

        System.out.println("Lower Bound: " + lb);
        System.out.println("Upper Bound: " + ub);
        System.out.println("Frequency: " + (ub - lb));
    }
}
