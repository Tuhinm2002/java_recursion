package arrayQuestions;

public class SortedArray2 {
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5};
        int len = arr.length;
        int i = 1;
        System.out.println(check(arr,i));
    }

    static boolean check(int[] arr,int i){

        if (arr.length-1 == i){
            return true;
        }
        return arr[i] < arr[i+1] && check(arr,i+1);
    }
}
