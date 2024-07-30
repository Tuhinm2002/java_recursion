package arrayQuestions;

public class RotatedBinarySEARCH {
    public static void main(String[] args) {

        int[] arr = new int[]{5,6,1,2,3,4};
        System.out.println(search(arr,4,0,arr.length-1));
    }

    static int search(int[] arr,int target,int s,int e){

        if(s > e){
            return -1;
        }

        int m = s + (e-s)/2;

        if(target == arr[m]){
            return m;
        }

        if(arr[s] <= arr[m]){
        if (target <= arr[m] && target >= arr[s]){
            // This is for internal division between the ranges
            return search(arr,target,s,m-1);
        }
        else {
            return search(arr, target, m + 1, e);
        }
    }
        if (arr[m] <= target && target <= arr[e]){
            // Second half
            return search(arr,target,m+1,e);
        }

        return search(arr,target,s,m-1);
    }
}
