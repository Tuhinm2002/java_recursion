package arrayQuestions;

public class SortedArray {
    public static void main(String[] args) {

        int[] arr = new int[]{1,4,3,4,5};
        int len = arr.length;
        int i = 1;
        System.out.println(check(arr,arr[0],i));
    }

    static boolean check(int[] arr,int prev,int i){
        if(prev > arr[i]){
            return false;
        }
        if (arr.length-1 == i){
            return true;
        }
        prev = arr[i];
        return check(arr,prev,i+1);
    }
}
