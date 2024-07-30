package arrayQuestions;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,4,3,4,5};
        int len = arr.length;
        System.out.println(search(arr,5,0));
    }

    static int search(int[] arr,int target,int i){
        if (target == arr[i]){
            return i;
        }
        if (arr.length -1 == i){
            return -1;
        }

        return search(arr,target,i+1);
    }
}
