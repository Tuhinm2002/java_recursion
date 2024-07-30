public class BinarySearch {
    public static void main(String[] args) {
        // variables required in future calls pass in arguments
        // variables don't required for future calls pass in body

        int[] arr = new int[]{1,2,3,4,5,6,7};
        int target = 6;
        int s = 0;
        int e = arr.length - 1;
        System.out.println(search(target,arr,s,e));
    }

    static int search(int target,int[] arr,int s,int e){

        if (s > e ){
            return -1;
        }

        int m = s + (e-s)/2;

        if (target == arr[m]){
            return m;
        }
        if (target > arr[m]){
            // If there is a return type of the function
            // then return the value using return keyword in function calls
            return search(target, arr, m+1, e);
        }

        return search(target, arr, 0,m-1);
    }
}
